package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Button voltarfologi = (Button) findViewById(R.id.voltarfologi);
        voltarfologi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocasoftco = new Intent(login.this, softwa.class);
                login.this.startActivity(trocasoftco);
                login.this.finish();
            }
        });
    }
}
