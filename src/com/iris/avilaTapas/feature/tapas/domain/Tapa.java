package com.iris.avilaTapas.feature.tapas.domain;

public class Tapa {
    private String id;
    private String nombre;
    private double precio;
    private String alergenos;
    private String urlImg;

    public Tapa(String id,String nombre,double precio,String alergenos,String urlImg){
        this.nombre=nombre;
        this.id=id;
        this.precio=precio;
        this.alergenos=alergenos;
        this.urlImg=urlImg;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return nombre;
    }

    public void setName(String name) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getAlergenos() {
        return alergenos;
    }

    public void setAlergenos(String alergenos) {
        this.alergenos = alergenos;
    }

    public String getUrlImg() {
        return urlImg;
    }

    public void setUrlImg(String urlImg) {
        this.urlImg = urlImg;
    }
}
