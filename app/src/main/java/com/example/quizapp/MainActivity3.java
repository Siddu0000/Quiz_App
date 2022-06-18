package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity3 extends AppCompatActivity {

    Button btn3, btn4;
    TextView txt6, txt8, txt9, txt10;
    RadioGroup rg;
    RadioButton rb1, rb2, rb3, rb4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Intent intent = getIntent();
        String Name = intent.getStringExtra("message_key");



        txt6 = (TextView) findViewById(R.id.textView6);
        txt6.setText("Hello "+Name);
        txt8 = (TextView) findViewById(R.id.textView8);
        txt9 = (TextView) findViewById(R.id.textView9);
        txt10 = (TextView) findViewById(R.id.textView10);

        btn3 = (Button) findViewById(R.id.button3);
        btn4 = (Button) findViewById(R.id.button4);

        rg = (RadioGroup) findViewById(R.id.radioGroup);
        rb1 = (RadioButton) findViewById(R.id.radioButton);
        rb2 = (RadioButton) findViewById(R.id.radioButton2);
        rb3 = (RadioButton) findViewById(R.id.radioButton3);
        rb4 = (RadioButton) findViewById(R.id.radioButton4);

        final int Score = 0;


        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = rg.getCheckedRadioButtonId();
                if (radioId == rb1.getId()) {
                    Toast.makeText(MainActivity3.this, "Wrong Answer", Toast.LENGTH_SHORT).show();
                    Intent i3 = new Intent(getApplicationContext(), MainActivity4.class);
                    i3.putExtra("message_Name", Name);
                    i3.putExtra("message_Score", Score);
                    startActivity(i3);

                } else if (radioId == rb2.getId()) {
                    Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                    int upd_Score = Score + 1;
                    Intent i3 = new Intent(getApplicationContext(), MainActivity4.class);
                    i3.putExtra("message_Name", Name);
                    i3.putExtra("message_Score", upd_Score);
                    startActivity(i3);
                } else if (radioId == rb3.getId()) {
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                    Intent i3 = new Intent(getApplicationContext(), MainActivity4.class);
                    i3.putExtra("message_Name", Name);
                    i3.putExtra("message_Score", Score);
                    startActivity(i3);
                } else if (radioId == rb4.getId()) {
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                    Intent i3 = new Intent(getApplicationContext(), MainActivity4.class);
                    i3.putExtra("message_Name", Name);
                    i3.putExtra("message_Score", Score);
                    startActivity(i3);
                } else {
                    Toast.makeText(getApplicationContext(), "First select a Choice", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent quit = new Intent(getApplicationContext(), MainActivity8.class);
                quit.putExtra("message_Name", Name);
                quit.putExtra("message_Score", Score);
                startActivity(quit);
            }
        });

    }
}