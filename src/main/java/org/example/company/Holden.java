package org.example.company;

public class Holden extends Car {
    public Holden(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is starting silently.";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerates moderately.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brakes reliably.";
    }
}