package com.company.java004_ex;

import java.util.Scanner;

public class IfEx005 {
	public static void main(String[] args) {
		//변수
		char ch = ' ';
		Scanner scanner = new Scanner(System.in);
		
		//입력
		System.out.println("문자한개 입력하세요");				
		ch =   scanner.next().charAt(0);
		//처리
		//출력
		     if(ch>='A' && ch<='Z') {System.out.println(  (char)(ch+32) );}
		else if(ch>='a' && ch<='z') {System.out.println(  (char)(ch-32) );}
	//	else                        {System.out.println("알파벳을 입력해주세요.");}  
		     
		/*
		 * 연습문제5)
			패키지명 : com.company.java004_ex
			클래스명 :  IfEx005
			출력내용 : 문자한개를 입력받아
				 (대문자이면)  {소문자로}, (소문자이면) {대문자로} 변경하는 프로그램을 작성하시오
				※ a= 'A' + 32
		 * 
		 * */
		
		
	}
}
