package com.arrays;

import java.util.*;

public class MyDynamicArray {

	private int[] data;
	private int size;
	
	public MyDynamicArray(){
		this.data = new int[20];
		this.size =0;
	}
	
	public MyDynamicArray(int capacity) {
		if(capacity<20) {
			capacity=20;
			data = new int[capacity];
			size =0;
		}
	}
	
	
	
	public void ensureCapacity(int minCapacity) {
		int oldCapacity = data.length;
		if(minCapacity > oldCapacity) {
			int newCapacity = oldCapacity*2;
			data = Arrays.copyOf(data, newCapacity);
		}
	}
	
	
	public int size() {
		return size;
	}
	
	private void rangeCheck(int index) {
		if(index>=size || index< 0)
				throw new IndexOutOfBoundsException("Index: "+ index +" ,Size:  "+ size);
	}
	
	
	public int get(int index) {
		rangeCheck(index);
		return data[index];
	}
	
	public boolean add(int item) {
		ensureCapacity(size +1);
		data[size++] = item;
		return true;
	}

	public int capacity() {
		return data.length;
	}
	
	public static void main(String[] args) {
			MyDynamicArray dynamicArray = new MyDynamicArray();
			for (int i = 1; i < 40; i++) {
				dynamicArray.add(2*i);
			}
		System.out.println(	dynamicArray.get(5));
			
	}
	
	
}
