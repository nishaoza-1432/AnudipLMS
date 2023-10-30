package javabasicassignment;

import java.util.Scanner;

class Subject {
    private String name;
    private double marks;

    public Subject(String name) {
        this.name = name;
        this.marks = 0.0;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public double getMarks() {
        return marks;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private int rollNumber;
    private Subject[] subjects;

    public Student(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
        subjects = new Subject[2];
        //  declaring array for students subject
        subjects[0] = new Subject("Maths");
        subjects[1] = new Subject("English");
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public Subject[] getSubjects() {
        return subjects;
    }
}

class Teacher {
    public void setMarks(Student student, double mathMarks, double englishMarks) {
        student.getSubjects()[0].setMarks(mathMarks);
        student.getSubjects()[1].setMarks(englishMarks);
    }
    
    //Calculating average marks of all students
    public double calculateAverageMarks(Student[] students) {
        double totalMarks = 0.0;
        for (Student student : students) {
            totalMarks += student.getSubjects()[0].getMarks() + student.getSubjects()[1].getMarks();
        }
        return totalMarks / (students.length * 2);
    }
    
     //Calculating Minimum and Maximum marks of all students
    public void findMinMaxMarks(Student[] students) {
        double maxMarks = Double.MIN_VALUE;
        double minMarks = Double.MAX_VALUE;

        for (Student student : students) {
            double mathMarks = student.getSubjects()[0].getMarks();
            double englishMarks = student.getSubjects()[1].getMarks();

            maxMarks = Math.max(maxMarks, Math.max(mathMarks, englishMarks));
            minMarks = Math.min(minMarks, Math.min(mathMarks, englishMarks));
        }
           System.out.println("Maximum Marks: " + maxMarks);
           System.out.println("Minimum Marks: " + minMarks);
    }
}

public class ClassesFindingMinMax {
    public static void main(String[] args) {
        Student[] students = new Student[10];
        Teacher teacher = new Teacher();
        Scanner sc = new Scanner(System.in);

        // Instantiate 10 students with names and roll numbers
        for (int i = 0; i < 10; i++) {
            students[i] = new Student("Student" + (i + 1), i + 1);
        }

        // Input marks for each student from the teacher
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter marks for " + students[i].getName() + " (Roll Number: " + students[i].getRollNumber() + "):");
            System.out.print("Maths Marks: ");
            double mathMarks = sc.nextDouble();
            System.out.print("English Marks: ");
            double englishMarks = sc.nextDouble();
            teacher.setMarks(students[i], mathMarks, englishMarks);
        }

        // Calculate and display average marks
        double averageMarks = teacher.calculateAverageMarks(students);
        System.out.println("Average Marks: " + averageMarks);

        // Find and display the maximum and minimum marks
        teacher.findMinMaxMarks(students);
       
    sc.close();
    }
}