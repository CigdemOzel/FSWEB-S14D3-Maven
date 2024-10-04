package org.example.arge;

public class HybridCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int batterySize;
    private int cylinders;

    // Parametreli constructor
    public HybridCar(String name, String description, double avgKmPerLiter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLiter = avgKmPerLiter;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting with hybrid power.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving efficiently.");
        runEngine();
    }
}
