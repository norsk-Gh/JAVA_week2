package com.javalec.base;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 학생수가 4명이고 과목이 3과목일 경우의 점수 합꼐와 평균 구하기 기능 추가
		
		Scanner scanner = new Scanner(System.in);
		
		String[] name = { "No.1", "No.2", "No.3", "No.4"};
		String[] subject = { "Korean", "English", "Math" };
		
		int[] koreanScore = new int[name.length];
		int[] englishScore = new int[name.length];
		int[] mathScore = new int[name.length];
		double[] totalOfScore = { 0, 0, 0, 0};
		
		
		
		for(int i = 0; i < subject.length; i+=1 ) {
			System.out.println(subject[i] + "의 성적을 입력 하세요.");
			
			for(int student = 0; student < name.length; student+=1) {
				System.out.print(name[student] + " 의 성적 : ");
				int value = scanner.nextInt();
				
				if (i == 0){ 
					koreanScore[student] = value;
				} 
//				else if (i==1) {
//					englishScore[student] = value;
//				} else {
//					mathScore[student] = value;
//				}
				
				totalOfScore[student] += value;
				
				
			}
		}
		
		System.out.println("\t\t" + "Korean" + "\t\t" + "English" + "\t\t" + "Mathmatics" + "\t" + "Total" + "\t\t" + "Average");
		
		for(int i = 0; i < name.length; i+=1 ) {
			System.out.print(name[i] + "\t\t" + koreanScore[i] + "\t\t" + englishScore[i] + "\t\t" + mathScore[i] + "\t\t" + totalOfScore[i] + "\t\t" + totalOfScore[i]/3);
			System.out.println("");
		}

	}

}
