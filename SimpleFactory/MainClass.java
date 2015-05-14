package com.zxccy.pattern;

public class MainClass {

	public static void main(String[] args) {
		int a = 6;
		int b = 9;
		
		IOperate add = Factory.getOperate("+");
		System.out.println(add.operate(a, b));
		
		IOperate subtraction = Factory.getOperate("-");
		System.out.println(subtraction.operate(a, b));
	}
}
