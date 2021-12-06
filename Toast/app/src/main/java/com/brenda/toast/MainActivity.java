package com.brenda.toast;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void abrirToast(View view){

        ImageView imagem = new ImageView(getApplicationContext());
        imagem.setImageResource(android.R.drawable.star_big_on);

        TextView textView = new TextView(getApplicationContext());
        textView.setBackgroundResource(R.color.colorAccent);
        textView.setText("OLÁ TOAST :)");

        Toast toast = new Toast(getApplicationContext()); //ou this
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(textView);
        toast.show();

        /*Toast.makeText(
                getApplicationContext(),
                "Ação realisada com sucesso",
                Toast.LENGTH_LONG
        ).show();*/
    }

}
