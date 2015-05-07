package com.zxccy.singleton;

//µ¥Àý-ÀÁººÄ£Ê½
public class SingletonLH {
	private static SingletonLH singletonLH = null;
	
	private SingletonLH(){
		
	}
	
	public static SingletonLH GetInstance(){
		if(singletonLH == null){
			singletonLH = new SingletonLH();
		}
		
		return singletonLH;
	}
}
