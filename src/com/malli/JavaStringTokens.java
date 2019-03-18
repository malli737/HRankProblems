package com.malli;

import java.util.Scanner;

public class JavaStringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan = new Scanner(System.in);
	        String s = "He is a very very good boy, isn't he?";
	        // Write your code here.
	        scan.close();
	        if(s.length()==0)
	        {
	        	System.out.println(0);
	        	return;
	        }
	        String splitregx="[^a-zA-Z]+";
			String[] tokens = s.split(splitregx);
			System.out.println(tokens.length);
			for(int i=0;i<tokens.length;i++)
			{
				System.out.println(tokens[i]);
			}
	}

}
