package com.rinat.aston_intensiv_4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rinat.aston_intensiv_4.FullscreenFragment.Companion.FIRST_FRAGMENT_TAG

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val fragment = supportFragmentManager.findFragmentByTag(FIRST_FRAGMENT_TAG)
        val fragment1 = supportFragmentManager.findFragmentById(R.id.fragment_container)

    }
}