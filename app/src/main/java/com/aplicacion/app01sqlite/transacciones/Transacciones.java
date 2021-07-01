package com.aplicacion.app01sqlite.transacciones;

import java.sql.Blob;

public class Transacciones
{
    /* tablas */
    public static final String tablapersonas = "personas";
    public static final String id = "id";
    public static final String nombres = "nombres";
    public static final String apellidos = "apellidos";
    public static final String edad = "edad";
    public static final String correo = "correo";
    public static final String direccion = "direccion";
    public static final String CreateTablePersonas = "CREATE TABLE personas( id INTEGER PRIMARY KEY AUTOINCREMENT, nombres TEXT, apellidos TEXT, edad INTEGER," +
            "correo TEXT, direccion TEXT)";
    public static final String DropTablePersonas = "DROP TABLE IF EXISTS personas";


    public static final String tablaimagenes = "imagenes";
    public static final String imagen = "imagen";
    public static final String CreateTableImagenes = "CREATE TABLE imagenes(imagen BLOB)";
    public static final String DropTableImagenes = "DROP TABLE IF EXISTS imagenes";


    public static final String tablavideos = "videos";
    public static final String video = "video";
    public static final String CreateTableVideos = "CREATE TABLE videos(video BLOB)";
    public static final String DropTableVideos = "DROP TABLE IF EXISTS videos";

    /* Creacion del nombre de la base de datos */
    public static final String NameDataBase = "DBActual";

}
