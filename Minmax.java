package com.AshokIt;

public class Minmax {
public static void main(String[] args) {
	
	int[] a = {1,2,5,5,6,6,7,2};
	
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
	
	
}
}
