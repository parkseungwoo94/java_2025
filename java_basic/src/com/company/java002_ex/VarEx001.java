package com.company.java002_ex;

public class VarEx001 {
	public static void main(String [] args) {
	// 자료형 변수명 ($_소문자7)
		int apple = 1000;  // 1-1
		apple = 2000;  // 1-2
		System.out.println("사과가격은 " + 1000 + "원입니다."); //1-3
		System.out.printf("사과가격은 %d 원입니다.\n", apple);
		
		apple=2000;  //1-4 a=b(b작업 a에 대입)
		
		System.out.println("사과가격은" + apple + "원이니다");
		System.out.printf("사과가격은 %d 원입니다.", apple);  //1-5 %d %f %s
		
		
	}
}
