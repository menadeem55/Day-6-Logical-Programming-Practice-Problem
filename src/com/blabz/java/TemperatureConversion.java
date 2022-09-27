package com.blabz.java;

import java.util.Scanner;

public class TemperatureConversion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Select type of conversion\n 1- Fahrenheit to Celcious");
		System.out.println("Select type of conversion\n 2- Celcious to Fahrenheit");
		int Type = sc.nextInt();

		double F, C;

		switch (Type) {

		case 1:
			System.out.println("Enter temperatute in Farhenheit");
			F = sc.nextDouble();
			C = (F - 32) * 5 / 9;
			System.out.println("Temperature in Celcious: " + C);
			break;

		case 2:
			System.out.println("Enter temperature in Celcious");
			C = sc.nextDouble();
			F = (C * 9 / 5) + 32;
			System.out.println("Temperature in Farhenheit: " + F);
			break;

		default:
			System.out.println("Invalid Input!");

		}

	}

}
