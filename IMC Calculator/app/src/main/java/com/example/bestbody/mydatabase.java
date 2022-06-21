package com.example.bestbody;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

import java.util.ArrayList;

public class mydatabase extends SQLiteOpenHelper {
    public mydatabase(Context context, String name, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context,name,factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE programe (id INTEGER , progr TEXT)");


    }
    @Override
    public void onUpgrade(SQLiteDatabase db , int i, int i1) {

    }

    public ArrayList<String> getAllRecord() {
        ArrayList maliste = new ArrayList();
        SQLiteDatabase db = this.getReadableDatabase();
        Cursor res = db.rawQuery("Select * FROM programe",null);

        res.moveToFirst();

        return null;
    }
}