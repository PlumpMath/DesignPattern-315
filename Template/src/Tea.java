package com.zxccy.template;

public class Tea extends RefreshBeverage {

	@Override
	protected void Make() {
		System.out.println("�ÿ�ˮ���ݲ�Ҷ5����...");
	}

	@Override
	protected void Add() {
		System.out.println("�����������...");
	}
	
	@Override
	protected boolean IsAdd(){
		return false;
	}

}
