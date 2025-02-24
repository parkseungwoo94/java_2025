package com.company.java006_ex;

public class RepeatEx007 {
	public static void main(String[] args) {
		
		for(int i = 1; i<6; i++) { System.out.print(i + "\t");  }      System.out.println();
		int i = 1; while(i<6) { System.out.print(i + "\t"); i++;}    System.out.println();
		i=1; do {System.out.print(i + "\t"); i++;}while(i<6);        System.out.println();
		
		
		for(int i1 = 5; i1>0; i1--) { System.out.print(i1 + "\t");  }     System.out.println();
		int i1 = 5; while(i1>0) { System.out.print(i1 + "\t"); i1--;}   System.out.println();
		i1 = 5; do { System.out.print(i1 + "\t"); i1--;}while (i1>0);   System.out.println();
		
		
		for(int i2 = 1; i2<=3; i2++) {System.out.print("java"+i2);}              System.out.println();
		int i2=1; while(i2<=3) {System.out.print("java"+i2); i2++;};             System.out.println();
		i2=1; do {System.out.print("java"+i2); i2++;}while(i2<=3);               System.out.println();
	}
}
/*연습문제7)  for/while/do while
패키지명 : com.company.java006_ex
클래스명 : RepeatEx007
1.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  1 2 3 4 5
2.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  5 4 3 2 1
3.  for , while , do while문을 이용해서 다음과 같이 출력하시오 :  JAVA1   JAVA2  JAVA3
*/