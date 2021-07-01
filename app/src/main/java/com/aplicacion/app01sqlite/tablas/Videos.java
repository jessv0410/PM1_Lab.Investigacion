package com.aplicacion.app01sqlite.tablas;

import java.sql.Blob;

public class Videos {

    private Blob video;

    public Videos() {}

    public Videos(Blob video) {
        this.video= video;
    }

    public Blob getVideo() {
        return video;
    }

    public void setVideo(Blob video) {
        this.video = video;
    }
}
