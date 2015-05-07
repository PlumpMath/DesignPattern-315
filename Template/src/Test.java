package com.zxccy.template;

public class Test {

	public static void main(String[] args) {
		System.out.println("开始准备咖啡");
		RefreshBeverage b1 = new Coffer();
		b1.GetBevarage();
		System.out.println("咖啡好了！");
		
		System.out.println("\n***********************************\n");
		
		System.out.println("开始准备茶");
		RefreshBeverage b2 = new Tea();
		b2.GetBevarage();
		System.out.println("茶好了！");
	}

}
