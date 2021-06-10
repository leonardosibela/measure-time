package com.sibela.measuretime

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.measureTimeMillis

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        measureTimeMillis {
            setContentView(R.layout.activity_main)
        }.let { timeMillis ->
            print("It took $timeMillis milliseconds.")
        }
    }
}