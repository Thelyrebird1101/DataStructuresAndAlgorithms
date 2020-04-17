package com.arrays;

import java.util.HashMap;

public class TwoSum {	
	public static void main(String[] args) {
		int[] arr = {4, 5, 11, 15,4};
		int target = 8;
		int[] result = solveTwoSum(arr, target);
		for(int r: result) {
			System.out.print(r+" ");
		}
	}

	public static int[] solveTwoSum(int[] arr, int target) {
		int[] result = new int[2];
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0; i<arr.length; i++) {
			map.put(target - arr[i], i );
		}
		for (int i = 0; i < arr.length; i++) {
			if(map.containsKey(arr[i]) && i!=map.get(arr[i]))
			{
				result[0] = i;
				result[1]= map.get(arr[i]);
			}
		}
		return result;
	}
}
