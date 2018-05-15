package com.example.a16022934.leagueinfo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button items;
    Button champions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        items = findViewById(R.id.btnItem);
        champions = findViewById(R.id.btnChamp);

        items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, List.class);
                i.putExtra("type", "items");
                startActivity(i);
            }
        });

        champions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, List.class);
                i.putExtra("type", "champions");
                startActivity(i);
            }
        });
    }
}
