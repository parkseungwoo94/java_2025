package com.company.java007_ex;

public class Array2Ex002 {
	public static void main(String[] args) {
		int[][] arr2={{101,102,103},
				      {201,202,203}
		};
		//1 보이는대로
		System.out.print(arr2[0][0]+"\t"); System.out.print(arr2[0][1]+"\t"); System.out.print(arr2[0][1]+"\t");
		System.out.print(arr2[1][0]+"\t"); System.out.print(arr2[1][1]+"\t"); System.out.print(arr2[1][1]+"\t");
		System.out.println();
		
		//2 칸정리
		for(int i = 0; i<3; i++){System.out.print(arr2[0][i]+"\t");}
		System.out.println();

		//3 2중for문 완성
		for(int ch = 0; ch<3; ch++) {
		for(int i = 0; i<3; i++){System.out.print(arr2[ch][i]+"\t");}
		}
	}
}
/*연습문제10)  array
패키지명 : com.company.java007_ex
클래스명 :  Array2Ex002
배열을 이용하여 다음의 프로그램을 작성하시오.   
  
   int[][] arr2={{101,102,103},{201,202,203}};

   이중for 이용해서 출력하기*/