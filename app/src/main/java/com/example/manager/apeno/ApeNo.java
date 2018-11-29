package com.example.manager.apeno;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ApeNo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apeno);
        Button init = (Button) findViewById(R.id.init);
        init.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent trocamenu = new Intent(ApeNo.this, Menu.class);
                ApeNo.this.startActivity(trocamenu);
                ApeNo.this.finish();
            }
        });

    }
}
