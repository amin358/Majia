package com.example.majiatest

import android.app.Activity
import android.os.Bundle
import android.view.View


open class DemoActivity : Activity() {

    var tv_test:View?=null ;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_demo)
    }



}