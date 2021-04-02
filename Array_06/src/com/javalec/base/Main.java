package com.javalec.base;


import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = 0;
		int maxIndex = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.print("입력한 숫자의 개수 ? (100개 미만) : ");
		
		int inputValue = scanner.nextInt(); 
		
		if (inputValue >= 100) {
			while (inputValue >= 100) {
				System.out.print("숫자가 올바르지 않습니다. 다시 입력해주세요.: ");
				inputValue = scanner.nextInt();
			}
		}
		
		int[] numbers = new int[inputValue];
		
		System.out.println(inputValue + "개의 숫자를 입력하세요!");
		for(int i = 0; i < numbers.length; i+=1) {
			numbers[i] =  scanner.nextInt(); 
			if (max < numbers[i]) {
				max = numbers[i];
				maxIndex = i;
			}
		}
		
		System.out.print("입력한 숫자중 최대값은 " + max + "이고 " + (maxIndex + 1) + "번째 값 입니다." );
	}

}
