package com.zxccy.template;

/*
 * 抽象基类
 */
public abstract class RefreshBeverage {
	
	public final void GetBevarage(){
		BoilWater();
		Make();
		PourInfoCup();
		if(IsAdd()){
			Add();
		}
		
	}

	private void BoilWater() {
		System.out.println("把开水煮沸...");
		
	}
	
	protected abstract void Make();
	
	private void PourInfoCup() {
		System.out.println("倒入杯子中...");
		
	}

	protected abstract void Add();

	//钩子方法
	protected boolean IsAdd() {
		return true;
	}
}
