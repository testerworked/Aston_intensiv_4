package com.example.myapplication

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.TextView
import androidx.annotation.IdRes
import com.example.myapplication.BlankFragment.Companion.FIRST_FRAGMENT_TAG
import kotlin.concurrent.thread

class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val buttonCheck by find<Button>(R.id.buttonFragment)
    private val textHello by find<TextView>(R.id.textHello)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)



        val fragment = supportFragmentManager.findFragmentByTag(FIRST_FRAGMENT_TAG)
        val fragment1 = supportFragmentManager.findFragmentById(R.id.fragment_container_view)

        buttonCheck.setOnClickListener {
            thread {
                Thread.sleep(1000)
                runOnUiThread {
                    if (fragment == null) {
                        buttonCheck.visibility = View.GONE
                        textHello.visibility = View.GONE
                        supportFragmentManager.beginTransaction()
                            .replace(R.id.fragment_container_view, BlankFragment.getInstance(), FIRST_FRAGMENT_TAG)
                            .commit()
                    }
                }
            }
        }

    }

    fun <T> View.find(@IdRes idRes: Int): Lazy<T> {
        return lazy { findViewById(idRes) }
    }

    fun <T> Activity.find(@IdRes idRes: Int): Lazy<T> {
        return lazy { findViewById(idRes) }
    }

}