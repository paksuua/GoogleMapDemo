package com.example.googlemapdemo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupWithNavController
import com.example.googlemapdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    private lateinit var navHostFragment: NavHostFragment
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initNavigationBar()
    }

    private fun initNavigationBar() {
        navHostFragment =
            supportFragmentManager.findFragmentById(R.id.fcv_main) as NavHostFragment
        navController = navHostFragment.navController
//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            if (destination.id == R.id.navigation_post) {
//                binding.btnvView.visibility = View.GONE
//            } else {
//                binding.btnvView.visibility = View.VISIBLE
//            }
//        }

        binding.btnvView.setupWithNavController(navController)
        binding.btnvView.itemIconTintList = null
    }
}
