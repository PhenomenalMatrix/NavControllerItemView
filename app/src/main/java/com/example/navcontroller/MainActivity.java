package com.example.navcontroller;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private NavController navController;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initNavigation();
    }

    private void initNavigation() {
        bottomNavigationView = findViewById(R.id.bottomNav);
        AppBarConfiguration appBar = new AppBarConfiguration.Builder(
                R.id.firstFragment, R.id.secondFragment, R.id.thirdFragment).build();
        navController = Navigation.findNavController(this,R.id.main_container);
        NavigationUI.setupWithNavController(bottomNavigationView,navController);
        NavigationUI.setupActionBarWithNavController(this,navController,appBar);
    }
}