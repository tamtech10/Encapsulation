package com.tamaris.heritage;

public class Hierarchicalln {
    static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.property();
        c1.child_1_property();

        Child2 c2 = new Child2();
        c2.child_2_property();
        c2.property();               //ne komuniciraju medju sobom samo sa svojim roditeljem
    }
}

class Parent {
    void property() {
        System.out.println("Parent's property...");
    }
}

class Child1 extends Parent {
    void child_1_property() {
        System.out.println("Child_1's property");
    }
}

class Child2 extends Parent {
    void child_2_property() {
        System.out.println("Child_2's property");
    }
}

