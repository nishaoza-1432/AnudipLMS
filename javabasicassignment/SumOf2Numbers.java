package javabasicassignment;

import java.util.Scanner;

public class SumOf2Numbers {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Write a Java program to take two numbers as input from the user and print their sum.
	    Scanner input =new Scanner(System.in);
	    System.out.print("First number:");
	    int num1 =input.nextInt();
	    System.out.print("Second number:");
	    int num2 =input.nextInt();
	    int sum=num1+num2;
	    System.out.println();
	    System.out.println("Sum of " +num1+ " and " +num2+ " is:"+sum);
	    input.close();
	    
	}

}


