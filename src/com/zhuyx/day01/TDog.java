package com.zhuyx.day01;

public class TDog {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		dog.eatFood(new I() {
			
			@Override
			public void eat(String food) {
				// TODO Auto-generated method stub
				System.out.println(food);
			}
		});
		
		dog.onClick();
	}
}
