package com.example.secondweekassignment.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {

    //final static name convention in capital letters
    private static final String DB_NAME = "mydb";
    private static final int DB_VERSION = 1;

    String tbl_create = "CREATE TABLE students (id INTEGER PRIMARY KEY AUTOINCREMENT, name TEXT, email TEXT,phone TEXT)";

    public DbHelper(@Nullable Context context) {

        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL(tbl_create);


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public boolean addStudent(){
        try {
            SQLiteDatabase db = getWritableDatabase();
            db.execSQL("INSERT INTO students (name, email, phone) VALUES ('Suman','suman@gmail.com','9823171680')");
            return true;
        }
        catch (Exception e){
            Log.d("DBEx", e.toString());
            return false;
        }
    }
}
