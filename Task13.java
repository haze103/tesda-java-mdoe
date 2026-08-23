class Vehicle {
    protected String make, model;
    protected int year;

    public Vehicle(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String make, String model, int year, int numberOfDoors) {
        super(make, model, year);
        this.numberOfDoors = numberOfDoors;
    }

    public void displayDetails() {
        System.out.println("Car Details: " + "\n" + 
                            "Make: " + make + "\n" +
                            "Model: " + model + "\n" + 
                            "Year: " + year + "\n" + 
                            "Number of Doors: " + numberOfDoors);
    }
}

public class Task13 {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Camry", 2022, 4);
        car.displayDetails();
    }
}
