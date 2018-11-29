package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class empresa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_empresa);
        Button voltarempre = (Button) findViewById(R.id.voltarempre);
        voltarempre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocaemp = new Intent(empresa.this, Menu.class);
                empresa.this.startActivity(trocaemp);
                empresa.this.finish();
            }
        });
    }
}
