package com.example.a16022934.leagueinfo;

import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ChampionDetails extends AppCompatActivity {

    ImageView ivChamp;
    TextView tvName;
    TextView tvSecondName;
    ImageButton ibPassive;
    ImageButton ibQ;
    ImageButton ibW;
    ImageButton ibE;
    ImageButton ibR;
    TextView tvSkillDesc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_champion_details);
        ivChamp = findViewById(R.id.ivChamp);
        tvName = findViewById(R.id.tvName);
        tvSecondName = findViewById(R.id.tvChampion2);
        ibPassive = findViewById(R.id.ibPassive);
        ibQ = findViewById(R.id.ibQ);
        ibW = findViewById(R.id.ibW);
        ibE = findViewById(R.id.ibE);
        ibR = findViewById(R.id.ibR);
        tvSkillDesc = findViewById(R.id.tvSkillDesc);
        final Champions selChamp = (Champions) getIntent().getSerializableExtra("champion");

        ivChamp.setImageResource(selChamp.getChampionImage());
        String name = " " + selChamp.getName();
        String secondName = " " + selChamp.getSecondName();
        tvName.setText(name);
        tvSecondName.setText(secondName);
        int[] skills = selChamp.getSkills();
        ibPassive.setImageResource(skills[0]);
            ibQ.setImageResource(skills[1]);
            ibW.setImageResource(skills[2]);
            ibE.setImageResource(skills[3]);
            ibR.setImageResource(skills[4]);

        String skill = selChamp.getSkillsDescription()[0];
        tvSkillDesc.setText(skill);

        ibPassive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSkillDesc.setText(selChamp.getSkillsDescription()[0]);
            }
        });

        ibQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSkillDesc.setText(selChamp.getSkillsDescription()[1]);
            }
        });

        ibW.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSkillDesc.setText(selChamp.getSkillsDescription()[2]);
            }
        });

        ibE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSkillDesc.setText(selChamp.getSkillsDescription()[3]);
            }
        });

        ibR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvSkillDesc.setText(selChamp.getSkillsDescription()[4]);
            }
        });
    }
}
