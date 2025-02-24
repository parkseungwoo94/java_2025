package com.company.java006;

import java.util.Scanner;

public class Repeat004 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int num = 0;
		
		for(;;) {
			System.out.println("숫자를 입력하세요.");
			
			num = scanner.nextInt();
			if(num==1) {System.out.println("1입력했으니 종료"); break;}
			
			
			}
			
			
		}
		
}

/*2)클래스명 : Repeat004
무한반복을 이용하여 1을 입력받을때까지 무한반복이 되는 프로그램을 작성하시오.*/