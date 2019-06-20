package com.test.junit;

public class Operations {
	
	static int square(int n) {
		
		return n*n;
	}
	
	 static int maxElement(int arr[])
	{
		int max=0;
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}	

}
