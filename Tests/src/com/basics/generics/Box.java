package com.basics.generics;

public class Box<T> {

    private T[] content;

    public Box() {
        this(null);
    }

    public Box(T[] content) {
        this.content = content;
    }

    public T[] getContent() {
        return content;
    }

    // Box<Integer> and Box<Double> are not subclasses of Box<Number>
    // <? extends Number> - sets only the upper limit
    public void putContent(Box<? extends Number> n) {
        this.content = (T[]) n.content;
    }

    public void putContent(T[] content) {
        this.content = content;
    }
}
