package com.wookdongkang;

public class Test7 {
	public static void main(String[]args) {
		System.out.println("Hello world");
		int kor = 56;
		int eng = 65;
		int math = 49;
		int total = math + eng + kor;
		double avg = total / 3.0;
		System.out.println(total);
		System.out.println(avg);
		avg = avg*100;
		int result = (int)avg;
		avg = result / 100.0;
		System.out.println(avg);
	}
}
