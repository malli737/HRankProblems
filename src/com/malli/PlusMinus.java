package com.malli;

public class PlusMinus {

	static void plusMinus(int[] arr) {
    int zeroCnt= 0;
    int posCnt = 0;
    int negCount =0;
    int arrLeng =arr.length;
    for(int i =0;i<arrLeng;i++)
    {
    	if(arr[i]==0)
    	{
    		zeroCnt ++;
    	}else if(arr[i]>0)
    	{
    		posCnt ++;
    	}else  if(arr[i]<0)
    	{
    		negCount ++;
    	}
    }
    System.out.format("%.6f\n",(float)posCnt/arrLeng);
    System.out.format("%.6f\n",(float)negCount/arrLeng);
    System.out.format("%.6f\n",(float)zeroCnt/arrLeng);

    }
	public static void main(String[] args) {
		 
        int arr[]={-4 ,3, -9, 0, 4, 1  };
		 plusMinus(arr);

	}

}
