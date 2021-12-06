package com.brenda.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){

        //Instanciar AlertDialog
        AlertDialog.Builder dialog = new AlertDialog.Builder(this);
        //ImageView imagem = new ImageView(this);
        //imagem.setImageResource(android.R.drawable.star_big_on);

        //Configurar título e mensagem
        //dialog.setView(imagem);
        dialog.setTitle("Título da Dialog");
        dialog.setMessage("Mensagem da Dialog");

        //Configurar cancelamento
        dialog.setCancelable(false);

        //Configurar ícone
        dialog.setIcon(android.R.drawable.ic_btn_speak_now);
        //dialog.setView(android.R.drawable.ic_btn_speak_now);


        //Configura ações para sim e não
        dialog.setPositiveButton("sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Execução SIM", Toast.LENGTH_SHORT).show();
            }
        });

        dialog.setNegativeButton("não", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(getApplicationContext(), "Execução NÃO", Toast.LENGTH_SHORT).show();
            }
        });

        //Criar e exibir a Diaolog
        dialog.create();
        dialog.show();
    }
}





