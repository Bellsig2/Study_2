package com.wookdongkang;

public class Test6 {
	public static void main(String[]args) {
		System.out.println("Hello World");
		int num=5;
		double num2 = 3.12;
		num=(int)(num+num2);
		System.out.println(num);
		
		int kor = 63;
		int math = 35;
		int eng = 53;
		double total = kor + math + eng;
		System.out.println(total);
		
		// 자동형변환이 이루어지기 전 int / int의 계산이 먼저 이루어 지기 때문
		double avg = total / 3;
		System.out.println(avg);
		double num3 = 5.124;
		int result = (int)num3;
		System.out.println(result);
	}
}
