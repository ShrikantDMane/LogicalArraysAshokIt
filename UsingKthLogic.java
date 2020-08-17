package com.AshokIt;

public class UsingKthLogic {

	public static void main(String[] args) {
		
		int[] a = {1,2,5,9,6,4,7,2};
	
		System.out.println();
		for(int i =0;i<a.length-1;i++) 
		{
			
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]>a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			if(i==1)
			{
				System.out.println("The 2nd min element from the array is:"+a[i]);
				break;
			}
			
		}
		
		for(int i =0;i<a.length-1;i++) 
		{
			
			for(int j=i+1;j<a.length;j++) 
			{
				if(a[i]<a[j]) 
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
			if(i==1)
			{
				System.out.println("The 2nd max element from the array is:"+a[i]);
				break;
			}
			
		}
		
		
		
	}
	
	
	
	
	
	
	
	
}
