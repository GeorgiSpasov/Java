package com.basics.innerClasses;

class Outer {

    class Inner {

        Inner() {
            System.out.printf("Object of class: %s\n", getClass().getSimpleName());
        }
    }
}

class Inheritor extends Outer.Inner {

    public Inheritor(Outer o) {
        o.super();
    }
}

public class InheritTest {

    public static void main(String[] args) {

        Inheritor i = new Inheritor(new Outer());
    }
}
