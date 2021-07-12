package com.wookdongkang;

public class Test1 {
	public static void main(String[]args) {
		System.out.println("Hello World!");
		//정수 형태 값을 대입
		//변수 선언 공삭
		//데이터타입 변수명;
		int num;
		//초기화
		num = 100;
		
		//변수 선언과 동시에 초기화
		long num2 = 100L;
		
		//실수 형태 값 선언
		float num3;
		num3 = 1.123F;
		
		double num4 = 1.123;
		System.out.println("num : " + num);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		System.out.println("num4 : " + num4);
		
		//char type
		char ch = '강';
		char ch2 = '한';
		System.out.println(ch);
		System.out.println(ch2);
		
		//논리형, true, false
		boolean flag;
		flag = num>200;
		
		System.out.println("flag : "+flag);
		
	}
}
