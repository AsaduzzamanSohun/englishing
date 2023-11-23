package com.example.englishing;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    CardView british_council;
    CardView the_english_page;
    CardView dave_esl_cafe;
    CardView purdue_writing_lab;
    CardView doulingo;
    CardView perfect_english_grammar;
    CardView cambridge_english;
    CardView leo;
    CardView english_at_home;
    CardView american_english;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        british_council = findViewById(R.id.british_council);
        the_english_page = findViewById(R.id.my_english_page);
        dave_esl_cafe = findViewById(R.id.dave_esl_cafe);
        purdue_writing_lab = findViewById(R.id.purdue_writing_lab);
        doulingo = findViewById(R.id.doulingo);
        perfect_english_grammar = findViewById(R.id.perfect_english_grammar);
        cambridge_english = findViewById(R.id.cambridge_english);
        leo = findViewById(R.id.leo);
        english_at_home = findViewById(R.id.english_at_home);
        american_english = findViewById(R.id.american_english);


        british_council.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, BritishCouncilActivity.class);
                startActivity(intent);
            }
        });

        the_english_page.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, TheEnglishPageActivity.class);
                startActivity(intent);
            }
        });

        dave_esl_cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, DaveESLCafeActivity.class);
                startActivity(intent);
            }
        });

        purdue_writing_lab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PurdueWritingLabActivity.class);
                startActivity(intent);
            }
        });

        doulingo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, DoulingoActivity.class);
                startActivity(intent);
            }
        });

        perfect_english_grammar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, PerfectEnglishGrammarActivity.class);
                startActivity(intent);
            }
        });

        cambridge_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, CambridgeEnglishActivity.class);
                startActivity(intent);
            }
        });

        leo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, LEOActivity.class);
                startActivity(intent);
            }
        });

        english_at_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, EnglishAtHomeActivity.class);
                Log.i("TAG", "Error");
                startActivity(intent);
            }
        });

        american_english.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeActivity.this, AmericanEnglishActivity.class);
                startActivity(intent);
            }
        });



    }
}