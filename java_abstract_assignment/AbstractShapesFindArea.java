package java_abstract_assignment;

abstract class Shape {
	// Abstract method to calculate the area
	public abstract double calculateArea();
}

// Shape class extends by circle class
class Circle extends Shape {
	private double radius;

	public Circle(double radius) {
		this.radius = radius;
	}

	public double calculateArea() {
		return Math.PI * radius * radius;
	}
}

// Shape class extends by rectangle class
class Rectangle extends Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double calculateArea() {
		return width * height;
	}
}

public class AbstractShapesFindArea {
	public static void main(String[] args) {
		// Create a  object for circle
		Circle circle = new Circle(5.0);
		// Calculate and print the area of the Circle
		System.out.println("Area of Circle: " + circle.calculateArea());

		// Create a  object for rectangle
		Rectangle rectangle = new Rectangle(4.0, 6.0);
		// Calculate and print the area of the Rectangle
		System.out.println("Area of Rectangle: " + rectangle.calculateArea());
	}
}
