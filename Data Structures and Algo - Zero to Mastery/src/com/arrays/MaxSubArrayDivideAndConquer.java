package com.arrays;

public class MaxSubArrayDivideAndConquer {
	public static void main(String[] args) {
		MaxSubArray m = new MaxSubArray();
		int [] arr ={2, 3, 4, 5, 7};
		System.out.println( maxSubArray(arr, 0, arr.length -1));
		//System.out.println(m.calculateMaxSubArray1(arr));
	}

	private static int maxSubArray(int[] arr, int l, int h) {
		if(l==h)
			return arr[l];
		int mid = (l+h)/2;
		return Math.max(Math.max(maxSubArray(arr, l, mid), maxSubArray(arr, mid+1, h)), maxCrossingSubArray(arr, l, mid, h));
	}

	private static int maxCrossingSubArray(int[] arr, int l, int mid, int h) {
		int sum =0;
		int left_sum = Integer.MIN_VALUE;
		int right_sum = Integer.MIN_VALUE;
		for (int i = mid; i >= l; i--) {
			sum+=arr[i];
			left_sum = Math.max(sum, left_sum);
		}
		sum =0;
		for(int i=mid+1; i<=h; i++) {
			sum+= arr[i];
			right_sum = Math.max(sum, right_sum);
		}
		return left_sum+right_sum;
		
	}
	
	

}
