package com.malli;

import java.util.Scanner;

public class JavaLoopsII {

	public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
    int t=in.nextInt();
   
    for(int i=0;i<t;i++){
        int a = in.nextInt();
        int b = in.nextInt();
        int n = in.nextInt();
        int temp = a;
      //  System.out.printf("%-15s%03d\n",a,a);
        for(int j=0;j<n;j++){
        int total =(((int) Math.pow(2, j))*b);
        temp = temp+total;
        System.out.print(temp+" ");
        }
    }
    in.close();}

}
