package io.sample.playground.patterns.structural.adapter;

public class Adapter implements Target {

    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void print() {
        adaptee.printDocument();
    }
}
