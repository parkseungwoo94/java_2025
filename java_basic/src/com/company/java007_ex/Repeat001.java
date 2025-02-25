package com.company.java007_ex;

import java.util.Scanner;

public class Repeat001 {
	public static void main(String[] args) {
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		System.out.println("a,b,c중 입력하세요");
		ch=scanner.next().charAt(0);
		
		if(ch=='a') {System.out.println("a이면 apple");}
		else if(ch=='b') {System.out.println("b이면 banana");}
		else if(ch=='c') {System.out.println("c이면 coconut");}
		
	}
}
/*숫자를 한개 입력받아
 * if ver-a가 'a'이면 apple, 'b'이면 banana, 'c'이면 coconut 
 * */
