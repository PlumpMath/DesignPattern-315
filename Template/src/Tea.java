package com.zxccy.template;

public class Tea extends RefreshBeverage {

	@Override
	protected void Make() {
		System.out.println("用开水浸泡茶叶5分钟...");
	}

	@Override
	protected void Add() {
		System.out.println("假如少许蜂蜜...");
	}
	
	@Override
	protected boolean IsAdd(){
		return false;
	}

}
