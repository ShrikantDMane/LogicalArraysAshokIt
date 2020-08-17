package com.AshokIt;

import java.util.PriorityQueue;

public class Usingpriority {
	
	public static void main(String[] args) {
		
		int[] a = {1,6,4,3,2,3,8,1,0};
		
		PriorityQueue<Integer> MAX_HEAP = new PriorityQueue<>();
		
		for(int i=0;i<a.length;i++) 
		{
			MAX_HEAP.add(a[i]);
			if(MAX_HEAP.size()>3) //kth largest ie 4
			{
				MAX_HEAP.poll(); 
			}
			
			
		}
		
		  System.out.println( MAX_HEAP.peek());    
		
		
		
		
		
		
		
		
	}

}
