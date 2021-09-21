package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please enter in a series of decimal values (separated by spaces): ");

		String userInput = scanner.nextLine();

		String[] decimalAsNumber = userInput.split(" ");
		int[] binary = new int[11111111];

		for(String decimalNumber : decimalAsNumber){
			int decimal = Integer.parseInt(decimalNumber);
			System.out.print("\r\n"+ decimal + " in binary is ");
			int i = 0;

			while(decimal > 0) {
				binary[i] = decimal % 2;
//				System.out.print(binary[i] );
				decimal = decimal / 2;
				i++;
			}
			for (int x = i - 1; x >= 0;x--)
					System.out.print(binary[x]);
		}
	}
}
