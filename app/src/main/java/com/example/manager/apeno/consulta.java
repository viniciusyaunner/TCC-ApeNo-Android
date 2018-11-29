package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class consulta extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consulta);
        Button voltarconsus = (Button) findViewById(R.id.voltarconsus);
        voltarconsus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocaconsoft = new Intent(consulta.this, softwa.class);
                consulta.this.startActivity(trocaconsoft);
                consulta.this.finish();
            }
        });

    }
}
