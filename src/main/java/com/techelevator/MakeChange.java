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

		while(true) {
			String line = scanner.nextLine();
			double bill = Double.parseDouble(line);
			boolean validBillInput = (bill > 0);
			//add requirement that input cannot have anything other than number(double)
			if (!validBillInput) {
				System.out.println("Please enter either valid number without any symbols or negatives.");
			} else {
				System.out.print("Please provide amount tendered(without $): ");
				while(true) {
					line = scanner.nextLine();
					double tendered = Double.parseDouble(line);
					boolean validTenderedInput = (tendered > 0);
					//add requirement that input cannot have anything other than number(double)
					if (!validTenderedInput) {
						System.out.println("Please enter either valid number without any symbols or negatives.");
					} else {

						double changeRequired = tendered - bill;

						System.out.println("The change required is $" + changeRequired);
					}
					break;
				}
			}
		}

	}

}
