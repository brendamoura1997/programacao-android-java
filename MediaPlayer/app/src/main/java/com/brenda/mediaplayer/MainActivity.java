package com.brenda.mediaplayer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.media.AudioManager;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity {
    private MediaPlayer mediaPlayer;
    private SeekBar seekVolume;
    private AudioManager audioManager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        /*MÉTODO CREATE JÁ RECEBE DOIS PARÂMETROS PARA RETORNAR O OBJETO CONFIGURADO:*/

        mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bach);

        inicializarSeekBar();

    }

    private void inicializarSeekBar(){
        seekVolume = findViewById(R.id.seekVolume);

        //CONFIGURA O ÁUDIO MANAGER

        //com o getSystemService você consegue recuperar alguns serviços do sistema
        audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);


        //RECUPERANDO OS VALORES DE VOLUME MÁXIMO E O VOLUME ATUAL
        int volumeMaximo = audioManager.getStreamMaxVolume(AudioManager.STREAM_MUSIC);
        int volumeAtual = audioManager.getStreamVolume(AudioManager.STREAM_MUSIC);


        //CONFIGURAR OS VALORES MÁXIMOS PARA O SEEKBR
        seekVolume.setMax(volumeMaximo);
        Log.d("teste","Volume Máximo= "+volumeMaximo);

        //CONFIGURA O PROGRESSO ATUAL DO SEEKBAR
        seekVolume.setProgress(volumeAtual);
        Log.d("teste","Volume Atual= "+volumeAtual);

        seekVolume.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                // INNDICE DO VOLUME QU4E ESTÁ SENDO MODIFICADO
                //
                audioManager.setStreamVolume(AudioManager.STREAM_MUSIC, progress, AudioManager.FLAG_SHOW_UI );
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }

    public void executarSom(View view){
        //Só vou executar uma música se o objeto mediaPlayer já tiver sido configurado
        if(mediaPlayer != null){
            mediaPlayer.start();
        }
    }

    public void pausarSom(View view){
        //Verifica se a música está executando
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }

    public void pararSom(View view){
        //Só vou executar uma música se o objeto mediaPlayer já tiver sido configurado
        if(mediaPlayer.isPlaying()){
            mediaPlayer.stop();
            mediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.bach);
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();

        if(mediaPlayer != null && mediaPlayer.isPlaying()){
            //CONFIGURAÇÕES PARA ECONOMICAR RECURSOS DO USUÁRIO
            mediaPlayer.stop();

            //libera recursos de mídia que estejam executando com a classe media player
            /*Essa música foi colocada na memória do celular. Ela vai estar lá disponível para quando
            * o usuário quiser executar. O RELEASE remove todos esses recursos de memória.
            * Nós não queremos deixar na memória uma música pesada sendo que nós não vamos utilizá-la*/
            mediaPlayer.release();
            mediaPlayer = null; //para não ocupar espaço de memória do mediaPlayer
        }

    }

    @Override
    protected void onStop() {
        super.onStop();
        if(mediaPlayer.isPlaying()){
            mediaPlayer.pause();
        }
    }
}
