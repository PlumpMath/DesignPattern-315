package com.zxccy.pattern;

/*
 * ����ģʽ������
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
