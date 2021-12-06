package com.brenda.navigationdrawer;

import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.navigation.NavigationView;

import androidx.drawerlayout.widget.DrawerLayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.view.Menu;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration mAppBarConfiguration;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CONFIGURA BARRA DE NAVEGAÇÃO
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        // CRIA REFERÊNCIA PARA TODA A ÁREA DO NAVIGATIONDRAWER
        DrawerLayout drawer = findViewById(R.id.drawer_layout);

        // CRIA REFERÊNCIA PARA A ÁREA DE NAVEGAÇÃO
        NavigationView navigationView = findViewById(R.id.nav_view);

        // DEFINE CONFIGURAÇÕES DO NAVIGATIONDRAWER
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home, R.id.nav_gallery, R.id.nav_slideshow,
                R.id.nav_share, R.id.nav_send, R.id.nav_contato)
                .setDrawerLayout(drawer)
                .build();

        // CONFIGURA ÁREA QUE IRÁ CARREGAR OS FRAGMENTS
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);


        // CONFIGURA MENU SUPERIOR DE NAVERGAÇÃO
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);

        // CONFIGURA A NAVEGAÇÃO PARA O NAVIGATIONVIEW
        NavigationUI.setupWithNavController(navigationView, navController);
    }



    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
