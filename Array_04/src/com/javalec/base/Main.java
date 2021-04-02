package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 

		Scanner scanner = new Scanner(System.in);

		String[] name = { "James", "Cathy", "Kenny", "Martin", "Crystal"};

		int[] inputValue = new int[name.length];
		
		int totalOfSum = 0;
		double average = 0;
		
		String heighest = "";
		int height = 0;
		
		String shortest = "";
		int shorts = 1000;
		
		for(int i=0; i<name.length; i+=1) {
			System.out.print(name[i] + "의 신장을 입력하세요!");
			inputValue[i] = scanner.nextInt(); 
			totalOfSum += inputValue[i];
			
			if(height < inputValue[i]) {
				heighest = name[i];
				height = inputValue[i];
			} 
			else if (height == inputValue[i]) {
				heighest = heighest + " 그리고 " + name[i];
			}// 복수일 경
			
			if(shorts > inputValue[i]) {
				shorts = inputValue[i];
				shortest = name[i];
			}
			else if (shorts == inputValue[i]) {
				shortest = shortest + " 그리고 " + name[i]; 
			}// 복수일 경
			
		}
		
		average = totalOfSum / name.length;
		
		System.out.println("평균신장은 : " + average);
		System.out.println("가장 큰 학생은 "+ heighest + "이고 그 학생(들)의 키는 " + height + "이다.");
		System.out.println("가장 작은 학생은 "+ shortest + "이고 그 학생(들)의 키는 " + shorts + "이다.");
		
	}

}
