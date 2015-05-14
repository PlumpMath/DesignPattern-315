package com.zxccy.pattern;

/*
 * abstraction
 */
public class SubtractionOperate implements IOperate {

	@Override
	public double operate(double a, double b) {
		return a - b;
	}
}
