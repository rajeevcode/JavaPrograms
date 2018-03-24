package com.rajeev;

public class Main {

    //A class is a blue print for Object which we are creating

    public static void main(String[] args) {

        Car porsche = new Car();
        Car holden = new Car();
        //porshe = null;
        porsche.setModel("Carrera");
        //porsche.setModel("911");

        System.out.println("Model is " + porsche.getModel());
        //System.out.println("Model is " + holden.getModel());
    }
}
