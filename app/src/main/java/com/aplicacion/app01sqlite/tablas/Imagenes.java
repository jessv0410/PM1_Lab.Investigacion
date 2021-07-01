package com.aplicacion.app01sqlite.tablas;

import java.sql.Blob;

public class Imagenes {

    private Blob imagen;

    public Imagenes() {}

    public Imagenes(Blob imagen) {
        this.imagen= imagen;
    }

    public Blob getImagen() {
        return imagen;
    }

    public void setImagen(Blob imagen) {
        this.imagen = imagen;
    }
}
