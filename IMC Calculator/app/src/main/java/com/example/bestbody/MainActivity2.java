package com.example.bestbody;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity2 extends AppCompatActivity {
    private EditText agee;
    private EditText poidd;
    private EditText taillee;
    private RadioButton f;
    private Button btil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        agee =  findViewById(R.id.aage);
        poidd = findViewById(R.id.ppoid);
        taillee = findViewById(R.id.ttaille);
        f =  findViewById(R.id.ffemme);
        btil= (Button)findViewById(R.id.calculezzz);

        btil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                int s;
                float p;
                float t;
                int a;
                float imc ;

                t = Float.parseFloat(taillee.getText().toString());
                a = Integer.parseInt(agee.getText().toString());
                p = Float.parseFloat(poidd.getText().toString());


                imc = p / (t * t);
                
                Intent ij = new Intent(MainActivity2.this, MainActivity3.class);
                Bundle bn = new Bundle();
                bn.putInt("agee", a);
                bn.putFloat("poidd", p);
                bn.putFloat("taillee", t);
                bn.putFloat("imc", imc);


                ij.putExtras(bn);
                startActivity(ij);
            }
        });
    }
}
