package com.malli;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class JavaStaticInitializerBlock {

	//Write your code here

	   static boolean flag = true;
	   static int B, H;
	    static{
	Scanner scaner = new Scanner(System.in);
	 B = scaner.nextInt();
	  H = scaner.nextInt();
	 if(B <=0 || H <= 0 || H >=100 || B >=100)
	 {
	  System.out.println("java.lang.Exception: Breadth and height must be positive");
	flag = false;
	 }
	    }



	public static void main(String[] args){
			if(flag){
				int area=B*H;
				System.out.print(area);
			}
			Calendar c = Calendar.getInstance();
		      c.setTime(new Date("08/05/2015"));
		      int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		      List list = new ArrayList();
		      list.add("SUNDAY");
		      list.add("SUNDAY");
		      list.add("MONDAY");
		      list.add("TUESDAY");
		      list.add("WEDNESDAY");
		      list.add("THURSDAY");
		      list.add("FRIDAY");
		      list.add("SATURDAY");
		       ;
		      System.out.println("dayOfWeek :"+(String)list.get(dayOfWeek));
		}//end of main

}
