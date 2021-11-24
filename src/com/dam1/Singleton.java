package com.dam1;

public class Singleton {

    private static Singleton single = new Singleton();
    private String nombre = "sparrow";
    private int edad;
    private Singleton(){
    }

    public static Singleton getSingleton(){
        return single;
    }

    public int getEdad(){
        return edad;
    }

    public void setEdad(int a){
        edad = a;
    }

    public void setNombre(String a){
        nombre = a;
    }

    public String getNombre(){
        return nombre;
    }
}
