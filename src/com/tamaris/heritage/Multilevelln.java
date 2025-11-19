package com.tamaris.heritage;

public class Multilevelln {    //heritage u vise nivoa
    static void main(String[] args) {
        Child c = new Child();
        c.play();
        c.work();
        c.love();
    }
}

class GrandFather {
    void love () {
        System.out.println("Grandfather is loving their children");
    }
}

class Father extends GrandFather {
    void work() {
        System.out.println("Father is working...");
    }
}

class Child extends Father {
    void play() {
        System.out.println("Children is playing...");
    }
}


