package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView txt1,txt2,txt3,txt4,txt5;
    ImageView img1,img2;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView txt1=(TextView)findViewById(R.id.textView);
        TextView txt2=(TextView)findViewById(R.id.textView2);
        TextView txt3=(TextView)findViewById(R.id.textView3);
        TextView txt4=(TextView)findViewById(R.id.textView4);
        TextView txt5=(TextView)findViewById(R.id.textView5);
        ImageView img1 = (ImageView)findViewById(R.id.imageView);
        ImageView img2 = (ImageView)findViewById(R.id.imageView2);
        Button btn = (Button)findViewById(R.id.button);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i);

            }
        });
    }
}