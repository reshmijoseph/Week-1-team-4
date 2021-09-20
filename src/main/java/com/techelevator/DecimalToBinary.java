package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);

		System.out.println("Please enter in a series of decimal values (separated by spaces): ");

		String userInput = input.nextLine();

		String[] decimalToBinary = userInput.split(" ");

		for (String weightText : decimalToBinary) {
			int arrayNumber = Integer.parseInt(weightText);

			int binary = arrayNumber % (arrayNumber / 2);

			System.out.println(arrayNumber + " in binary is " + binary);

		System.out.println(Arrays.toString(decimalToBinary));


	}

}
}
