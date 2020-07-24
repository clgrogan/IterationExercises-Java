package com.loops;

import java.util.Scanner;
//Exercise implementing a console program which will meet the following requirements:
//	1.	Program starts and asks user to enter the height of the pyramid.
//	2.	Program draws such picture in console:
//	Example: Height is 3
//		*
//		**
//		***
//		**
//		*
public class DrawPyramid {
	public static void main(String[] args) {
		System.out.println("Enter the height of the pyramid (positive integer): ");

		Scanner sc = new Scanner(System.in);

		int height = sc.nextInt();
		boolean up = true;
		if (height > 0) {
			for (int i = 1; i > 0;) {
				System.out.println("*".repeat(i));
				if (i == height)
					up = false;
				if (up == true) {
					i++;
				} else {
					i--;
				}
			}
		}
	}
}
