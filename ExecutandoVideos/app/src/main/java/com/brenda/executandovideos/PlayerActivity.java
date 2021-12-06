package com.brenda.executandovideos;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class PlayerActivity extends AppCompatActivity {

    private VideoView videoView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_player);

        videoView = findViewById(R.id.videoView);

        //ACESSAR EM FULLSCREEN : ESCONDE A STATUSBAR E BARRA DE NAVEGAÇÃO
        //getWindow recupera o objeto de tela e o getDecorView recupera o objeto que nos permite manipular
        //componente de tela
        View decorView = getWindow().getDecorView();
        int uiOpcoes = View.SYSTEM_UI_FLAG_FULLSCREEN | View.SYSTEM_UI_FLAG_HIDE_NAVIGATION;
        decorView.setSystemUiVisibility(uiOpcoes);

        //ESCONDER ACTION BAR
        getSupportActionBar().hide();

        //Executar vídeo
        videoView.setMediaController(new MediaController(this));
        //caso voc~e queira executar um vídeo a partir de um site específico URI

        videoView.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.video);
        videoView.start();



    }
}
