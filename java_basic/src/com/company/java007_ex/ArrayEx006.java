package com.company.java007_ex;

public class ArrayEx006 {
	public static void main(String[] args) {
		//double[] arr = {1.1  , 1.2  , 1.3  , 1.4  , 1.5};
		double[] arr = new double[5]; // new(공간) double(자료형)  [5]갯수
		arr[0]= 1.1;
		arr[1]= 1.2;
		arr[2]= 1.3;
		arr[3]= 1.4;
		arr[4]= 1.5;
		
		for(int i = 0; i<arr.length; i++) {System.out.println(arr[i]);}
		
	}
}
/*연습문제6)  array
패키지명 : com.company.java007_ex
클래스명 :  ArrayEx006
    new 연산자 이용해서 배열만들기
    1. 배열명 : arr     
    2. 값 넣기 : 1.1  , 1.2  , 1.3  , 1.4  , 1.5    for+length 이용해보기
    3. for + length 로 출력*/