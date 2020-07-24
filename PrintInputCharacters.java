package com.loops;
import java.util.Scanner;

public class PrintInputCharacters {
//	Exercise iImplementing a console program which will meet the following requirements:
//		1.	Program starts and asks user to enter integer number
//			a. No validation of input required for this exercise.
//		2.	Program prints each digit from the new line
//
//		EXAMPLE:
//		User input: "12345"
//		Program console output:
//		1 \n2 \n3 \n4 \n5
//  For fun, I add an iteration to allow repeating the request and output.
	public static void main(String[] args) {
		System.out.println("\nPlease, enter any integer: ");
		Scanner sc = new Scanner(System.in);
		String[] values =sc.nextLine().split("");
		for (String value: values) System.out.println("\t" + value);
    }

}
