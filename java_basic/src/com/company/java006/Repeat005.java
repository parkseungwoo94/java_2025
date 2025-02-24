package com.company.java006;

import java.util.Scanner;

public class Repeat005 {
	public static void main(String[] args) {
		//변수
		int num1 = 0;
		int num2 = 0;
		char i = ' ';
		double result = 0;
		Scanner scanner = new Scanner(System.in);
		
		//입력   
		for(;;) {
			System.out.println("숫자(1)를 입력하세요");
			num1 = scanner.nextInt();
			// 잘 썻으면 빠져나와 / if(num1이 0~100 사이라면) {빠져나와}
			if(num1>=0 && num1<=100) {break;}
			}//for end			
		
		for(;;) {
			System.out.println("숫자(2)를입력하세요");
			num2 = scanner.nextInt();
			// 잘 썻으면 빠져나와 / if(num1이 0~100 사이라면) {빠져나와}
			if(num1>=0 && num1<=100) {break;}
		}//for end
		
		for(;;) {
			System.out.println("연산자를 입력해주세요");
			i=scanner.next().charAt(0);
			// 잘 썻으면 빠져나와 / if(i가 +,-,*,/' 이라면) {빠져나와}
			if(i== '+'|| i=='-'|| i=='*'|| i=='/') {break;}
		}
		
		

		
		//처리
		//만약에 if(i가 +라면) {+연산} 
		//else if (i가 -라면) {-연산} 
		//else if (i가 *라면) {*연산} 
		//else if (i가 /라면) {/연산}		
		     if(i=='+') {result=num1+num2;}
		else if(i=='-') {result=num1-num2;}
		else if(i=='*') {result=num1*num2;}
		else if(i=='/') {result=num1/(double)num2;}
		//출력
		System.out.println( "" + num1 + i + num2 + "=" + result);
	//  System.out.println( "num1" + "i" + "num2" + "=" + "result");
		System.out.printf("%d %s %d = %d" ,num1,i,num2,result);
			
	}
}
/*연습문제6)  for 무한반복
패키지명 : com.company.java004_ex
클래스명 :  ForEx006
출력내용 :  계산기

1)  각 연산자에 맞게 계산처리
2)  숫자1, 숫자2는 0~100사이만 입력가능하게 아니면 무한반복
3)  연산자는 +, - ,*, /만 입력가능하게 아니면 무한반복
     

1. 정수를 하나 입력해주세요 > 10
2. 정수를 하나 입력해주세요 > 3
3. 연산자를 입력해주세요(+,-,*,/) > +
10+3=13*/