package com.malli;

import java.util.Scanner;

public class JavaStringsIntroduction {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println((A.length()+B.length()));
        int isLexico = A.compareTo(B);
        if(isLexico>0)
        System.out.println("Yes");
        else
        {
             System.out.println("No");
        }
        System.out.println(capitalize(A)+" "+capitalize(B));
        /* Enter your code here. Print output to STDOUT. */
        
    }
    static String capitalize(String s){
        return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
    }
}
