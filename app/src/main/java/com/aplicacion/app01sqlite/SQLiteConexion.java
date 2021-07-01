package com.aplicacion.app01sqlite;


import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import com.aplicacion.app01sqlite.transacciones.Transacciones;


public class SQLiteConexion extends SQLiteOpenHelper
{
    public SQLiteConexion(Context context, String dbname, SQLiteDatabase.CursorFactory factory, int version)
    {
        super(context, dbname, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db)
    {

        db.execSQL(Transacciones.CreateTablePersonas);
        db.execSQL(Transacciones.CreateTableImagenes);
        db.execSQL(Transacciones.CreateTableVideos);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion)
    {
        db.execSQL(Transacciones.DropTablePersonas);
        db.execSQL(Transacciones.DropTableImagenes);
        db.execSQL(Transacciones.DropTableVideos);
        onCreate(db);
    }
}
