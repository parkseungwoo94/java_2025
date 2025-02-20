package com.company.java004_ex;

import java.util.Scanner;

public class IfEx003 {
	public static void main(String[] args) {
		//변수
		int a;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("숫자를 입력하세요");
		a = scanner.nextInt();
		//처리	
		//출력
		if     (a==1) {System.out.println("one");}
		else if(a==2) {System.out.println("two");}
		else if(a==3) {System.out.println("three");}
		else {System.out.println("1,2,3이 아니다.");}
		
		/*
		 * 연습문제3)
			패키지명 : com.company.java004_ex
			클래스명 :  IfEx003
			출력내용 : 숫자한개를 입력받아 
			   만약 1을 입력했다면   one ,   
			   만약 2을 입력했다면   two ,
			   만약 3을 입력했다면   three ,
			   1,2,3이 아니라면  1,2,3이 아니다를 출력하는 프로그램을 작성하시오.


		 * 
		 * 
		 * */
		
	}
}
