package com.company.java006;

import java.util.Scanner;

public class Repeat100 {
	public static void main(String[] args) {
		//변수
		//변수
				int num1 = 0;
				int num2 = 0;
				char i = ' ';
				double result = 0;
				Scanner scanner = new Scanner(System.in);
				
				//입력
				/* break(빠져나와!)/continue(밑에꺼 skip)
				 for(;;){ //1-1. 무한반복
				 	//#todo1 if(잘못썼으면) {숫자1입력받기  } -> if( !(0<=num1 && num1<=100)) {숫자1입력받기  }
				 	//#todo2 if(잘못썼으면) {숫자2입력받기  }
				 	//#todo2 if(잘못썼으면) {연산자입력받기  }
				 //1-2. 빠져나올조건-빠져나오기 break
				 }
				 */
				//num1=-1, num2=-1,num= ' '
				for(;;) {
					if( !(0<=num1 && num1<=100)) {  // 잘쓴범위가 아니라면 입력시도/ 잘쓴범위면 입력x
						System.out.print("숫자1 입력>"); num1 = scanner.nextInt();continue;
						//continue;   잘못입력받았으면 아래꺼 진행 안됨.
						// -1   101   10 [#]
					}
					if(0>num2 || num2>100) { //-1 || 101
						System.out.print("숫자2 입력>"); num2 = scanner.nextInt();continue;
						// -1 101    3[#]
					}
					if(i== '+'|| i=='-'|| i=='*'|| i=='/') {
						System.out.print("연산자 입력>"); i = scanner.next().charAt(0);continue;
						// +
					}// continue ; 잘못 입력받았으면 아래꺼 진행하면 안됨
					break;  // num1, num2, i 잘쓴경우
					
				}
				
				
				for(;;) {
					System.out.println("숫자(1)를 입력하세요");
					num1 = scanner.nextInt();
					// 잘 썻으면 빠져나와 / if(num1이 0~100 사이라면) {빠져나와}
					if(num1>=0 && num1<=100) {break;}
					}//for end			
				
				for(;;) {
					System.out.println("숫자(2)를입력하세요");
					num2 = scanner.nextInt();
					// 잘 썻으면 빠져나와 / if(num1이 0~100 사이라면) {빠져나와}
					if(num1>=0 && num1<=100) {break;}
				}//for end
				
				for(;;) {
					System.out.println("연산자를 입력해주세요");
					i=scanner.next().charAt(0);
					// 잘 썻으면 빠져나와 / if(i가 +,-,*,/' 이라면) {빠져나와}
					if(i== '+'|| i=='-'|| i=='*'|| i=='/') {break;}
				}
				
				

				
				//처리
				//만약에 if(i가 +라면) {+연산} 
				//else if (i가 -라면) {-연산} 
				//else if (i가 *라면) {*연산} 
				//else if (i가 /라면) {/연산}		
				     if(i=='+') {result=num1+num2;}
				else if(i=='-') {result=num1-num2;}
				else if(i=='*') {result=num1*num2;}
				else if(i=='/') {result=num1/(double)num2;}
				//출력
				System.out.println( "" + num1 + i + num2 + "=" + result);
			//  System.out.println( "num1" + "i" + "num2" + "=" + "result");
				System.out.printf("%d %s %d = %d" ,num1,i,num2,result);
					
			}
		}
