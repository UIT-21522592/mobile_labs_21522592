package com.example.btth05_21522592;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Bai03 extends  AppCompatActivity{
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bai03);
        getSupportActionBar().hide();

        back = (Button) findViewById(R.id.btnBack);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent iNewActivity = new Intent(Bai03.this, MainActivity.class);
                startActivity(iNewActivity);

                overridePendingTransition(R.anim.anim_fade_in, R.anim.anim_fade_out);
            }
        });

    };
}
