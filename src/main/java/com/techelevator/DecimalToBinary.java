package com.techelevator;

import java.util.Arrays;
import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);

		System.out.println("Please enter in a series of decimal values (separated by spaces): ");

		String userInput = input.nextLine();

		String[] decimalToBinary = userInput.split(" ");
		int


		for(int i = 0; i < decimalToBinary.length - 1; i++){
			decimalToBinary[i]
		}

		System.out.println(Arrays.toString(decimalToBinary));


	}

}
