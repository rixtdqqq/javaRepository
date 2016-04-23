package com.zhuyx.day01;

import java.lang.reflect.Method;

public class TestC {

	public static void main(String[] args) {

		TestC tc = new TestC();
		C c = new Worker();
		tc.t(c);
		c = new  Farmer();
		tc.t(c);
		
BH<WJ> hh = new BH<WJ>(new WJ());
hh.abcd();
		/*HashMap<String, String> map = new HashMap<>();
		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");

		Iterator<String> it = map.keySet().iterator();
		while (it.hasNext()) {
			String element = it.next().toString();
			String string = map.get(element);
			System.out.println(element);
			System.out.println(string);
		}*/


	}

	private void t(C c) {
		// TODO Auto-generated method stub
		String feed = c.feed(10);
		String play = c.play("abc");
		System.out.println(feed+"---"+play);

	}
}
class WJ{
	public void play(){
		System.out.println("gfq");
	}
	public int add(int a, int b){
		return a+b;
	}
}
class BH<L>{
	private L l;
	public  BH(L l){
		this.l = l;
	}

	public void abcd(){
		System.out.println("������"+l.getClass().getName());
		Method[] methods = l.getClass().getDeclaredMethods();
		for (Method method : methods) {
			System.out.println(method.getName());
		}
	}
}
