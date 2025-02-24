package com.company.java006;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		int a = 0;
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요");
		a = scanner.nextInt();
		
		
		     if(a==10) {System.out.println("10이다.");}
		else if(a==20) {System.out.println("20이다.");}
		else if(a==30) {System.out.println("30이다.");}
	}

}
/*
 * 1)클래스명 : Repeat001
숫자를 한개 입력받아 
if ver - a가 10이면 10이다, 20이면 20이다, 30이면 30이다
 */