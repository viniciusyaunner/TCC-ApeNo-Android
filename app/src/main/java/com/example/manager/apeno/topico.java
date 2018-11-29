package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class topico extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_topico);
        Button voltartopsoft = (Button) findViewById(R.id.voltartopsoft);
        voltartopsoft.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocatops = new Intent(topico.this, softwa.class);
                topico.this.startActivity(trocatops);
                topico.this.finish();
            }
        });
    }
}
