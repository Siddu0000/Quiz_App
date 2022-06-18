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

public class MainActivity4 extends AppCompatActivity {

    Button btn5, btn6;
    TextView txt11, txt12, txt13, txt14, txt15;
    RadioGroup rg2;
    RadioButton rb5, rb6, rb7, rb8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Intent intent2 = getIntent();
        String Name = intent2.getStringExtra("message_Name");
        int Score = intent2.getIntExtra("message_Score",0);



        txt11 = (TextView) findViewById(R.id.textView11);
        txt11.setText("Hello "+Name);
        txt13 = (TextView) findViewById(R.id.textView13);
        txt14 = (TextView) findViewById(R.id.textView14);
        txt15 = (TextView) findViewById(R.id.textView15);
        txt15.setText(String.valueOf(Score));

        btn5 = (Button) findViewById(R.id.button5);
        btn6 = (Button) findViewById(R.id.button6);

        rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
        rb5 = (RadioButton) findViewById(R.id.radioButton5);
        rb6 = (RadioButton) findViewById(R.id.radioButton6);
        rb7 = (RadioButton) findViewById(R.id.radioButton7);
        rb8 = (RadioButton) findViewById(R.id.radioButton8);


        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int radioId = rg2.getCheckedRadioButtonId();
                if (radioId == rb5.getId())
                {
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), MainActivity5.class);
                    i.putExtra("message_Name", Name);
                    i.putExtra("message_Score", Score);
                    startActivity(i);

                }
                else if(radioId == rb6.getId())
                {
                    Toast.makeText(getApplicationContext(), "Correct Answer", Toast.LENGTH_SHORT).show();
                    int upd_Score=Score+1;
                    Intent i = new Intent(getApplicationContext(), MainActivity5.class);
                    i.putExtra("message_Name", Name);
                    i.putExtra("message_Score", upd_Score);
                    startActivity(i);
                }
                else if(radioId == rb7.getId())
                {
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), MainActivity5.class);
                    i.putExtra("message_Name", Name);
                    i.putExtra("message_Score", Score);
                    startActivity(i);
                }
                else if(radioId == rb8.getId())
                {
                    Toast.makeText(getApplicationContext(), "Wrong Answer", Toast.LENGTH_SHORT).show();
                    Intent i = new Intent(getApplicationContext(), MainActivity5.class);
                    i.putExtra("message_Name", Name);
                    i.putExtra("message_Score", Score);
                    startActivity(i);
                }
                else
                {
                    Toast.makeText(getApplicationContext(), "First select a Choice", Toast.LENGTH_SHORT).show();
                }

            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivity8.class);
                i.putExtra("message_Name", Name);
                i.putExtra("message_Score", Score);
                startActivity(i);
            }
        });

    }
}