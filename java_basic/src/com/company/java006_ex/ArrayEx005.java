package com.company.java006_ex;

public class ArrayEx005 {
	public static void main(String[] args) {
		char []ch = {'B' , 'a' , 'n' , 'a', 'n' , 'a'};
		int count1=0, count2 = 0;
		// ver-1('B'가 대문자라면){갯수세기}
		//      ('a'가 소문자라면){갯수세기}
		// ver-2 if(ch[0]>='A' && ch[0]<='Z'){갯수세기}
		//      else if(ch[0]>='a' && ch[0]<='z'){갯수세기}
		/* ver-3
		if(ch[0]>='A' && ch[0]<='Z'){count1++;}
		 else if(ch[0]>='a' && ch[0]<='z'){count2++;}
		

		if(ch[1]>='A' && ch[1]<='Z'){count1++;}
		 else if(ch[1]>='a' && ch[1]<='z'){count2++;}*/
		for(int i = 0; i<ch.length;i++){if(ch[i]>='A' && ch[i]<='Z'){count1++;}
		 else if(ch[i]>='a' && ch[i]<='z'){count2++;}}
		
		
		System.out.println("대문자의갯수는>"+count1);
		System.out.println("소문자의갯수는>"+count2);
	}
}
/*연습문제5)  array
패키지명 : com.company.java006_ex
클래스명 :  ArrayEx005
    1. 배열명 : ch
    2. 값 넣기 : 'B' , 'a' , 'n' , 'a', 'n' , 'a'
    3. ch 배열에서 대문자의 갯수카운트, 소문자의 갯수 카운트*/