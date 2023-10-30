package java_abstract_assignment;

/*Create an interface called "Person" with a method called "speak".
Create two classes called "Student" and "Teacher" that implement the Person interface and implement the "speak" method.
Create objects of both the Student and Teacher classes and call their respective "speak" methods*/

//Interface Person
interface Person {
	void speak();
}

//Student class implementing the Person interface
class Student implements Person {
	private String name;

	public Student(String name) {
		this.name = name;
	}

	// creating method speak for student class
	public void speak() {
		System.out.println("Student " + name + " is speaking.");
	}
}

//Teacher class implementing the Person interface
class Teacher implements Person {
	private String name;

	public Teacher(String name) {
		this.name = name;
	}

	// creating method speak for teacher class
	public void speak() {
		System.out.println("Teacher " + name + " is speaking.");
	}
}

public class InterfaceDemo {

	public static void main(String[] args) {
		// Create a object for Student class
		Student student = new Student("Nisha");
		// Calling the speak method for the Student
		student.speak();

		// Create a object for Teacher class
		Teacher teacher = new Teacher("Mrs. Priya");
		// Calling the speak method for the Teacher
		teacher.speak();
	}
}
