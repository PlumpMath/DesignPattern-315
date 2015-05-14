package com.zxccy.pattern;

/*
 * 策略模式上下文
 */
public class Context {
	private IArm arm = null;
	
	public Context(IArm arm){
		this.arm = arm;
	}
	
	public void operate(){
		arm.Attack();
	}
}
