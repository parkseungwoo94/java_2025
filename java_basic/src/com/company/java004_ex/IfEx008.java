package com.company.java004_ex;

import java.util.Scanner;

public class IfEx008 {
	public static void main(String[] args) {
		int  kor, eng, math, total;
		double avg;
		String num, jang = null, level, pass; 
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("학번을 입력하세요");
		num = scanner.next();
		System.out.println("국어점수입력>");
		kor = scanner.nextInt();
		System.out.println("영어점수입력>");
		eng = scanner.nextInt();
		System.out.println("수학점수입력>");
		math = scanner.nextInt();
		
		
		total = kor + eng + math;
		avg = total/3.0;
//		level = (int)avg/10;
		//평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
		if (avg >= 60 && kor > 39 && math > 39 && eng > 39 ) { pass = "합격"; }
		else                       { pass = "불합격";}
		
		
		if (avg>=95){
			jang = "장학생";
		}
		else if(avg<95) {
			jang = "노장학생";
		}
		if (avg>=90){
			level = "수";
			}
		else if (avg>=80) { 
			level = "우" ;
			}
		else if (avg>=70) {
			level = "미";
			}				
		else if (avg>=60) {
			level = "양";
			}
		else{
			level ="가";
		}
		
		System.out.println("=================================================================================== \r\n"
				+ "학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생\r\n"
				+ "===================================================================================");
		System.out.printf("%s %d %d %d %d %.2f %s %s %s",num,kor,eng,math,total,avg,pass,level,jang);
		
		
		
		
		/*
		 * 
		 * 연습문제8)  ※ 숙제
			패키지명 : com.company.java004_ex
			클래스명 :  IfEx008
			출력내용 :  성적처리 프로그램입니다.
			
			1. 총점 구하기
			2. 평균 구하기
			3. 평균이 60점이상이고  각과목이 40점 미만이면 아니라면 합격/ 아니면 불합격
			4. 평균이 95점이상이면 장학생
			5. 평균이  90점이상이면 수, 80점이상이면 우, 70점이상이면 미, 60점이상이면 양, 아니라면 가 
			
			학번 입력 > std111
			국어점수 입력 > 100
			수학점수 입력 > 100
			영어점수 입력 > 99
			=================================================================================== 
			학번   국어   영어   수학   총점   평균   합격여부   레벨   장학생
			=================================================================================== 
			std111   100   100   99   299   99.67   합격   수   장학생
		 * 
		 * */
	} //end psvm
} //end class
