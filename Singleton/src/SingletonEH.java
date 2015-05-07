package com.zxccy.singleton;

//����-��ģʽ
public class SingletonEH {
	private static SingletonEH singletonEH = new SingletonEH();
	
	private SingletonEH(){
		
	}
	
	public static SingletonEH GetInstance(){
		return singletonEH;
	}
}
