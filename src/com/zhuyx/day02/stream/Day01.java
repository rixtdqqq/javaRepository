package com.zhuyx.day02.stream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class Day01 {

	public static void main(String[] args) throws IOException {
		/*ByteArrayOutputStream baos=new ByteArrayOutputStream();
		DataOutputStream dos=new DataOutputStream(baos);
		dos.writeInt(123456);
		
		byte[] arg0=baos.toByteArray();
		ByteArrayInputStream bais=new ByteArrayInputStream(arg0);
		DataInputStream dis=new DataInputStream(bais);
		int read = dis.readInt();
		System.out.println(read+"");*/
		
		
		/*PrintStream ps=new PrintStream("f:/1.txt");
		System.setOut(ps);
		System.out.println("大家好");*/
		
		/*PrintStream ps1=null;
		PrintStream ps2=null;
		Scanner sc=null;
		
		try {
			ps1 = new PrintStream("f:/a.txt");
			ps2 = new PrintStream("f:/b.txt");
			sc = new Scanner(System.in);
			System.setOut(ps1);
			System.setErr(ps2);
			while (true) {
				int a = sc.nextInt();
				System.out.println(a);
			} 
		} catch (Exception e) {
			// TODO: handle exception
			System.err.println("输入有误");
		}*/
		
		
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("f:/a.txt"));
		
		Student s=new Student("星星", 10, 55.5f);
		Student ss=null;
oos.writeObject(s);
		
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("f:/a.txt"));
			ss=(Student) ois.readObject();
			System.out.println(ss.age);
			System.out.println(ss.name);
			System.out.println(ss.score);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
	}
}
class Student implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 String name;
	 int age;
	 transient float score;//transient的作用是忽略外界传入的数据
	public Student(String name, int age, float score) {
		// TODO Auto-generated constructor stub
		this.name=name;
		this.age=age;
		this.score=score;
		
		
	}
}
