//2021.11.25(목)11:49수업, 14:18수업_StaticMethod()//Done/2021.12.14(화)22:22 staticField·Method, finalField, staticFinal(≒constant)

package com.javaex.ex09;

public class MyMathApp {
	
	// 필드: 필요 없음

	// 생성자: 디폴트생성자 사용 

	// 메소드gs: 필드 없음

	// 메소드 일반
	public static void main(String[] args) {
		
		MyMath myMath = new MyMath();
		
		double sum01 = MyMath.plus(3, 6);
		System.out.println(sum01);
		
		double sum02 = MyMath.plus(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03 = MyMath.plus(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = MyMath.plus(20, 99.9);
		System.out.println(sum04);
	}
	
}	
		/*
		MyMath클래스를 메모리에 올리고 그 안에 있는 plus.Method를 쓰려고 이 클래슬 만듦
		
		디폴트 생성자 생길 거 알고 생성자 안 만든 거야
		  
		*/
		
		
		/*
		int sum01 = myMath.plus(3, 6);
		System.out.println(sum01);
		
		double sum02 = myMath.plus(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03 = myMath.plus(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = myMath.plus(20, 99.9);
		System.out.println(sum04);
		
		/*아래처럼 일일이 doub인지 int인지 구분하지 말자
		int sum01 = myMath.plusInt(3, 6);
		System.out.println(sum01);
		
		double sum02 = myMath.plusDouble(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03 = myMath.plusDoubleInt(5.5, 9);
		System.out.println(sum03);
		
		double sum04 = myMath.plusIntDouble(20, 99.9);
		System.out.println(sum04);
		*/
		
/*
 * 매개변수가 double인지 int인지 파악해서 일일이 plusDouInt인지 plusD인지 구분하기 싫을 때, 같은 이름의 메소드가 다
 * 사용할 수 있게 해주는 기능 = method overloading
 */