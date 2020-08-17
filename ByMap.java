package com.AshokIt;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ByMap {

	public static void main(String[] args) {
		
		int[] a = {1,2,5,5,6,6,7,2};
		
		Map<Integer,Integer> hm = new HashMap<>();
		
		for(int no: a) 
		{
			
		     Integer count = hm.get(no);
		    
		    if(count==null) 
		    {
		    	hm.put(no,1);
		    }
		    else 
		    {
		    	count=count+1;
		    	hm.put(no,count);
		    }		    
			
		}     
		             System.out.println("The duplicate elements are:");
		
		        Set<Map.Entry<Integer,Integer>> s1 =hm.entrySet();
		        
		        for(Map.Entry<Integer,Integer> me:s1)
		        {
		        	if(me.getValue()>1) 
		        	{
		        		System.out.println(me.getKey());
		        		
		        	}
		        	
		        }		
		
		
}
	
	
	
	
	
	
	
	
	
	
}
