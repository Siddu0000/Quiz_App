package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity8 extends AppCompatActivity {

    TextView txt16,txt17,txt18;
    Button btn7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main8);

        Intent intent2 = getIntent();
        String Name = intent2.getStringExtra("message_Name");
        int Score = intent2.getIntExtra("message_Score",0);

        txt16 = (TextView)findViewById(R.id.textView16);
        txt16.setText("Final Score:  "+String.valueOf(Score));
        txt17 = (TextView)findViewById(R.id.textView17);
        txt17.setText("Wrong Answers:  "+String.valueOf(5-Score));
        txt18 = (TextView)findViewById(R.id.textView18);
        txt18.setText("Correct Answers:  "+String.valueOf(Score));


        btn7 = (Button)findViewById(R.id.button7);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(i);
            }
        });


    }
}