package com.android.redditdemo.ui

import android.os.Bundle
import com.android.redditdemo.databinding.ActivityMainBinding
import com.android.redditdemo.utils.*
import com.android.redditdemo.viewModel.MainViewModel
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var loader: LoadingDialog

    @Inject
    lateinit var mainViewModel: MainViewModel

    private lateinit var binding: ActivityMainBinding

    private val controller by lazy { MainController(this) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initUi()
        observeLiveData()
    }

    private fun initUi(){
        binding.mainRecycler.setController(controller)
    }
    private fun observeLiveData() {
        mainViewModel.loadingEvent.observe(this) {
            showLoading(it)
        }
        mainViewModel.getDataLvData.observe(this) {
            controller.data = it
        }
        mainViewModel.getData()
    }


    private fun showLoading(event: UIEvents) {
        when (event) {
            is ShowLoading -> {
                if (event.show) {
                    loader.show(supportFragmentManager, null)
                } else {
                    loader.dismiss()
                }
            }
            is ShowToast -> {
                showToast(event.resId)
            }

        }
    }
}