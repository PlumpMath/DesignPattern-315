package com.zxccy.template;

public class Test {

	public static void main(String[] args) {
		System.out.println("��ʼ׼������");
		RefreshBeverage b1 = new Coffer();
		b1.GetBevarage();
		System.out.println("���Ⱥ��ˣ�");
		
		System.out.println("\n***********************************\n");
		
		System.out.println("��ʼ׼����");
		RefreshBeverage b2 = new Tea();
		b2.GetBevarage();
		System.out.println("����ˣ�");
	}

}
