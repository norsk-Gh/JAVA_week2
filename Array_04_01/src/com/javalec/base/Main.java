package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String[] name = { "James", "Cathy", "Kenny", "Martin", "Crystal"};
		int[] inputValue = new int[name.length];
		int total = 0;
		double average = 0;
		
		int heightMax = 0;
		int heightMaxIndex = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i=0; i<name.length; i+=1) {
			System.out.print(name[i] + "의 신장을 입력하세요!");
			inputValue[i] = scanner.nextInt(); 
			
		}
		
		for(int i = 0; i < name.length; i++) {
			total += inputValue[i];
		}
		
		average = (double)total / name.length;
		
		// 가장 큰 신장
		for(int i = 0; i < name.length; i ++) {
			if(inputValue[i] > heightMax) {
				heightMax = inputValue[i];
				heightMaxIndex = i;

			}
		}
		System.out.println("평균 신장" + String.format("%.2f", average));
		System.out.println("가장 큰 학생은 "+ name[heightMaxIndex] + "이고 그 학생(들)의 키는 " + heightMax + "이다.");
		
	}

}
