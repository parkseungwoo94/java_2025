package com.company.java002_ex;

import java.util.Scanner;

public class DataTypeEx002 {
	public static void main(String[] args) {
		//gigo
		// 변수
		int like;
		Scanner scanner = new Scanner(System.in);
		// 입력
		System.out.print("좋아하는 수(정수) 입력하시오 > ");
		like = scanner.nextInt();
		// 처리x
		
		// 출력
		System.out.print("좋아하는 숫자는 "+like+" 입니다.");
		System.out.printf("좋아하는 숫자는 %d 입니다." , like);
		
	}
}