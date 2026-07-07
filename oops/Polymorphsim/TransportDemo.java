class Vehicle {

    public void fuelCost(int km) {
        System.out.println("Fuel cost not defined.");
    }
}

class Car extends Vehicle {

    @Override
    public void fuelCost(int km) {
        System.out.println("Car Fuel Cost = ₹" + (km * 8));
    }
}

class Bus extends Vehicle {

    @Override
    public void fuelCost(int km) {
        System.out.println("Bus Fuel Cost = ₹" + (km * 15));
    }
}

class Bike extends Vehicle {

    @Override
    public void fuelCost(int km) {
        System.out.println("Bike Fuel Cost = ₹" + (km * 3));
    }
}

// New class added without modifying existing classes
class ElectricCar extends Vehicle {

    @Override
    public void fuelCost(int km) {
        System.out.println("Electric Car Charging Cost = ₹" + (km * 2));
    }
}

public class TransportDemo {

    public static void main(String[] args) {

        Vehicle[] vehicles = {
                new Car(),
                new Bus(),
                new Bike(),
                new ElectricCar()
        };

        for (Vehicle v : vehicles) {

            v.fuelCost(20);   // Runtime Polymorphism

            if (v instanceof Car) {
                Car c = (Car) v;
                System.out.println("This is a Car.");
            } else if (v instanceof Bus) {
                Bus b = (Bus) v;
                System.out.println("This is a Bus.");
            } else if (v instanceof Bike) {
                Bike b = (Bike) v;
                System.out.println("This is a Bike.");
            } else if (v instanceof ElectricCar) {
                ElectricCar e = (ElectricCar) v;
                System.out.println("This is an Electric Car.");
            }

            System.out.println();
        }
    }
}