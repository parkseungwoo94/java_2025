package com.company.java003_ex;

import java.util.Scanner;

public class CastingEx001 {
	public static void main (String[] args) {
		
		int num1, num2;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자입력1 >"); 
		num1 = scanner.nextInt();
		
		System.out.println("숫자입력2 >"); 
		num2 = scanner.nextInt();
		
		double result = (double)num1/num2;
		//String.format("출력서식", 처리할값)
		System.out.println(num1+ "/" +(byte)num2+ "="+ String.format("%.2f",result));  // ##
		System.out.printf("%d/$d = %.2f",num1,num2,result);
		/*
		 * 연습문제4)
			패키지명:com.company.java003_ex
			클래스명:CastingEx001
			출력내용:Scanner.이용해서 나누기 프로그램만들기
				숫자입력1 > _입력받기 10 (자료형을int)
				숫자입력2 > _입력받기 3 (자료형을int)
			
				10 / 3=3.33
			
			   1단계) 변수 - 입력 - 처리 - 출력

		 * */
	}
}
