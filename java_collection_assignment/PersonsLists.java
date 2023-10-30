package java_collection_assignment;

import java.util.ArrayList;
import java.util.List;

class Person{
	private String name;
    private int age;
	
    public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Person [Name=" + name + ", Age=" + age + "]";
	}
    
	
}
public class PersonsLists {
	public static void main(String[] args) {
        // Create an ArrayList to store Person objects
        List<Person> personList = new ArrayList<>();

        // Add 10 Person objects to the list
        personList.add(new Person("Ajay", 25));
        personList.add(new Person("Vijay", 30));
        personList.add(new Person("Jai", 35));
        personList.add(new Person("Ram", 40));
        personList.add(new Person("Sham", 45));
        personList.add(new Person("Raj", 50));
        personList.add(new Person("Lisa", 55));
        personList.add(new Person("Lirisha", 60));
        personList.add(new Person("Alice", 65));
        personList.add(new Person("Jack", 70));

        // Print the Person objects using a for-each loop
        for (Person person : personList) {
            System.out.println(person);
        }
}
}
