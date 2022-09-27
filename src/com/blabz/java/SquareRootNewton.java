package com.blabz.java;

public class SquareRootNewton {
	public static void main(String[] args) {
		double c = Double.parseDouble(args[0]);
		double epsilon = 1e-15;
		double t = c; // initialize t =c
		while (Math.abs(t - c / t) > epsilon) {
			t = (c / t + t) / 2;

		}
		System.out.println("The square root of a Non-negative number c: " + c + " = " + t);
	}

}
