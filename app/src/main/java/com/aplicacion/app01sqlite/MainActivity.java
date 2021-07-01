package com.aplicacion.app01sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.aplicacion.app01sqlite.transacciones.Transacciones;
import com.google.android.gms.tasks.OnSuccessListener;

public class MainActivity extends AppCompatActivity {

    private Button guardarimg, guardarvideo;
    private static final int GALLERY_INTENT = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnlista = (Button) findViewById(R.id.btntakevideo);
        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityVideo.class);
                startActivity(intent);
            }
        });

        Button btnlista1 = (Button) findViewById(R.id.btnlista1);
        btnlista1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityPhoto.class);
                startActivity(intent);
            }
        });

        guardarimg = (Button)findViewById(R.id.btnguardarimg);
        guardarvideo = (Button)findViewById(R.id.btnguardarvideo);

        /*guardarimg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("image/*");
                startActivityForResult(intent,GALLERY_INTENT);

            }
        });*/

        guardarvideo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_PICK);
                intent.setType("video/*");
                startActivityForResult(intent,GALLERY_INTENT);
            }
        });

        /*Button btnlista = (Button) findViewById(R.id.btnlista);
        btnlista.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ActivityListView.class);
                startActivity(intent);
            }
        });

        Button btnmapa = (Button) findViewById(R.id.btnmapa);
        btnmapa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), MapsActivity.class);
                startActivity(intent);
            }
        });

        Button btncombo = (Button) findViewById(R.id.btncombo);
        btncombo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(getApplicationContext(), ActivityCombo.class);
                startActivity(intent);
            }
        });*/

    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == GALLERY_INTENT && resultCode == RESULT_OK){
            Uri uri = data.getData();

            SQLiteConexion conexion = new SQLiteConexion(this, Transacciones.NameDataBase,  null, 1);
            SQLiteDatabase db = conexion.getWritableDatabase();

            ContentValues valores = new ContentValues();
            valores.put(Transacciones.tablavideos, Transacciones.video.equals(uri.getLastPathSegment()));

            Long resultado = db.insert(Transacciones.tablavideos,Transacciones.video, valores);
            Toast.makeText(getApplicationContext(), "Fotografia guardada con exito", Toast.LENGTH_LONG).show();
            db.close();
        }



    }

    public void clickNew(View view)
    {
        Intent intent = new Intent(this, ActivityIngresar.class);
        startActivity(intent);
    }

    public void clickNew2(View view)
    {
        Intent intent = new Intent(this, ActivityConsulta.class);
        startActivity(intent);
    }



}