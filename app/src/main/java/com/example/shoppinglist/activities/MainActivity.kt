package com.example.shoppinglist.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.shoppinglist.R
import com.example.shoppinglist.databinding.ActivityMainBinding
import com.example.shoppinglist.fragments.FragmentManager
import com.example.shoppinglist.fragments.NoteFragment


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setBottomNavListener()
    }
    private fun setBottomNavListener() {
        binding.bNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.settings -> {
                    Log.d ("MyLog", "settings")
                }
                R.id.notes -> {
                    FragmentManager.setFragment(NoteFragment.newInstance(),
                        this
                    )

                }
                R.id.shop_list -> {
                    Log.d ("MyLog", "shop_list")
                }
                R.id.new_item -> {
                    Log.d ("MyLog", "new_item")
                }
            }
            true
        }

    }
}