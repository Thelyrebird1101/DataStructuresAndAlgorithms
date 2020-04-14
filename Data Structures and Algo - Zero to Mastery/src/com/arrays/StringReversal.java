package com.arrays;

public class StringReversal {
		public static void main(String[] args) {
				String  name = "Hi My name is Lyrebird";
				System.out.println("Input String is: "+ name);
				System.out.print("Output String is: ");
				char[] nameArray = name.toCharArray(); // Convert the String into a char array, using the toCharArray function
				for (int i = nameArray.length-1; i>=0; i--) {
					System.out.print(nameArray[i]);
				}
		}
}
