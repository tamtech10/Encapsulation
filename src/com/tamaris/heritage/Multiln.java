package com.tamaris.heritage;

public class Multiln {
    static void main(String[] args) {

        Person p = new Person();
        p.coding();
        p.dancing();
        p.walk();
    }
}

class Human {
    void walk() {
        System.out.println("Human is walking...");
    }
}

interface Coder{ //ovde samo deklarisemo metode, isto je sto i klasa
    void  coding();
}

interface Dancer{ //koristi se puno za bases de donne
    void dancing();
}

class Person  extends Human implements Coder, Dancer{ //hybrid jer koristimo i extends i implemants
    @Override
    public void coding() {
        System.out.println("Person is coding...");
    }

    @Override
    public void dancing() {
        System.out.println("Person is dancing...");

    } //ovde mozemo da implementiramo vise interface

}