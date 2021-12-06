package com.brenda.atm_consultoria.ui.sobre;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.brenda.atm_consultoria.R;

import mehdi.sakout.aboutpage.AboutPage;
import mehdi.sakout.aboutpage.Element;

public class SobreFragment extends Fragment {


    public SobreFragment(){

    }

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        /*LinearLayout linearLayout;

        linearLayout = getView().findViewById(R.id.linearLayout);

        linearLayout.setBackgroundColor(getResources().getColor(R.color.white));*/

        //permite acessar uma activity. Se eu estivesse dentro da ActivityMain.class poderia passar apenas
        // o this

        String descricao = "A ATM Consultoria tem como missão apoiar organizações "+
                "que desejam alcançar o sucesso através da excelência em gestão e "+
                "da busca pela qualidade.";

        Element versao = new Element();
        versao.setTitle("Versão 1.0");



        return new AboutPage(getActivity())
                .setImage(R.drawable.logo)
                .setDescription(descricao)


                .addGroup("Entre em contato")
                .addEmail("atendimento@atmconsultoria.com.br", "Envie um e-mail")
                .addWebsite("https://www.google.com","Acesse nosso site")


                .addGroup("Redes sociais")
                .addFacebook("brenda.moura.90","Facebook")
                .addInstagram("owltion","Instagram")
                .addTwitter("siberiarabesque","Twitter")
                .addYoutube("MouraBee","Youtube")
                .addGitHub("","GitHub")
                .addPlayStore("com.jdpapps.wordsearch","Download App")

                .addItem(versao)


                .create();




        //return inflater.inflate(R.layout.fragment_sobre, container, false) ;
    }
}