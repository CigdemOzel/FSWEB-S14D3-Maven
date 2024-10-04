package org.example.company;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return getClass().getSimpleName() + " engine is starting powerfully.";
    }

    @Override
    public String accelerate() {
        return getClass().getSimpleName() + " is accelerating smoothly.";
    }

    @Override
    public String brake() {
        return getClass().getSimpleName() + " is braking securely.";
    }
}