package com.example.abans_000.docplus;

import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by abans_000 on 03-11-2016.
 */
public class DBHandleDr extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "docplus.db";
    private static final String TABLE_DRSIGNUP = "drsignup";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_AGE = "_age";
    private static final String COLUMN_HOSPID = "_hospid";
    private static final String COLUMN_REG = "_reg";
    private static final String COLUMN_NAME = "_name";
    private static final String COLUMN_EMAIL = "_email";
    private static final String COLUMN_SEX = "_sex";
    private static final String COLUMN_PASSWORD = "_password";
    private static final String COLUMN_DOB = "_dob";
    private static final String COLUMN_ADDRESS = "_address";
    private static final String COLUMN_MOB1 = "_mob1";
    private static final String COLUMN_MOB2 = "_mob2";
    private static final String COLUMN_DEGREE = "_degree";

    public DBHandleDr(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "+TABLE_DRSIGNUP+ "("+
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_AGE + " INTEGER, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_SEX + " TEXT, " +
                COLUMN_DOB + " TEXT, " +
                COLUMN_ADDRESS + " TEXT, " +
                COLUMN_HOSPID + " TEXT, " +
                COLUMN_REG + " TEXT, " +
                COLUMN_EMAIL + " TEXT, " +
                COLUMN_PASSWORD + " TEXT, " +
                COLUMN_MOB1 + " TEXT, " +
                COLUMN_MOB2 + " TEXT, " +
                COLUMN_DEGREE + " TEXT " +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_DRSIGNUP);
        onCreate(db);
    }

    public void addProduct(DrSignUpDB product)
    {
        ContentValues values = new ContentValues();
        values.put(COLUMN_AGE,product.get_age());
        values.put(COLUMN_ADDRESS,product.get_address());
        values.put(COLUMN_HOSPID,product.get_hospid());
        values.put(COLUMN_DOB,product.get_dob());
        values.put(COLUMN_REG,product.get_reg());
        values.put(COLUMN_EMAIL,product.get_email());
        values.put(COLUMN_SEX,product.get_sex());
        values.put(COLUMN_NAME,product.get_name());
        values.put(COLUMN_PASSWORD,product.get_password());
        values.put(COLUMN_MOB1,product.get_mob1());
        values.put(COLUMN_MOB2,product.get_mob2());
        values.put(COLUMN_DEGREE,product.get_degree());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_DRSIGNUP, null, values);
        db.close();
    }

    public String validLogin(String username,String pwd)
    {
        SQLiteDatabase db = getWritableDatabase();
        String dbString="";
        String query = "SELECT * FROM " + TABLE_DRSIGNUP +" WHERE 1";
        Cursor c =db.rawQuery(query,null);
        c.moveToFirst();
        //boolean f=false;
        while(!c.isAfterLast())
        {
            if(c.getString(c.getColumnIndex(COLUMN_EMAIL))!=null &&
                    c.getString(c.getColumnIndex(COLUMN_PASSWORD))!=null) {
                if (c.getString(c.getColumnIndex(COLUMN_EMAIL)).equals(username) &&
                        c.getString(c.getColumnIndex(COLUMN_PASSWORD)).equals(pwd)) {
                    int age = c.getInt(c.getColumnIndex(COLUMN_AGE));
                    String name = c.getString(c.getColumnIndex(COLUMN_NAME));
                    String mobile = c.getString(c.getColumnIndex(COLUMN_MOB1));
                    String sex = c.getString(c.getColumnIndex(COLUMN_SEX));
                    dbString += "Name  " + name + "\n" + "Mobile  " + mobile + "\n" + "Age  " + age + "\n" + "Sex  " + sex + "\n";
                    //ReturnDr retvalue = new ReturnDr(age,name,mobile,sex,true);


                    db.close();
                    return dbString;
                }
            }
            c.moveToNext();

        }

        //ReturnDr retvalue = new ReturnDr(0,null,null,null,false);
        db.close();
        return dbString;


    }
}
