package com.arrays;

public class MaxSubArray {
		public static void main(String[] args) {
			int [] arr = {-2, 1, -3,  4, -1, 2 , 1, -5, 4};
			int[] arr2 = {2,3,4,5,7}; // Test Case when all elements are negative
			System.out.println(calculateMaxSubArray1(arr2));
			System.out.println(calculateMaxSubArray1(arr));
		}
		
	
		
		
		/* The following is an implementation of Kadane's Algorithm to calculate Max Sub Array. 
		 * The algorithm says that, at any index 'i' the Max Sub array is either arr[i] or the sum of arr[i] and the Max Sub array at i-1;
		 * This logic is represented by Section A in the code
		 * 
		 * */
		
		
			public static int calculateMaxSubArray1(int[] arr) {
			int max_local = arr[0]; // max_local has been initialized with arr[0] instead of 0 to handle test cases where all the elements of array are negative
			int max_global = Integer.MIN_VALUE;
			for (int i = 1; i < arr.length; i++) {
			//	 max_local = Math.max(arr[i], max_local+arr[i]); // Section A
				
				/******* The above section can also be written as follows for greater time optimization 	*****/
				if(max_local < 0)
						max_local = arr[i];   
				else 
					max_local += arr[i];
	
				max_global = Math.max(max_local, max_global);
			}
			
			return max_global;
		}
}
