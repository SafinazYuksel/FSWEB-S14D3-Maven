package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("\n--- Car R&D Company ---\n");

        CarSkeleton gasCar = new GasPoweredCar("Gas Car", "Gas powered test car", 15.5, 4);
        System.out.println(gasCar.startEngine());
        System.out.println(gasCar.drive());

        CarSkeleton electricCar = new ElectricCar("Electric Car", "Electric test car", 400.0, 75);
        System.out.println(electricCar.startEngine());
        System.out.println(electricCar.drive());

        CarSkeleton hybridCar = new HybridCar("Hybrid Car", "Hybrid test car", 20.0, 50, 4);
        System.out.println(hybridCar.startEngine());
        System.out.println(hybridCar.drive());
    }
}