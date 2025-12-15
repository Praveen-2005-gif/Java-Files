abstract class Vehicle {
    abstract double calculateSpeed();
    abstract double calculateVelocity();
}
class Car extends Vehicle {
    private double distance;
    private double time;

    Car(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }
    public double calculateSpeed() {
        return distance / time;
    }
    public double calculateVelocity() {
        return distance / time;
    }
}

class Bike extends Vehicle {
    private double distance;
    private double time;

    Bike(double distance, double time) {
        this.distance = distance;
        this.time = time;
    }
    public double calculateSpeed() {
        return distance / time;
    }
    public double calculateVelocity() {
        return distance / time;
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car(100.0, 2.0); 
        Bike bike = new Bike(50.0, 1.5); 

        System.out.println("Car Speed: " + car.calculateSpeed() + " units/time");
        System.out.println("Car Velocity: " + car.calculateVelocity() + " units/time");

        System.out.println("Bike Speed: " + bike.calculateSpeed() + " units/time");
        System.out.println("Bike Velocity: " + bike.calculateVelocity() + " units/time");
    }
}