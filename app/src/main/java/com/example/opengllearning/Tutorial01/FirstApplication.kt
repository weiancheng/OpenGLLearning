package com.example.opengllearning.Tutorial01

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class FirstApplication: AppCompatActivity() {
    private val TAG = "FirstApplication"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i(TAG, "on create method calling native library")
        NativeLibrary.init()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onResume() {
        super.onResume()
    }
}
