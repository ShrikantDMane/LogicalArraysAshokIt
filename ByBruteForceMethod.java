package com.AshokIt;

public class ByBruteForceMethod {

	public static void main(String[] args) {
		
    int[] a = {1,2,5,5,6,6,7,2,5};
    
    for(int i=0;i<a.length-1;i++) 
    {
    
    	for(int j=i+1;j<a.length;j++) 
    	{
    		if(a[i]==a[j]&&i!=j)
    		{
    			
    			System.out.println(a[j]);   //25 5 5 6 this is the problem with this method ...works perfectly 
    			                           //fine only when 2 duplicates arefor more than2 duplicates this issue happens

    		}
    		
    		
    	}
    	
    	
    }
		
		
		
		
		
		
		
		
	}
	
}
