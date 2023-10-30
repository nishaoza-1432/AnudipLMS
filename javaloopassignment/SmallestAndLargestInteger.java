package javaloopassignment;

import java.util.Scanner;

public class SmallestAndLargestInteger {

	/*
	 * Write a program that asks the user to input ten integers and stores them in
	 * an array. The program should then find and print the smallest and largest
	 * values in the array.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int[] numbers = new int[10];
		System.out.println("Enter 10 numbers");
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter integer " + i + ": ");
			numbers[i] = scanner.nextInt();
		}
		int smallest = numbers[0];
		int largest = numbers[0];
		// if then if conditions use to find smallest and largest integer
		for (int i = 1; i < 10; i++) {
			if (numbers[i] < smallest) {
				smallest = numbers[i];
			}
			if (numbers[i] > largest) {
				largest = numbers[i];
			}
		}
		// results
		System.out.println("Smallest integer: " + smallest);
		System.out.println("Largest integer: " + largest);

		scanner.close();
	}
}
