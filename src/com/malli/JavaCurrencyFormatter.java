package com.malli;

import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class JavaCurrencyFormatter {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		 double payment= scanner.nextDouble();
		NumberFormat numberformat  =NumberFormat.getCurrencyInstance(new Locale("en","US"));
		System.out.println("US: " + numberformat.format(payment));
		NumberFormat formatind = java.text.NumberFormat.getCurrencyInstance(new java.util.Locale("en","in"));
			System.out.println("India: " +  formatind.format(payment));
			NumberFormat formatchina = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.CHINA);
			System.out.println("China: " + formatchina.format(payment));
		   NumberFormat formatFrance = java.text.NumberFormat.getCurrencyInstance(java.util.Locale.FRANCE);
			System.out.println("France: " +  formatFrance.format(payment));
	        }

}
