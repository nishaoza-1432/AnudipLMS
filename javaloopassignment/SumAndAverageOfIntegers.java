package javaloopassignment;

import java.util.Scanner;

public class SumAndAverageOfIntegers {
	/*
	 * Write a program that asks the user to input five integers and stores them in
	 * an array. The program should then find and print the sum and average of the
	 * values in the array.
	 */
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter  5 integer ");
		int[] numbers = new int[5];

		for (int i = 0; i < 5; i++) {
			System.out.print("Enter integer " + i + ": ");
			numbers[i] = scanner.nextInt();
		}
		// for sum of the integers
		int sum = 0;
		for (int number : numbers) {
			sum += number;
		}
		// for average of the integers
		double average = (double) sum / numbers.length;
		// results
		System.out.println("Sum of the integers: " + sum);
		System.out.println("Average of the integers: " + average);

		scanner.close();
	}
}
