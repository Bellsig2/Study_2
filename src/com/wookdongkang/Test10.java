package com.wookdongkang;
import java.util.Scanner;

public class Test10 {
	public static void main(String[]args) {
		//실행 중에 데이터 입력받을 준비
		
		System.out.println("=====Test10=====");
		Scanner sc = new Scanner(System.in);
		int input = 5;
		int output = 0;
		System.out.println("숫자를 입력하세요");
		input = sc.nextInt();
		
		
		output = input/4*10+input%4;
		System.out.println(input);
		System.out.println(output);
		
		//Github 사용하기
		//Code 추가
		
		
		//New code update
	}
}