package com.malli;

import java.util.Scanner;

public class JavaRegex {

	public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    while(in.hasNext()){
        String IP = in.next();
        System.out.println(IP.matches(new MyRegex().pattern));
    }
	}

}


class MyRegex {

	/*
    [01]?\\d{1,2}   matches numbers 0-199.
    2[0-4]\\d       matches numbers 200-249
    25[0-5]         matches numbers 250-255
*/
	String num = "([01]?\\d{1,2}|2[0-4]\\d|25[0-5])";
    String pattern = num + "." +  num + "." +  num + "." + num;

}


