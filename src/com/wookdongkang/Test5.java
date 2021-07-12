package com.wookdongkang;

public class Test5 {
	public static void main(String[]args) {
		System.out.println("Hello World");
		int num=5;
		num = num+1;
		//int num=3;
		int num1 = 3;
		long num2 = 9L;
		
		num1=(int)num2;
		System.out.println(num1);
		
		num1 = 3;
		//num2 = (long)num1;
		num2 = num1;
		System.out.println(num2);
		
		char ch ='a';
		int num3 = ch;
		System.out.println(num3);
		
		ch=(char)(num3+25);
		System.out.println(ch);
		
		
		
	}
}
