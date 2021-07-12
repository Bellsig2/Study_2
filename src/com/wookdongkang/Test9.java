package com.wookdongkang;

public class Test9 {
	public static void main(String [] args) {
		System.out.println("=====테스트=====");
		double num = 10.2;
		double num2 = 3.3;
		double result1 = num / num2;
		double result2 = num % num2;
		System.out.println(result1);
		System.out.println(result2);
		
		int price = 11110;
		int money = 12350;
		int don = money - price;
		System.out.println("물건값의 합계 : " + price + "원");
		System.out.println("=======================");
		System.out.println("손님이 낸 돈 : " + money + "원");
		System.out.println("=======================");
		System.out.println("거스름돈 : " + don + "원");
		
		int man = don / 10000;
		int cheon= (don % 10000)/1000;
		int bak=(don % 1000)/100;
		int sip=(don % 100)/10;
		
		
		System.out.println(man);
		System.out.println(cheon);
		System.out.println(bak);
		System.out.println(sip);
	}
}
