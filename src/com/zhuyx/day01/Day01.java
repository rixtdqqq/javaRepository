package com.zhuyx.day01;

import java.util.ArrayList;

public class Day01 {
	public static void main(String[] args) {
		ArrayList<Xs> list = new ArrayList<>();
		Xs xs1= new Xs("»¢Æ¤1", 1, 81);
		Xs xs2= new Xs("»¢Æ¤2", 2, 82);
		Xs xs3= new Xs("»¢Æ¤3", 3, 83);
		Xs xs4= new Xs("»¢Æ¤4", 4, 84);
		Xs xs5= new Xs("»¢Æ¤5", 5, 85);
		Xs xs6= new Xs("»¢Æ¤6", 6, 86);
		list.add(xs1);
		list.add(xs2);
		list.add(xs3);
		list.add(xs4);
		list.add(xs5);
		list.add(1, xs6);
		for (int i = 0; i < list.size(); i++) {
			Xs xs = (Xs) list.get(i);
			System.out.println(xs.getScore());
		}
	}
	

}

class Xs{
	private String name;
	private int number;
	private int score;
	public Xs(String name, int number, int score) {
		this.name = name;
		this.number = number;
		this.score = score;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
	
}