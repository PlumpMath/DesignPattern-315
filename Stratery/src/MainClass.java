package com.zxccy.pattern;

/*
 * ����ģʽ�����������㷨���壬�ֱ��װ������������֮����Ի����滻����ģʽ���㷨�ı仯������Ӱ�쵽ʹ���㷨���û���
 */
public class MainClass {

	public static void main(String[] args) {
		Context context1 = new Context(new Pistol());
		context1.operate();
		
		Context context2 = new Context(new Cannon());
		context2.operate();
	}
}
