package commoninterviewtasks;

class Vehicle {

    public void drive() {
        System.out.println( "Vehicle is driving");
    }

    public void stop() {
        System.out.println("Vehicle is stopped");
    }

//    public void speedUp() { System.out.println("Vehicle is speeding"); }
}

class Car extends Vehicle {
    @Override
    public void drive() {
        System.out.println( "Car is driving");
    }

    @Override
    public void stop() {
        System.out.println("Car is stopped");
    }

    public void speedUp() {
        System.out.println("Car is speeding");
    }
}


public class DynamicPolymorphism {
    public static void main(String[] args) {
        Vehicle c1 = new Car();
        c1.drive(); // --> Car is driving
        c1.stop(); // --> Car is stopped
//        c1.speedUp();  // --> compilation error!

    }
}

