package com.company.java005_ex;

import java.util.Scanner;

public class ForEx001 {

	public static void main(String[] args) {
		System.out.println("q1\n");
		for( int a = 1; a<=5;a++)
		{
			System.out.print(a);
		}
		System.out.println("\nq2");
		for(int a =5; a>=1;a--)
		{
			System.out.print(a);
		}
		
//		for(int a = 0;)
//		{System.out.println();}
		//java1 java2 java3
		System.out.println("\nq3");
		for(int i = 1; i<=3;i++){System.out.println("java"+i);}

		System.out.println("\nq4");
		//HAPPY3   HAPPY2  HAPPY1
		for(int i = 3; i>=1;i--){System.out.println("happy"+i);}
		
		System.out.println("\nq5");
		for(int b =0; b<=2; b++){System.out.println(b);}
		
		System.out.println("\nq6");
		for(int a =0; a<=99; a++){System.out.println(a);}
		
		System.out.println("\nq7");
		for(int a =99; a>=1; a--){System.out.println(a);}
		
		System.out.println("\nq8");
		for(int a =0; a<=8; a+=2){System.out.println(a);}
		
		System.out.println("\nq9");
		for(int a =0; a<18; a+=2){System.out.println(a);}
		
	}

}
/*
 * 연습문제1)  
패키지명 : com.company.java005_ex
클래스명 :  ForEx001
출력내용 :   for 이용
q1  for문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5 
q2  for문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1 
q3  for문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3  
q4  for문을 이용해서 다음과 같이 출력하시오 :  HAPPY3   HAPPY2  HAPPY1  
q5  for문을 이용해서 다음과 같이 출력하시오 :  0,1,2  
q6  for문을 이용해서 다음과 같이 출력하시오 :   0,1,2, ,,,중간생략 ,,, 99  
q7  for문을 이용해서 다음과 같이 출력하시오 :   10, 9,,,,중간생략 ,,, , 1 
q8  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 
q9  for문을 이용해서 다음과 같이 출력하시오 :   0, 2, 4, 6, 8 ,,,중간생략 ,,, 18 
 * */