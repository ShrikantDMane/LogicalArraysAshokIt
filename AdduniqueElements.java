package com.AshokIt;

import java.util.HashSet;
import java.util.Set;

public class AdduniqueElements {


	public static void main(String[] args) {
		
		int[] a = {1,6,4,3,2,2,3,8,1,2};
		
		Set<Integer> hs =new HashSet<>();
	
		              int sum=0;
		       for(int i =0;i<a.length;i++) {
		          if(!hs.contains(a[i]))
		          {
		        	  sum =sum +a[i];
		        	  hs.add(a[i]);
		          }
		          
		          
		}
		       
		       System.out.println(sum);
		       System.out.println(hs);
		       
	}
	
	
	
	
	
	
	
	
	
	
	
}
