package com.zxccy.pattern;

/*
 * 策略模式：它定义了算法家族，分别封装起来，让他们之间可以互相替换，此模式让算法的变化，不会影响到使用算法的用户。
 */
public class MainClass {

	public static void main(String[] args) {
		Context context1 = new Context(new Pistol());
		context1.operate();
		
		Context context2 = new Context(new Cannon());
		context2.operate();
	}
}
