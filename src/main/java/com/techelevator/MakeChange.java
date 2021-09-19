package com.techelevator;

import java.util.Scanner;

/*
 Write a command line program which prompts the user for the total bill, and the amount tendered. It should then
 display the change required.

 $ java MakeChange
 Please enter the amount of the bill: 23.65
 Please enter the amount tendered: 100.00
 The change required is 76.35
 */
public class MakeChange {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

			System.out.println("Welcome to the Change Calculator");

			System.out.print("Enter the bill amount (without $): ");

			String line = scanner.nextLine();

			double bill = Double.parseDouble(line);

			// Prompt the user for a series of prices
			System.out.print("Please provide amount tendered(without $): ");

			line = scanner.nextLine();

			double tendered = Double.parseDouble(line);


			double changeRequired = tendered - bill;

			System.out.println("The change required is $"+ changeRequired);







	}

}
