package com.company.java006_ex;

public class ArrayEx004 {
	public static void main(String[] args) {
		char []ch = {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		int count = 0;
		
		//ver-1 'B'가 소문자:a라면 {갯수세기}
		//      'a'가 소문자:a라면 {갯수세기}
		//ver-2 if('B'가 소문자:a라면) {갯수세기}
		//      if('a'가 소문자:a라면) {갯수세기}
		
		//ver-3 if(ch[0] =='a') {갯수세기}
		//      if(ch[1] =='a') {갯수세기}
		//처리
		for(int i = 0; i<ch.length; i++) {
			if(ch[i]=='a') {/*count = count +1;*/count++;}
		
		}
		System.out.println(count+"개");
	}//end psvm
} //end class
/*연습문제4)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx004
    1. 배열명 : ch
    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
    3. ch 배열에서 a의 갯수 세기*/