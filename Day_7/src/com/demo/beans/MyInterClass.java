package com.demo.beans;

import Interfaces.Inter1;
import Interfaces.Inter2;

public class MyInterClass implements Inter1, Inter2{

	@Override
	public void fun2(int a) {
		
		System.out.println("In interface 2 " + a*a);
		
	}

	@Override
	public void fun1() {
		System.out.println("In interface 1 ");
		
	}

}
