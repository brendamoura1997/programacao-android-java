package com.brenda.atm_consultoria;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import android.util.Log;
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

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                enviarEmail();
            }
        });

        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_principal, R.id.nav_servicos, R.id.nav_clientes,
                R.id.nav_contato, R.id.nav_sobre)
                .setDrawerLayout(drawer)
                .build();

        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);

        try {
            NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        }catch (NullPointerException e){
            Log.d("deuNull","CAIU NO NULL");
        }


        NavigationUI.setupWithNavController(navigationView, navController);
    }

    public void enviarEmail(){

        String celular = "tel:11996352864";
        String imagem = "https://compass-ssl.xbox.com/assets/ab/69/ab693a71-85c8-4ecc-b7e7-0d86f78810ce.jpg?n=X1-Wireless-Controller-Red_gallery_1056x594_01.jpg";
        String endereco = "https://www.google.com/maps/place/Parque+Ibirapuera/@-23.5874113,-46.6598223,17z/data=!3m1!4b1!4m5!3m4!1s0x94ce59f1069d11d1:0xcb936109af9ce541!8m2!3d-23.5874162!4d-46.6576336";

        //Intent intent = new Intent( Intent.ACTION_VIEW, Uri.parse(endereco));

        Intent intent = new Intent( Intent.ACTION_SEND);
        intent.putExtra(Intent.EXTRA_EMAIL, new String[]{"atendimento@atmconsultoria"});
        intent.putExtra(Intent.EXTRA_SUBJECT, "Contato pelo APP");
        intent.putExtra(Intent.EXTRA_TEXT, "Mensagem automática");
//        intent.setType("message/rfc822"); //tipo de dado que quero compartilhar, se quero uma imagem escreva image
        //intent.setType("text/plain");
        intent.setType("image/*");
        startActivity(Intent.createChooser(intent,"compartilhar")); //Chooser: a aprtir de uma intent escolhe alguns apps que podem atender à intent
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }
}
