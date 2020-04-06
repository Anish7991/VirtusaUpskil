package com.skillup;

public class Question3 {

	      
	    static final int MOD = 1000000007; 
	      
	    public static long countBT(int h) { 
	        long[] bt = new long[h + 1]; 
	          
	        
	        bt[0] = 1; 
	        bt[1] = 1; 
	          
	        for(int i = 2; i <= h; ++i)  
	            bt[i] = (bt[i - 1] * ((2 * bt [i - 2])% MOD + bt[i - 1]) % MOD) % MOD; 
	              
	            return bt[h]; 
	    } 
	      
	     
	    public static void main (String[] args) { 
	        int h = 4;  
	        System.out.println("No. of balanced binary trees of height " + h + " is: " + countBT(h));  
	    } 
	} 

