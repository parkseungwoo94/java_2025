package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx004 {
	public static void main(String[] args) {
		//변수-입력-처리-출력
		//변수
		int kor, eng, math, total; double avg;
		Scanner scanner = new Scanner(System.in);
		//입력 -국,영,수
		System.out.print("국어점수를 입력하시오."); kor = scanner.nextInt();
		System.out.print("영어점수를 입력하시오."); eng = scanner.nextInt();
		System.out.print("수학점수를 입력하시오."); math = scanner.nextInt();
		
		
		//처리 -총점, 평균 A=B (B를 처리해서 A에 담기-대입)
		total = kor + eng + math;
		avg = total/3.0;// 정수/정수 = 정수  299/3 몫 > 해결방안)정수/실수    (float)
		//출력 -총점, 평균 출력
		System.out.printf("총점 : %d \n평균 : %.2f", total, avg);// 299 99.67
		
		/*
		float grade1,grade2,grade3 = 0f;
		Scanner scanner = new Scanner(System.in);
		System.out.println("국어점수를 입력하시오.");
		grade1 = scanner.nextFloat();
		System.out.println("영어점수를 입력하시오.");
		grade2 = scanner.nextFloat();
		System.out.println("수학점수를 입력하시오.");
		grade3 = scanner.nextFloat();
		
		System.out.printf("총점 : %.0f\n", grade1+grade2+grade3);
		System.out.printf("평균 : %.2f", (grade1+grade2+grade3)/3);
		*/
		
		
		
	}
}
