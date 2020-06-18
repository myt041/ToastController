package com.myt.toastcontrollerlib

import android.content.Context
import android.widget.Toast

open class DebugToast {

    companion object{

        fun print(c : Context, msg : String){
            Toast.makeText(c,msg,Toast.LENGTH_SHORT).show()
        }
    }
}