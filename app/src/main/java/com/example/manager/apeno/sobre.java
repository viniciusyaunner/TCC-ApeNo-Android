package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class sobre extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
        Button voltarsob = (Button) findViewById(R.id.voltarsob);
        voltarsob.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocaemp = new Intent(sobre.this, Menu.class);
                sobre.this.startActivity(trocaemp);
                sobre.this.finish();
            }
        });
    }
}
