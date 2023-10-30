package java_inheritance_assignment;

// Creating class Vehicle
class Vehicle {
	private String brand;
	private String model;
	private int year;

	public Vehicle(String brand, String model, int year) {
		this.brand = brand;
		this.model = model;
		this.year = year;
	}

	// Creating method drive
	public void drive() {
		System.out.println("Brand:" + brand + "\n" + "Model:" + model + "\n" + "Year:" + year + "\n" + "Driving Vehicle.");
	}
}

//extending Vehicle class by Car class
class Car extends Vehicle {
	private String color;

	public Car(String brand, String model, int year, String color) {
		super(brand, model, year);
		this.color = color;
	}

//creating method Honk
	public void honk() {
		System.out.println("Color:" + color + "\n" + "Honking the horn of the Car");
	}
}

public class VehiclesInheritance {

	public static void main(String[] args) {
		// Creating object to call the methods
		Car myCar = new Car("Jaguar", "E-PACE", 2024, "Black");

		myCar.drive();
		myCar.honk();
	}

}
