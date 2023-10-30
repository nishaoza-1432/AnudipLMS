package java_inheritance_assignment;

//Creating class Person
class Person {

	private String name;
	private int age;

	public Person(String name, int age) {

		this.name = name;
		this.age = age;
	}

	// Creating method speak
	public void speak() {
		System.out.println("Name:" + name + "\n" + "Age:" + age + "\n" + "Speaking...");
	}
}

//extending Person class by Student class
class Student extends Person {
	private String grade;

	public Student(String name, int age, String grade) {
		super(name, age);
		this.grade = grade;
	}

//creating method study
	public void study() {
		System.out.println("Grade:" + grade + "\n" + "Studying...");
	}
}

public class PersonStudentInheritance {

	public static void main(String[] args) {
		// Creating object to call the methods
		Student Stud = new Student("Annie", 15, "A+");

		Stud.speak();
		Stud.study();
	}

}
