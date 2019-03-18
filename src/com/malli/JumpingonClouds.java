package com.malli;

public class JumpingonClouds {

	public static void main(String[] args) {
		int arr[] ={0, 0, 0, 0, 0, 1, 0};//{0 ,0, 0, 0, 1, 0};
		int numofjumps = jumpingClouds(arr);
		System.out.println("numofjumps :"+numofjumps);

	}
	 static int jumpingClouds(int[] c) {
		    int count = 0,i = 0;
		    while(true) {
				if(i + 2 < c.length && c[i + 2] == 0) {
					i += 2;
				} else if(i + 1 < c.length) {
					i++;
				} else {
					break;
				}
				count++;
			}			
		    return count;
		  
		    }

}
