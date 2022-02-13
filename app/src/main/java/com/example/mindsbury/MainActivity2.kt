package com.example.mindsbury

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        var nav=findViewById<BottomNavigationView>(R.id.nav)

        val firstFragment=HomeFragment()
        val secondFragment=YogaFragment()
        val thirdFragment=MusicFragment()
        val fourthFragment=TrackerFragment()
        val fifthFragment=HeartFragment()

        setCurrentFragment(firstFragment)
        nav.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.home->setCurrentFragment(firstFragment)
                R.id.Yoga->setCurrentFragment(secondFragment)
                R.id.Music->setCurrentFragment(thirdFragment)
                R.id.Tracker->setCurrentFragment(fourthFragment)
                R.id.Heart->setCurrentFragment(fifthFragment)

            }
            true

        }


    }


    private fun setCurrentFragment(fragment: Fragment)=
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment,fragment)
            commit()
        }
    }
