package com.malli;

import java.util.Arrays;

public class JavaAnagrams {

	public static void main(String[] args) {
		 boolean ret = isAnagram("Hello", "hello");
	        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );

	}

	private static boolean isAnagram(String a, String b) {
		
		boolean anagram = false;
		
		if(a.length() == b.length())
		{
			a =a.toLowerCase();
			b = b.toLowerCase();	
			StringBuilder sb = new StringBuilder(a.length()); 
	        char[] tempArry =a.toCharArray();
	        for(int i=0;i<(tempArry.length-1);i++){
	             for(int j=i+1;j>0;j--){
	                 if(tempArry[j]<tempArry[j-1]){
	                     char temp=tempArry[j-1];
	                     tempArry[j-1]=tempArry[j];
	                     tempArry[j]=temp;
	                 }
	             }
	         }
	         a=String.valueOf(tempArry);
	     
	       sb = new StringBuilder(b.length()); 
	         tempArry =b.toCharArray();
	         for(int i=0;i<(tempArry.length-1);i++){
	             for(int j=i+1;j>0;j--){
	                 if(tempArry[j]<tempArry[j-1]){
	                     char temp=tempArry[j-1];
	                     tempArry[j-1]=tempArry[j];
	                     tempArry[j]=temp;
	                 }
	             }
	         }
	         b=String.valueOf(tempArry);
			
		System.out.println(a+" "+b);
		if(a.equalsIgnoreCase(b))
		{
			anagram = true;
			
		}
		}
		 
		
		return anagram;
	}
	

}
