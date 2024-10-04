package org.example.company;

public class Car {
    private String name;
    private int cylinders;
    private boolean engine;
    private int wheels;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        this.engine = true; // Default olarak motor açık
        this.wheels = 4;    // Varsayılan tekerlek sayısı
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String startEngine() {
        System.out.println(getClass().getSimpleName());
        return "the car's engine is starting";
    }

    public String accelerate() {
        System.out.println(getClass().getSimpleName());
        return "the car is accelerating";
    }

    public String brake() {
        System.out.println(getClass().getSimpleName());
        return "the car is braking";
    }
}
