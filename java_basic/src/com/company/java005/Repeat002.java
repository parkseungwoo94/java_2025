package com.company.java005;

public class Repeat002 {
	public static void main(String[] args) {
		//step1
		System.out.println("step1) ");
		System.out.print(1+"\t");   //{}     시작1
		System.out.print(2+"\t"); 
		System.out.print(3+"\t"); 

		System.out.println("\nstep2) "); //1: {} 2: {}안에 바뀌는 변수 찾기 3: for(시작; 종료; 변화) {}
		for(int a = 1; a<=3; a++)
		{System.out.print(a+"\t");  }
		

		System.out.println("\nstep3) ");
		for(int a = 1; a<=10; a++)
		{System.out.print(a+"\t");  }  System.out.println();
		for(int a = 3; a<=8; a++)
		{System.out.print(a+"\t");  }  System.out.println();
		for(int a = 1; a<=100; a++)
		{System.out.print(a+"\t");  }  System.out.println();

		for(int a = 1; a<=5; a+=2)
		{System.out.print(a+"\t");  }  System.out.println();
		

		for(int a = 10; a>=1; a--)
		{System.out.print(a+"\t");  }  System.out.println();
	}
	}
