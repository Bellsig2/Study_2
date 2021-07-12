package com.wookdongkang;

public class Test8 {
	public static void main(String[]agrs) {
		System.out.println("Hello World");
		//물건값의 합계
		int price = 11110;
		//손님이 낸돈
		int money = 12350;
		//거스름돈
		int don = money - price;
		System.out.println("물건값의 합계 : " + price + "원");
		System.out.println("=======================");
		System.out.println("손님이 낸 돈 : " + money + "원");
		System.out.println("=======================");
		System.out.println("거스름돈 : " + don + "원");
		//물건값의 합계보다 손님이 낸 돈이 더 많다라는 가정
		//1. 물건값의 합계, 손님이 낸 돈, 거스름돈 출력
		
		
		int man = don / 10000;
		int get1 = don % 10000;
		int cheon = get1 /1000;
		int get2 = don % 1000;
		int bak = get2 /100;
		int get3 = don % 100;
		int sip = get3 /10;
		System.out.println("만원짜리 "+man+"장");
		System.out.println("천원짜리 " +cheon+"장");
		System.out.println("백원짜리 " + bak + "개");
		System.out.println("십원짜리 " + sip + "개");
	}

}
