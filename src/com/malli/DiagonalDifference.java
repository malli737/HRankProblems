package com.malli;

public class DiagonalDifference {
	 static int diagonalDifference(int[][] arr) {
		
		 int totalone = 0;
		 int totaltwo=0;
		 
		 for(int i=0;i<arr.length;i++)
		 {
			 int[] arelement = arr[i];
			 totalone = totalone+arelement[i];
			 totaltwo = totaltwo+arelement[arelement.length-(i+1)];
				 
		 }
		 
		return Math.abs(totalone-totaltwo);


	    }


	public static void main(String[] args) {

		int[][] arr = {{11, 2, 4},{4,5,6},{10,8,-12}};
		
		 int result = diagonalDifference(arr);
		 System.out.println(result);
	}

}
