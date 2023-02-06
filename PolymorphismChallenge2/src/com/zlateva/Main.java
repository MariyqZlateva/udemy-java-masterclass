package com.zlateva;

public class Main {
    public static void main(String[] args) {

        Car car = new Car("2011 Blue Ferrari 296 GTS");
        runRace(car);
        System.out.println("***************************");

        Car ferrari = new GasPoweredCar("2011 Blue Ferrari 296 GTS",
                15.4, 6);
        runRace(ferrari);
        System.out.println("***************************");

        Car tesla = new ElectricCar("2022 Red Tesla Model 3",
                568, 75);
        runRace(tesla);
        System.out.println("***************************");

        Car ferrariHybrid = new HybridCar("2011 Black Ferrari SF90 Stradale",
                16, 8, 8);
        runRace(ferrariHybrid);

    }

    public static void runRace(Car car) {

        car.startEngine();
        car.drive();
    }
}

