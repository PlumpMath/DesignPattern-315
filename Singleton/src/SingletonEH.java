package com.zxccy.singleton;

//µ¥Àý-¶ñººÄ£Ê½
public class SingletonEH {
	private static SingletonEH singletonEH = new SingletonEH();
	
	private SingletonEH(){
		
	}
	
	public static SingletonEH GetInstance(){
		return singletonEH;
	}
}
