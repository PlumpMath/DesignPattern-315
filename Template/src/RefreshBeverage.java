package com.zxccy.template;

/*
 * �������
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
		System.out.println("�ѿ�ˮ���...");
		
	}
	
	protected abstract void Make();
	
	private void PourInfoCup() {
		System.out.println("���뱭����...");
		
	}

	protected abstract void Add();

	//���ӷ���
	protected boolean IsAdd() {
		return true;
	}
}
