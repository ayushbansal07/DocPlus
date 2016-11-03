package com.example.abans_000.docplus;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by abans_000 on 02-11-2016.
 */
public class DBHandleEmer extends SQLiteOpenHelper {
    private static final int DATABASE_VERSION = 1;
    private static final String DATABASE_NAME = "docplus.db";
    private static final String TABLE_EMER = "emergency";
    private static final String COLUMN_ID = "_id";
    private static final String COLUMN_AGE = "_age";
    private static final String COLUMN_NAME = "_name";
    private static final String COLUMN_SEX = "_sex";
    private static final String COLUMN_DOB = "_dob";
    private static final String COLUMN_ADDRESS = "_address";
    private static final String COLUMN_MOBILE = "_mobile";
    private static final String COLUMN_CONDITION = "_condition";
    private static final String COLUMN_HISTORY = "_history";
    private static final String COLUMN_NAMEVISIT = "_namevisit";
    private static final String COLUMN_RELATION = "_reltion";
    private static final String COLUMN_MOBVISIT = "_mobvisit";

    public DBHandleEmer(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
        super(context, DATABASE_NAME, factory, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String query = "CREATE TABLE "+TABLE_EMER+ "("+
                COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_AGE + " INTEGER, " +
                COLUMN_NAME + " TEXT, " +
                COLUMN_SEX + " TEXT, " +
                COLUMN_DOB + " TEXT, " +
                COLUMN_ADDRESS + " TEXT, " +
                COLUMN_MOBILE + " TEXT, " +
                COLUMN_CONDITION + " TEXT, " +
                COLUMN_HISTORY + " TEXT, " +
                COLUMN_NAMEVISIT + " TEXT, " +
                COLUMN_RELATION + " TEXT, " +
                COLUMN_MOBVISIT + " TEXT " +
                ");";
        db.execSQL(query);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EMER);
        onCreate(db);
    }

    //Add new Product
    public void addProduct(EmergencyDB product)
    {
        ContentValues values = new ContentValues();
        values.put(COLUMN_AGE,product.get_age());
        values.put(COLUMN_ADDRESS,product.get_address());
        values.put(COLUMN_CONDITION,product.get_condition());
        values.put(COLUMN_DOB,product.get_dob());
        values.put(COLUMN_MOBILE,product.get_mobile());
        values.put(COLUMN_HISTORY,product.get_history());
        values.put(COLUMN_SEX,product.get_sex());
        values.put(COLUMN_NAME,product.get_name());
        values.put(COLUMN_NAMEVISIT,product.get_namevisit());
        values.put(COLUMN_RELATION,product.get_relation());
        values.put(COLUMN_MOBVISIT,product.get_mobvisit());

        SQLiteDatabase db = getWritableDatabase();
        db.insert(TABLE_EMER, null, values);
        db.close();
    }
}
