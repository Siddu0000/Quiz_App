package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn1,btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1=(Button)findViewById(R.id.button);
        btn2=(Button)findViewById(R.id.button2);
        EditText edt=(EditText)findViewById(R.id.editTextTextPersonName);


            btn1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String Name = edt.getText().toString();
                    if(Name.equals(""))
                    {
                        Toast.makeText(getApplicationContext(),"First Enter Your Name to Start a Quiz",Toast.LENGTH_LONG).show();

                    }
                    else
                    {
                        Intent i2 = new Intent(getApplicationContext(),MainActivity3.class);
                        i2.putExtra("message_key",Name);
                        startActivity(i2);
                    }

                }
            });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i1 = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(i1);

            }
        });

    }
}