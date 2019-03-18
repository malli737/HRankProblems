package com.malli;

import java.util.HashMap;

public class SockMerchant {
	
	static int sockMerchant(int na, int[] ar) {
	      
	    HashMap<Integer, Integer> inventory = new HashMap<Integer,Integer>();
	        
	        int totalmatched = 0;
	        for(int i=0; i < ar.length; i++)
	        {
	            int color = ar[i];
	           
	            if(inventory.containsKey(color) && inventory.get(color).equals(new Integer(1)))
	            {
	                inventory.put(color,0);
	                totalmatched++;
	                continue;
	            }
	            inventory.put(color,1);
	        }
	    return  totalmatched;
	    }
	
public static void main(String args[])
{
	int[] arr ={1,2,2,3,4,3,1,4,5};

	int totalMatch = sockMerchant(arr.length, arr);
	System.out.println(" totalMatch :"+totalMatch);
}


}
