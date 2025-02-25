package com.company.java007_ex;

import java.util.Arrays;

public class Array2Ex004 {
	public static void main(String[] args) {
		char[][]arr = new char[2][3];
//		ver-1
//		arr[0][0] = 'A';
//		arr[0][1] = 'B';
//		arr[0][2] = 'C';
//		
//		arr[1][0] = 'D';
//		arr[1][1] = 'E';
//		arr[1][2] = 'F';
		
//		ver-2
//		char data = 'A';
//		arr[0][0] = data++; arr[0][1] = data++; arr[0][2] = data++;
//		data = 'B';
//		arr[1][0] = data++; arr[1][1] = data++; arr[1][2] = data++;
		
//		ver-3
//		char data = 'A';
//		for(int kan = 0; kan<ch[0].length; kan++){ch[0][kan] = data++;}
		
//		data = 'B'; // 한층이 끝나고 해야할일
//		for(int kan = 0; kan<ch[1].length; kan++){ch[1][kan] = data++;}
		
		char data = 'A';
		for(int ch = 0; ch<arr.length; ch++) {
			{for(int kan = 0; kan<arr[ch].length; kan++){
				arr[ch][kan] = data++;}
			}
		}
		System.out.println(Arrays.deepToString(arr));
	}
}
/*연습문제12)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex004
배열을 이용하여 다음의 프로그램을 작성하시오.   
1. new 연산자 이용하여 다차원배열만들기
2. for + length 이용해서 대입   
3. for + length 이용해서 출력 
   A   B   C
   B   C   D*/