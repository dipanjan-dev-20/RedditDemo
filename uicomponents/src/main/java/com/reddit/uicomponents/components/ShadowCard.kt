package com.reddit.uicomponents.components


import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.Drawable
import android.util.AttributeSet
import androidx.constraintlayout.widget.ConstraintLayout
import com.reddit.uicomponents.R

class ShadowCard @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : ConstraintLayout(context, attrs, defStyleAttr) {


    var mainColor: Int = Color.parseColor("#FFFFFF")
    var shadowColor: Int = Color.parseColor("#143C4852")
    var borderColor: Int = Color.parseColor("#F0F4F7")
    val customDrawable: Drawable

    // shadow properties
    var offsetX = 0
    var offsetY = 0
    var blurRadius = 8
    var cornerRadius = 0f
    var isBorder = false
    var borderWidth = 1f
    var customShadow = false
    var customBg = false


    init {

        context.theme.obtainStyledAttributes(
            attrs,
            R.styleable.ShadowCard,
            0,
            0
        ).apply {

            try {
                customShadow = getBoolean(R.styleable.ShadowCard_customShadow, false)
                offsetX = getInteger(R.styleable.ShadowCard_customShadowTranslationX, 0)
                offsetY = getInteger(R.styleable.ShadowCard_customShadowTranslationY, 0)
                blurRadius = getInteger(R.styleable.ShadowCard_customBlurRadius, 1)
                cornerRadius = getDimension(R.styleable.ShadowCard_customRadius, 0f)
                mainColor = getColor(R.styleable.ShadowCard_customBgColor, Color.WHITE)
                shadowColor =
                    getColor(R.styleable.ShadowCard_customShadowColor, Color.TRANSPARENT)
                customBg = getBoolean(R.styleable.ShadowCard_customBg, false)
                isBorder = getBoolean(R.styleable.ShadowCard_customBorder, false)
                borderColor = getColor(R.styleable.ShadowCard_customBorderColor, Color.WHITE)
                borderWidth = getDimension(R.styleable.ShadowCard_customBorderWidth, 1f)
                customDrawable = CustomDrawable(
                    customShadow,
                    blurRadius,
                    offsetX,
                    offsetY,
                    cornerRadius,
                    customBg,
                    mainColor,
                    shadowColor,
                    isBorder,
                    borderColor,
                    borderWidth
                )

            } finally {
                recycle()
            }
        }
    }

    override fun dispatchDraw(canvas: Canvas?) {
        super.dispatchDraw(canvas)
        this@ShadowCard.background = customDrawable

    }
}