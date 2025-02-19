package com.company.java003_ex;

import java.util.Scanner;

public class Repeat003 {
	public static void main(String[] args) {
		int kor, eng, math;
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("국어점수를 입력하시오"); kor = scanner.nextInt();
		System.out.println("영어점수를 입력하시오"); eng = scanner.nextInt();
		System.out.println("수학점수를 입력하시오"); math = scanner.nextInt();
		
		int total;
		
		total = kor + eng + math;
		float avg = (float)total/3;
		
		
		System.out.printf("총점 : %d\n", total);
		System.out.printf("평균 : %.4f", avg);
		
		
	}
}
