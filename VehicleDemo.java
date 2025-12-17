// Write a JAVA program  to create an abstract class vehicle with abstract methods.Calculate Speed and Velocity.Create subclasses car and bike that extends vehicle class and implement run methods to calculate the speed and velocity of each vehicle

abstract class Vehicle {
    abstract double calculateSpeed();
    abstract double calculateVelocity();
}
class Car extends Vehicle {
    private double distance;
    private double time;
    private double displacement;

    Car(double distance, double time, double displacement) {
        this.distance = distance;
        this.time = time;
        this.displacement=displacement;
    }
    public double calculateSpeed() {
        return distance / time;
    }
    public double calculateVelocity() {
        return displacement / time;
    }
}

class Bike extends Vehicle {
    private double distance;
    private double time;
    private double displacement;

    Bike(double distance, double time,double displacement) {
        this.distance = distance;
        this.time = time;
        this.displacement=displacement;
    }
    public double calculateSpeed() {
        return distance / time;
    }
    public double calculateVelocity() {
        return displacement / time;
    }
}
public class VehicleDemo {
    public static void main(String[] args) {
        Car car = new Car(100.0, 2.0,50); 
        Bike bike = new Bike(50.0, 1.5,30); 

        System.out.println("Car Speed: " + car.calculateSpeed() + " units/time");
        System.out.println("Car Velocity: " + car.calculateVelocity() + " units/time");

        System.out.println("Bike Speed: " + bike.calculateSpeed() + " units/time");
        System.out.println("Bike Velocity: " + bike.calculateVelocity() + " units/time");
    }

}

