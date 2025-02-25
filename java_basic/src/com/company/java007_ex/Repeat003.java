package com.company.java007_ex;

public class Repeat003 {
	public static void main(String[] args) {
		
		int[] arr = {10,20,30};
		
		for(int i = 0; i<arr.length; i++) {System.out.println(arr[i]);}
		
		int i = 0; while( i<arr.length) {System.out.println(arr[i] );i++;}
		
		i = 0;  do {System.out.println(arr[i] );i++;}while( i<arr.length);
	}
}
/*for,while,do while 3가지 버젼으로 10 20 30 출력*/