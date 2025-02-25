package com.company.java007_ex;

public class Repeat004 {
	public static void main(String[] args) {
		int arr[]= {1,2,3};
		//[1번지]{1,2,3} ← arr:1번지  3갯수: 0~2 인덱스번호
		System.out.print(arr[0]+"\t");
		System.out.print(arr[1]+"\t");
		System.out.print(arr[2]+"\t");  System.out.println();
		
		//{}   {변수}   for(시작;종료;변화)
		for (int i = 0; i<arr.length; i++){System.out.print(arr[i]+"\t");}
		
		
	}
}
/*배열명 : arr
 * 값 : 1,2,3
 * for+lenght 를 이용하여 배열안의 1,2,3을 출력하세요.*/
 