package com.skillup;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Question1 {
	
	static Queue<Integer> queue = new LinkedList<Integer>();

	static Stack<Integer> stack = new Stack<Integer>();
	
	
	

	private static boolean checkSorted(int n) {
	
		
		int expected = 1;
		int front = 0;
		
		
		//TO CHECK WHETHER QuEUE IS EMPTy
		while(!queue.isEmpty())
		{
			front = queue.peek();
			queue.poll();
		
	
		if (front == expected)
			expected++;
		
		else
		{
		    if ( stack.size() != 0 ) {
		    	
		    	stack.push(front);
		    }
		    
		    else if ( stack.size() != 0 && stack.peek() < front) {
		    
		    	return false;
		    	}
		    
		    else 
		    	stack.push(front);
		    
		
		}
		    
		  while (stack.size() != 0 && stack.peek() == expected) {
			  
			  stack.pop();
			  expected++;
			  
		  }		
		  
		
	}
			
		 if (expected - 1 == n &&  stack.size() == 0) 
	            return true; 
	      
	        
		
		 return false; 
		
		}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		queue.add(5);
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		
		System.out.println(queue);
		
		int n = queue.size();
		
		if(checkSorted(n))
			System.out.println("TRUE");
		else
			System.out.println("FALSE");
	}


}
