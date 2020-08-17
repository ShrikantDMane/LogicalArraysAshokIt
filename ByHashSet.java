package com.AshokIt;

import java.util.HashSet;
import java.util.Set;

public class ByHashSet {

	public static void main(String[] args) {
		
		int[] a = {1,2,5,5,6,6,7,2};
		
		Set<Integer> hs = new HashSet<>();
		
		for(int no : a) 
		{
			hs.add(no);
		}
		
		System.out.println("The new array with removed duplicates is" + hs);
		
		
	}
	
	
	
	
}
