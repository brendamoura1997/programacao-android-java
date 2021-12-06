package com.brenda.toggleswitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private ToggleButton toggleSenha;
    private Switch switchSenha;
    private TextView textResultado;
    private CheckBox checkTermosDeUso;

    //public String x = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        toggleSenha = findViewById(R.id.toggleSenha);
        switchSenha = findViewById(R.id.switchSenha);
        textResultado = findViewById(R.id.textResultado);
        checkTermosDeUso = findViewById(R.id.checkTermosDeUso);

        checked();

    }


    public void checked(){


        switchSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {

            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                String x ="";
                if(isChecked) {
                    x = "Switch ligado";
                    textResultado.setText(x);
                }else{
                    x = "Switch desligado";
                    textResultado.setText(x);
                }


            }
        });

        toggleSenha.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                String x = "";
                if(toggleSenha.isChecked()){
                    x = x + "  || Toggle ligado";
                    textResultado.setText(x);
                }else{
                    x = x + " || Toggle desligado";
                    textResultado.setText(x);
                }
            }
        });


    }

    public void enviar(View view){

        //switchSenha.setOnCheckedChangeListener(new );


        if(switchSenha.isChecked()){
            textResultado.setText("Switch ligado");
        }else{
            textResultado.setText("Switch desligado");
        }

        if(toggleSenha.isChecked()){
            textResultado.setText("Toggle ligado");
        }else{
            textResultado.setText("Toggle desligado");
        }

        if(checkTermosDeUso.isChecked()){

        }else{
            textResultado.setText("VOCÊ DEVE CONCORDAR COM OS TERMOS DE USO PARA CONTINUAR");
        }

    }

}
