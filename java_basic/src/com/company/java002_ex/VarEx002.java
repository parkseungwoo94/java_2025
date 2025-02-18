package com.company.java002_ex;

public class VarEx002 {
	public static void main(String [] args) {
	//정수형 1,2,3 %d
		int a = 10;//1-1정수형 1,2,3 %d
		a=10;//1-2
		int b = 3;//1-3  +  1-4
		
		System.out.println(10 + "+" + 3 + "=" + (a+b) ); 
		System.out.println(10 + "-" + 3 + "=" + (a-b) );
		System.out.println(10 + "*" + 3 + "=" + (a*b) );
		System.out.println(10 + "/" + 3 + "=" + (a/b) );
		
		System.out.printf("%d + %d = %d\n" ,a ,b ,a+b);
		System.out.printf("%d - %d = %d\n" ,a ,b ,a-b);
		System.out.printf("%d * %d = %d\n" ,a ,b ,a*b);
		System.out.printf("%d / %d = %d\n" ,a ,b ,a/b);
		
		// 정수 %d 1,2,3 실수 %f 1.1
		// 정수/정수 =정수 10/3=3/  정수/실수 , 실수/정수
		System.out.printf("%d / %d = %f\n" ,a ,b ,a/(float)b);
		
	}
	
	
}
