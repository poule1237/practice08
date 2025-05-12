package com.javaex.ex06;

public class PointApp {

	public static void main(String[] args) {
		
		Point p1 = new Point(2, 3);
		Point p2 = new Point(2, 3);
		Point p3 = new Point(5, 3);
		Point p4 = p1;
		
		System.out.println(p1 == p2);         
		System.out.println(p2 == p3);
		System.out.println(p3 == p4);
		System.out.println(p4 == p1);		
		System.out.println(p1.equals(p2));
		System.out.println(p4.equals(p1));
		
		//Point 클래스에서 equals() 메소드를 명시적으로 오버라이드하지 않았더라도, 
		//자바의 모든 클래스는 Object 클래스를 상속받기 때문에 Object 클래스의 equals() 메소드가 기본적으로 사용된다
	}

}


