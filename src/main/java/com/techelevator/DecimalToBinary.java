package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Please enter in a series of decimal values (separated by spaces): ");

		String userInput = input.nextLine();

		String[] decimalAsNumber = userInput.split(" ");
		int binary;

		for(String decimalNumber : decimalAsNumber){
			int decimal = Integer.parseInt(decimalNumber);
			do{
				binary = decimal % (decimal / 2);
				decimal = decimal / 2;
				System.out.print(binary + ",");
			}

			while(decimal >= 0);
		}

}
}
