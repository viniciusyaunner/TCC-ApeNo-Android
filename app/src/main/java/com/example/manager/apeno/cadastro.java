package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cadastro extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro);
        Button voltarcadso = (Button) findViewById(R.id.voltarcadso);
        voltarcadso.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocacadsoftware = new Intent(cadastro.this, softwa.class);
                cadastro.this.startActivity(trocacadsoftware);
                cadastro.this.finish();
            }
        });
    }
}
