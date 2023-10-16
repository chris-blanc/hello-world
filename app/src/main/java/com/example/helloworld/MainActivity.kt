package com.example.helloworld

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Use logcat to see when lifecycle methods are called
        Log.i("TEST", "onCreate() initiated. Moving to onStart()")
    }
    override fun onStart() {
        super.onStart()
        Log.i("TEST", "onStart() initiated. Moving to onResume()")
    }
    override fun onResume() {
        super.onResume()
        Log.i("TEST", "onResume() initiated. Moving to onPause()")
    }
    override fun onPause() {
        super.onPause()
        Log.i("TEST", "onPause() initiated. Moving to either onResume() or onStop()")
    }
    override fun onStop() {
        super.onStop()
        Log.i("TEST", "onStop() initiated. Moving to onDestroy()")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.i("TEST", "onDestroy() initiated.")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        Log.i("TEST", "onSaveInstanceState() called.")
        outState.putString("myName", "Chris")
    }

}