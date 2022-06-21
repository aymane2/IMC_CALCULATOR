package com.example.bestbody;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity3 extends AppCompatActivity {
    TextView pd,tall ,age,imcc,imgg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        age =  findViewById(R.id.taage);
        tall =  findViewById(R.id.tttaille);
        pd =  findViewById(R.id.tpoid);
        imcc=  findViewById(R.id.timc);
        imgg=  findViewById(R.id.timg);

        Bundle b = getIntent().getExtras();
        int age1=b.getInt("agee");
        int poid1= (int) b.getFloat("poidd");
        int taille1= (int) b.getFloat("taillee");
        int imc1= (int) b.getFloat("imc");
        int img1= (int) b.getFloat("cal");

        pd.setText("votre  poid est "+poid1);
        tall.setText("votre  taille "+taille1);
        age.setText("votre  age est "+age1);
        imgg.setText("votre  IMG est "+img1);
        imcc.setText("votre  IMC est "+imc1);

    };
}