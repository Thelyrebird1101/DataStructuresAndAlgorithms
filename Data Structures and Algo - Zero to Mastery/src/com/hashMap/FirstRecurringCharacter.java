package com.hashMap;

import java.util.HashMap;

public class FirstRecurringCharacter {
		public static void main(String[] args) {
				int[] arr = {2, 5, 1, 2, 3, 5, 1 ,2 , 4};
				recurrantSolver(arr);
		}

		private static void recurrantSolver(int[] arr) {
			// TODO Auto-generated method stub
			
			
			HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
			boolean found = false;
			for(int a : arr) {
				if(!hm.containsKey(a))
					hm.put(a, 1);
				else {
					found = true;
					System.out.println( a);
					break;
			}
		}
			if (found == false) {
				System.out.println("No recurring Element found");
			}
			
		}
}
