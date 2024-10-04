package org.example.arge;

public class GasPoweredCar extends CarSkeleton {
    private double avgKmPerLiter;
    private int cylinders;

    // Parametreli constructor
    public GasPoweredCar(String name, String description, double avgKmPerLiter, int cylinders) {
        super(name, description); // Parent sınıfın constructor'ı çağrılıyor
        this.avgKmPerLiter = avgKmPerLiter;
        this.cylinders = cylinders;
    }

    public double getAverageKmPerLiter() {
        return avgKmPerLiter;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " engine is starting with gas power.");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " is driving with gas.");
        runEngine();
    }
}
