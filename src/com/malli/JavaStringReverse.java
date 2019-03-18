package com.malli;

import java.util.Scanner;

public class JavaStringReverse {
	 public static void main(String[] args) {
	        
	        Scanner sc=new Scanner(System.in);
	        String A=sc.next();
	        /* Enter your code here. Print output to STDOUT. */
	        String sb = "";
	       for(int i=A.length();i>0;i--)
	       {
	    	   sb=sb+A.charAt(i-1);
	       }
	        
	        if(A.equals(sb))
	        {
	        	System.out.println("Yes");
	        }else{
         System.out.println("No");
	        }
	        
	    }
}
