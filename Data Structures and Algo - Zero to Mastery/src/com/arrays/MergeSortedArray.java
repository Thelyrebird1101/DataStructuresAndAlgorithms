package com.arrays;

public class MergeSortedArray {

	public static void main(String[] args) {
			int[] arr1 = {0,3,4,31};
			int [] arr2 = {4,6,30};
			int[] mergedArray = mergeSorted(arr1, arr2);
			for (int i = 0; i < mergedArray.length; i++) {
				System.out.print(mergedArray[i]+" ");
			}
	}
	
	private static int[] mergeSorted(int[] arr1, int[] arr2) {
		int[] arr3  = new int[arr1.length + arr2.length]; // Create a new array of length sum of sizes of the two arrays
		int i=0, j=0, k=0;
		while(i<arr1.length && j<arr2.length) {
			if(arr1[i]<arr2[j])      // Add smaller element  to the array
					arr3[k++] = arr1[i++];
			else 
					arr3[k++] = arr2[j++];
		}
		while(i<arr1.length)
			arr3[k++] = arr1[i++];  // Add any remaining element of either arrays 
	
		while(j<arr2.length)
			arr3[k++] = arr1[j++];
		
		
		return arr3; 
	}

}
