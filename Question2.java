package com.skillup;

public class Question2 {

	
	public static int indexed(int myarray[], int t)	{
		
		
	    // Checking whether array is null 
		if(myarray == null) {
			
			return -1;
		}
		
		// finding the length of array
		int len = myarray.length;
		
		int i = 0;
		
		// if the i'th element is the element you are looking for then return the index 
		while (i < len) {
			
			if(myarray[i] == t ) {
				
				return i;
				
			}
			else {
				
				i += 1;
			}
			
		}
		return i;
	

	}
	
	
	public static void main(String[] args) {

		int[] array = {4,3,5,2,1,0,10,9,7,8};
 		int t = 0; 
		System.out.println(" the element 0 is at index : " + indexed(array,t));
	}

}
