package com.blabz.java;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 to start Watch");
		int watch = sc.nextInt();
		long startMillis = System.currentTimeMillis();
		System.out.println("StopWatch stared now At- " + startMillis);
		System.out.println("Enter 0 to stop watch");
		watch = sc.nextInt();
		long stopMillis = System.currentTimeMillis();
		System.out.println("stopWatch stopped now At- " + stopMillis);

		double elapse = ((stopMillis - startMillis) / 1000);
		System.out.println("The Elapsed time in second: " + elapse);

	}

}
