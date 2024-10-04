package org.example.company;

public class Mitsubishi extends Car {
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name); // Parent sınıfın constructor'ını çağırır
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is roaring.";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " accelerates quickly.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " brakes efficiently.";
    }
}