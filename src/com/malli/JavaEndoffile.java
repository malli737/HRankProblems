package com.malli;

import java.util.Scanner;

public class JavaEndoffile {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int i=1;
	//	scan.nextInt()
		while(scan.hasNext())
		{
			System.out.println(i+" "+scan.nextLine());
			i++;
		}
		
	}

}
