package com.loops;
import java.util.Arrays;

public class PrintMatrix {
//	Exercise to implement console program which will meet the following requirements:
//		1. Program starts and prints matrix to console.
//			Matrix to print:
//				{1, 2, 3, 4, 5},
//				{6, 7},
//				{8, 9,10}
	public static void main(String[] args) {
		int[][] matrix = { { 1, 2, 3, 4, 5 }, { 6, 7 }, { 8, 9, 10 } };		
		for (int[] numbers : matrix) {
		    System.out.println();
		    for (int number : numbers) System.out.print(number);
		}
	}

}
