package com.company.java005_ex;

import java.util.Scanner;

public class ForEx002 {
	public static void main(String[] args) {
		
		//변수
		int dan;
		Scanner scanner = new Scanner(System.in); 
		//입력
		System.out.println("원하는 단을 입력하시오.");
		dan = scanner.nextInt();
		//처리
		
		//출력 2*1=2  2*2=4 이런식으로 나오게끔
//		System.out.println(2+"*"+1+"="+(2*1));
//		System.out.println(2+"*"+1+"="+(2*2));
//		System.out.println(dan+"*"+1+"="+(dan*1));
//		System.out.println(dan+"*"+2+"="+(dan*2));
		
		for (int i = 1; i<=9 ; i++){System.out.println(dan+"*"+i+"="+(dan*i));}
 		//변수i를 지정해서 1~9까지 1씩증가                ex )2    * 2  =    4
	}
	
}
/*
 * 연습문제2)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx002
출력내용 :   for 이용

   사용자에게 단을 입력받아 해당하는 
   단을 출력해주는 프로그램을 작성하시오. FOR문을 이용하시오.

 * */