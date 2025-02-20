package com.company.java004_ex;

import java.util.Scanner;

public class IfEx006 {
	public static void main(String[] args) {
		//변수
		int num = 0;
		Scanner scanner = new Scanner(System.in);
		//입력
		System.out.println("숫자를입력하세요");
		num = scanner.nextInt();
		//처리
		//출력
		     if(num%2==1) {System.out.println("남자");}
		else if(num%2==0) {System.out.println("여자");}
		     
		
		
		
		
		/*
		 * 연습문제6)
			패키지명 : com.company.java004_ex
			클래스명 :  IfEx006
			출력내용 :숫자를 입력을 받아
				if(홀수면) {남자}, else if(짝수면) {여자}를 출력하는 프로그램을 작성하시오.
				※ num%2==0 짝수
		 * 
		 * */
		
	}
}
