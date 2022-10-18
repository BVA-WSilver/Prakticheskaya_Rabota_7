package com.gwsilver.prakticheskaya_rabota_7


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun OnClick(view: View){

        when (view.id) {

           R.id.button -> supportFragmentManager.beginTransaction().
           replace(R.id.fr_zone, Fragment_One.newInstance()).commit()

           R.id.button2 -> supportFragmentManager.beginTransaction().
           replace(R.id.fr_zone, Fragment_Two.newInstance()).commit()
       }
    }
}