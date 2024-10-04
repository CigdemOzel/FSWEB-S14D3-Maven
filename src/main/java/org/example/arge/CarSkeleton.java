package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    // Parametresiz constructor
    public CarSkeleton() {
        this.name = "Default Name";
        this.description = "Default Description";
    }

    // Parametreli constructor
    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    // Public startEngine metodu
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting.");
    }

    // Public drive metodu
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving.");
        runEngine(); // Protected metod çağrılıyor
    }

    // Protected runEngine metodu
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " engine is running.");
    }
}
