package com.reddit.uicomponents.components

import android.graphics.*
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.annotation.RequiresApi

class CustomDrawable(
    val customShadow: Boolean,
    val blurRadius: Int,
    val offsetX: Int,
    val offsetY: Int,
    val cornerRadius: Float,
    val customBg: Boolean,
    val mainColor: Int,
    val shadowColor: Int,
    val isBorder: Boolean,
    val borderColor: Int,
    val borderWidth: Float

) : Drawable() {
    var paint: Paint
    private val blurMaskFilter = BlurMaskFilter(
        blurRadius.toFloat() /* shadowRadius */,
        BlurMaskFilter.Blur.NORMAL
    )

    init {
        paint = Paint(Paint.ANTI_ALIAS_FLAG)
        paint.style = Paint.Style.FILL
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun draw(canvas: Canvas) {
        val height = bounds.height()
        val width = bounds.width()
        paint.color = mainColor
        paint.maskFilter = null
        if (customBg) {
            canvas.drawRoundRect(
                0f,
                0f,
                width.toFloat(),
                height.toFloat(),
                cornerRadius,
                cornerRadius,
                paint
            )
        }

        if (isBorder) {
            paint.color = borderColor
            paint.style = Paint.Style.STROKE
            paint.strokeWidth = borderWidth
            canvas.drawRoundRect(
                0f,
                0f,
                width.toFloat(),
                height.toFloat(),
                cornerRadius,
                cornerRadius,
                paint
            )


        }
        paint.color = shadowColor
        paint.maskFilter = blurMaskFilter
        paint.style = Paint.Style.FILL
        if (customShadow && Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            canvas.withClipOut(
                0f,
                0f,
                width.toFloat(),
                height.toFloat(),
                cornerRadius
            ) {

                canvas.drawRoundRect(
                    0f + offsetX.toFloat(),
                    0f + offsetY.toFloat(),
                    width.toFloat() + offsetX.toFloat(),
                    height.toFloat() + offsetY.toFloat(),
                    cornerRadius,
                    cornerRadius,
                    paint
                )
            }
        }


    }


    override fun isStateful() = false

    override fun setAlpha(alpha: Int) {}

    override fun getOpacity() = PixelFormat.OPAQUE

    override fun setColorFilter(colorFilter: ColorFilter?) {}
}

/**
 * clips everything inside the rect.
 */
@RequiresApi(Build.VERSION_CODES.O)
inline fun Canvas.withClipOut(
    left: Float,
    top: Float,
    right: Float,
    bottom: Float,
    radius: Float,
    block: Canvas.() -> Unit
) {
    val path = Path()
    path.addRoundRect(left, top, right, bottom, radius, radius, Path.Direction.CW)
    val checkpoint = save()
    clipOutPath(path)
    try {
        block()
    } finally {
        restoreToCount(checkpoint)
    }
}

