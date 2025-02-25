package com.company.java007_ex;

import java.util.Scanner;

public class Repeat002 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.println("a,b,c중 입력하세요");
		ch=scanner.next().charAt(0);
		
		
		switch(ch) {
		case 'a' :System.out.println("a이면 apple"); break;
		case 'b' :System.out.println("b이면 banana"); break;
		case 'c' :System.out.println("c이면 coconut"); break;
			
		}
	}
}
/*숫자를 한개입력받아
 * switch ver- a가 'a'이면 apple, 'b'이면 banana. 'c'이면 coconut*/
