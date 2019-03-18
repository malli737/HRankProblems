package com.malli;

import java.util.Scanner;

public class RepeatedString {

	public static void main(String[] args) {
		
	
		Scanner scan = new Scanner(System.in);
		Double d = scan.nextDouble();
		scan.close();
		long repeatCount = repeatedString("x",10);
		// TODO Auto-generated method stub
	System.out.println("the first letter count "+repeatCount);	

	}
	 static long repeatedString(String s, long n) {
		 long remainingwords =0;
		 int sLenghth= s.length();
		 long count = 0;
		 if(sLenghth == 1 && s.charAt(0)=='a')
		 {
			 return n;
		 }else{
			
			/* int remaingletters = (int) (n-(s.length()));
			 if(sLenghth > 1 && sLenghth <=100)
			 {
				 do{
					 s =s+s;
					 remaingletters--;
					 count ++;
					 
				 }while(remaingletters>0);
				 
				 return count;
			 }*/
			 
			 remainingwords = n/sLenghth;
			 long remainder = n % sLenghth;
			  
			  for(int i=0;i<sLenghth;i++)
			  {
				 if(s.charAt(i)=='a')
				 {
					 count++;
				 }
					 
			  }
			  count =  (count*remainingwords);
			  for(int i=0;i<remainder;i++)
			  {
				 if(s.charAt(i)=='a')
				 {
					 count++;
				 }
					 
			  }
			 System.out.println(remainingwords+" remainder "+remainder);
			 
		 }
		
		 
		 return count;
 
		
	    }

}
