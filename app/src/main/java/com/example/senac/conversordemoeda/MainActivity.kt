package com.example.senac.conversordemoeda

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostController = supportFragmentManager.findFragmentById(R.id.mainContainer) as NavHostFragment
        navController = navHostController.navController

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView2)
        setupWithNavController(bottomNavigationView, navController)
    }
}