package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");

		String userInput = input.nextLine();

		String[] decimalAsNumber = userInput.split(" ");
		int[] binary = new int[11111111];
		int i = 0;
		int x;

		for(String decimalNumber : decimalAsNumber){
			int decimal = Integer.parseInt(decimalNumber);
			System.out.print(" " + decimal + " in binary is ");

			while(decimal > 0) {
				binary[i] = decimal % 2;
//				System.out.print(binary[i] );
				decimal = decimal / 2;
				i++;

				for (x = i - 1; x >= 0; x--)
					System.out.print(binary[x]);
			}
		}
	}
}
