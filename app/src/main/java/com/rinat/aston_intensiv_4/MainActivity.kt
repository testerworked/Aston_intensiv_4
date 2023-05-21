package com.rinat.aston_intensiv_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity(R.layout.activity_main) {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        val fragment = supportFragmentManager.findFragmentByTag(FIRST_FRAGMENT_TAG)

    }
}