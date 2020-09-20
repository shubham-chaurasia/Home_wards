package com.example.splash.dashboard;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ButtonBarLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import com.example.splash.R;
import com.example.splash.locationOwner.DashboardFragment;
import com.example.splash.locationOwner.ManageFragment;
import com.example.splash.locationOwner.ProfileFragment;
import com.ismaeldivita.chipnavigation.ChipNavigationBar;

public class Tab1 extends AppCompatActivity {

    ChipNavigationBar chipNavigationBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab1);

        chipNavigationBar = findViewById(R.id.bottom_nav_menu);
        getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,new  DashboardFragment()).commit();

        bottomMenu();
    }

    private void bottomMenu() {

        chipNavigationBar.setOnItemSelectedListener(new ChipNavigationBar.OnItemSelectedListener() {
            @Override
            public void onItemSelected(int i) {

                Fragment fragment = null;
                switch (i) {

                    case R.id.bottom_nav_dashboard:
                        fragment = new DashboardFragment();
                        break;

                    case R.id.bottom_nav_manage:
                        fragment = new ManageFragment();
                        break;

                    case R.id.bottom_nav_profile:
                        fragment = new ProfileFragment();
                        break;
                }
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,fragment).commit();

            }

        });

    }

}
