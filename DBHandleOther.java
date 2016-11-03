package com.example.abans_000.docplus;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by abans_000 on 02-11-2016.
 */
public class DBHandleOther extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "docplus.db";
    private static final String TABLE_OTHER = "othersignup";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_AGE = "_age";
    private static final String COLUMN_NAME = "_name";
    private static final String COLUMN_SEX = "_sex";
    private static final String COLUMN_DOB = "_dob";
    private static final String COLUMN_ADDRESS = "_address";
    private static final String COLUMN_MOBILE = "_mobile";
    private static final String COLUMN_PASSWORD = "_password";
    private static final String COLUMN_EMAIL = "_email";

    public DBHandleOther(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "+TABLE_OTHER+ "("+
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT " +
                COLUMN_AGE + " INTEGER " +
                COLUMN_NAME + " TEXT " +
                COLUMN_SEX + " TEXT " +
                COLUMN_DOB + " TEXT " +
                COLUMN_ADDRESS + " TEXT " +
                COLUMN_MOBILE + " TEXT " +
                COLUMN_PASSWORD + " TEXT " +
                COLUMN_EMAIL + " TEXT " +
                ");";
        db.execSQL(query);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_OTHER);
        onCreate(db);
    }

    //Add new Product
    public void addProduct(OthersSignUp product)
    {
        ContentValues values = new ContentValues();
        values.put(COLUMN_AGE,product.get_age());
        values.put(COLUMN_ADDRESS,product.get_address());
        values.put(COLUMN_EMAIL,product.get_email());
        values.put(COLUMN_DOB,product.get_dob());
        values.put(COLUMN_MOBILE,product.get_mobile());
        values.put(COLUMN_PASSWORD,product.get_password());
        values.put(COLUMN_SEX,product.get_sex());
        values.put(COLUMN_NAME,product.get_name());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_OTHER,null,values);
        db.close();
    }


}
