package com.dam1;

public class Main {

    public static void main(String[] args) {
       Singleton single = Singleton.getSingleton();
       single = Singleton.getSingleton();
       single.setNombre("Sparras");
       Singleton single2 = Singleton.getSingleton();
        System.out.println(single2.getNombre());




    }
}
