package com.arrays;

public class MoveZero {
		public static void main(String[] args) {
			int[] input = {1,3,0,5,0,12};
			moveZeroes(input);
}

		private static void moveZeroes(int[] nums) {
					int fast =0, slow =  0;
					while(fast<nums.length) {
						  if(nums[slow]==0){
				                if(nums[fast]!=0){
				                    nums[slow] = nums[fast];
				                    nums[fast] = 0;
				                    slow++;
				                    fast++;
				                }
				                else fast++;
				            }
				            else {
				                slow++;
				                fast++;
				             }
					}
					for(int n: nums) {
						System.out.print(n+" ");
				}
		}
}
