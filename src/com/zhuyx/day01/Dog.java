package com.zhuyx.day01;

public class Dog {

	private I i;

	public void eatFood(I i){
		this.i=i;
	}
	
	public void onClick(){
		i.eat("rou");
	}
}
