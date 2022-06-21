package com.example.bestbody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.ThemedSpinnerAdapter;

import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity4<myAdapter> extends AppCompatActivity {
    ListView ms = (ListView)findViewById(R.id.listee);
    mydatabase db  =  new mydatabase(getApplicationContext(),"programme",null,1);
    ArrayList<String> arrayL= db.getAllRecord();
    ArrayAdapter  myAdapter =  new  ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,arrayL);

    {
        ms.setAdapter(myAdapter);
    }}