package com.edwar.ec3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.edwar.ec3.Fragments.AnimeListFragment
import com.edwar.ec3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val navHostFragment = supportFragmentManager.findFragmentById(R.id.fcv_anime) as NavHostFragment
        val navController = navHostFragment.navController
        binding.bnvMenu.setupWithNavController(navController)

        /*
        binding.bnvMenu.setOnItemSelectedListener{ item ->
            when (item.itemId) {
                R.id.item_anime_list -> {
                    binding.txtHello.text = "coupon list"
                    supportFragmentManager.beginTransaction().add(AnimeListFragment(),"").commit()
                    true
                }
                R.id.item_anime_favorite -> {
                    binding.txtHello.text = "favorite"
                    true
                }
                R.id.item_info -> {
                    binding.txtHello.text = "info"
                    true
                }
                else -> {
                    binding.txtHello.text = "error"
                    false
                }
            }
        }
    */
    }
}