package com.myt.toastcontroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.myt.toastcontrollerlib.DebugToast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DebugToast.print(this, "Hello")
    }
}