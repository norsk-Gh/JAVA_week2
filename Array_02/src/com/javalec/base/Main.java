package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int[] inputValue = new int[3];
		int totalOfSum = 0;
		double average = 0;
		Scanner scanner = new Scanner(System.in);
		
		
		// 사용자로부터 정보 입력 받아서 배열에 넣기
		System.out.println("계산할 숫자 "+ inputValue.length + "개를 넣으세요.");
		
		for(int i = 0; i < inputValue.length; i+=1) {
			inputValue[i] = scanner.nextInt();
			// 입력한 정보의 합계 구하기
			totalOfSum += inputValue[i];
		}
		
		// 입력한 정보의 평균 구하
		average = (double)totalOfSum / inputValue.length;
		
		// 입력한 정보 출력하기
		System.out.println("귀하가 입력한 정보는 다음과 같습니다.");
		
		for(int i = 0; i < inputValue.length; i++) {
			System.out.print(inputValue[i] + "\t");
		}
		
		System.out.println("");
		System.out.println("Total of your input numbers : " + totalOfSum);
		System.out.println(String.format("%6.3f", average));		
		
		
		// TODO Practice Array
		
//		System.out.print("글자수를 입력해주세요. : ");
//		int countOfText; = scanner.nextInt() 
//		//char[] inputText = new char[]
	}
}
