package com.zxccy.pattern;

/*
 * simple factory
 */
public class Factory {
	public static IOperate getOperate(String operateStr){
		IOperate operate = null;
		
		switch(operateStr){
			case "+":
				operate = new AddOperate();
				break;
			case "-":
				operate = new SubtractionOperate();
				break;
		}
		
		return operate;
	}
}
