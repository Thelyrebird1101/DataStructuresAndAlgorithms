package com.arrays;

public class StringReversal {
		public static void main(String[] args) {
				String  str = "Hi My name is Lyrebird";
				System.out.println("Given String is: "+ str);
				System.out.println("Reversed String is: " + reverseString2(str));
				}

		// Using an array to reverse a string
		private static String reverseString(String str) {
			if(	str == null || str.length()<2 ) 
					return "Not good enough";
			char[] strArray = str.toCharArray();
			String reversedStr = "";
			for (int i =  strArray.length-1; i>=0; i--) {
				reversedStr+=strArray[i];
			}
			return reversedStr;
		}
		
		//Using StringBuilder class of java, which has inbuilt reverse method
		private static String reverseString2(String str) {
			StringBuilder sb = new StringBuilder();
			return sb.append(str).reverse().toString();	
		}
		
		
		
		
	}

