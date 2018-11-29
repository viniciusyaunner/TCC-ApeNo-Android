package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        Button empre = (Button) findViewById(R.id.empre);
        empre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocaem = new Intent(Menu.this, empresa.class);
                Menu.this.startActivity(trocaem);
                Menu.this.finish();
            }
        });
        Button soft = (Button) findViewById(R.id.soft);
        soft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocasoft = new Intent(Menu.this, softwa.class);
                Menu.this.startActivity(trocasoft);
                Menu.this.finish();
            }
        });
        Button sob = (Button) findViewById(R.id.sob);
        sob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocasob = new Intent(Menu.this, sobre.class);
                Menu.this.startActivity(trocasob);
                Menu.this.finish();
            }
        });
    }
}
