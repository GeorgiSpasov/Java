package com.basics.lambdas;

@FunctionalInterface
public interface IAddable<T> {

    public T add(T t1, T t2);
}
