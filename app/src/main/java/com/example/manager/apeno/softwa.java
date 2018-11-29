package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class softwa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_softwa);
        Button cad = (Button) findViewById(R.id.cad);
        cad.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocacad = new Intent(softwa.this, cadastro.class);
                softwa.this.startActivity(trocacad);
                softwa.this.finish();
            }
        });
        Button button6 = (Button) findViewById(R.id.voltartopsoft);
        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocatop = new Intent(softwa.this, topico.class);
                softwa.this.startActivity(trocatop);
                softwa.this.finish();
            }
        });
        Button repo = (Button) findViewById(R.id.repo);
        repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarepo = new Intent(softwa.this, report.class);
                softwa.this.startActivity(trocarepo);
                softwa.this.finish();
            }
        });
        Button consu = (Button) findViewById(R.id.consu);
        consu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocaconsu = new Intent(softwa.this, consulta.class);
                softwa.this.startActivity(trocaconsu);
                softwa.this.finish();
            }
        });
        Button rela = (Button) findViewById(R.id.rela);
        rela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocarela = new Intent(softwa.this, relatorio.class);
                softwa.this.startActivity(trocarela);
                softwa.this.finish();
            }
        });
        Button log = (Button) findViewById(R.id.log);
        log.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocalog = new Intent(softwa.this, login.class);
                softwa.this.startActivity(trocalog);
                softwa.this.finish();
            }
        });
        Button voltarsoft = (Button) findViewById(R.id.voltarsoft);
        voltarsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocavoltarsoft = new Intent(softwa.this, Menu.class);
                softwa.this.startActivity(trocavoltarsoft);
                softwa.this.finish();
            }
        });
    }
}
