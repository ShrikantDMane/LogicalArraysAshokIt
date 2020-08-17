package com.AshokIt;

public class MaxDifference {

	public static void main(String[] args) {
		
		int[] a = {1,6,4,3,2,2,3,8,1,2};
		
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]>max) 
			{
				max=a[i];
			}
			
		}
		for(int i=0;i<a.length;i++) 
		{
			if(a[i]<min) 
			{
				min=a[i];
			}
			
		}

		System.out.println(max);
		System.out.println(min);
		System.out.println("The maximum difference in between the elements of given array is: " + (max-min));
	}
	
	
}
