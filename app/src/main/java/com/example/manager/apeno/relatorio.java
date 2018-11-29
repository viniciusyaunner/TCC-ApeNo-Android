package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class relatorio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relatorio);
        Button voltarrela = (Button) findViewById(R.id.voltarrela);
        voltarrela.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocasres = new Intent(relatorio.this, softwa.class);
                relatorio.this.startActivity(trocasres);
                relatorio.this.finish();
            }
        });
    }
}
