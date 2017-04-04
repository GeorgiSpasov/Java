package com.basics;

interface I {

    void f();

    void g();
}

class A implements I {

    @Override
    public void f() {
        System.out.printf("f() called from %s.\n", this.getClass().getSimpleName());
    }

    @Override
    public void g() {
        System.out.printf("g() called from %s.\n", this.getClass().getSimpleName());
    }
}

class B implements I {

    @Override
    public void f() {
        System.out.printf("f() called from %s.\n", this.getClass().getSimpleName());
    }

    @Override
    public void g() {
        System.out.printf("g() called from %s.\n", this.getClass().getSimpleName());
    }
}

class C implements I {

    I i = new A();

    @Override
    public void f() {
        i.f();
    }

    @Override
    public void g() {
        i.g();
    }

    void toA() {
        i = new A();
    }

    void toB() {
        i = new B();
    }

}

public class Delegation {

    public static void main(String[] args) {
        C c = new C();
        c.f();
        c.g();
        c.toB();
        c.f();
        c.g();
    }
}
