package com.demo.beans;

public class MyClass {
	
	public int fun(int a, int b) {
		return a+b;
	}
	
	public float fun(float a, float b) {
		return a+b;
	}
	
	
	public String fun(String a, String b) {
		return a+b;
	}
	
	public int fun(int ...a) {
		int sum = 0;
		
		for (int i : a) {
			sum += i;
		}
		
		return sum;
		
	}
}
