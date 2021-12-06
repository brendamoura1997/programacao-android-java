package com.brenda.cardview.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import com.brenda.cardview.R;
import com.brenda.cardview.adapter.PostagemAdapter;
import com.brenda.cardview.model.Postagem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerPostagem;
    private List<Postagem> postagens = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerPostagem = findViewById(R.id.recyclerView);


        //DEFINIR LAYOUT
        //LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        //layoutManager.setOrientation(LinearLayoutManager.HORIZONTAL);

        RecyclerView.LayoutManager layoutManager = new GridLayoutManager(this, 2);

        recyclerPostagem.setLayoutManager(layoutManager);


        prepararPostagem();

        PostagemAdapter adapter = new PostagemAdapter(postagens);


        //DEFINIR ADAPTER
        recyclerPostagem.setAdapter(adapter);


    }

    private void prepararPostagem(){
        Postagem p = new Postagem("MAYCON MIRACHI","FUI E GOSTEI",R.drawable.imagem1);
        this.postagens.add(p);

        p = new Postagem("SALOMON ABASTO MACIAS","INTERESSANTE",R.drawable.imagem2);
        this.postagens.add(p);

        p = new Postagem("LUAN BRUNO MELO CONCEIÇÃO","SEI LÁ, ESPERAVA MAIS",R.drawable.imagem3);
        this.postagens.add(p);

        p = new Postagem("BRENDA MOURA","ALGUÉM ME MATA",R.drawable.imagem4);
        this.postagens.add(p);
    }


}
