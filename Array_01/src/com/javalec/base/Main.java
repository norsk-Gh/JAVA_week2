package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// 초기값이 없는 배열 선언 및 데이터 추가하기
		
//		String[] str = new String[7];
//		
//		str[0] = "Sun.";
//		str[1] = "Mon.";
//		str[2] = "Tue.";
//		str[3] = "Wed.";
//		str[4] = "Thu.";
//		str[5] = "Fri.";ß
//		str[6] = "Sat.";

		
		String[] str = {"Sun.", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };
		
		System.out.println(str); // res => [Ljava.lang.String;@10bbd20aç
		System.out.println(str[1] + "," + str[3] + "," + str[5]); // res => Mon.,Wed.,Fri.

		// 초기값이 없는 배열 선언 및 데이터 추가하기
		
		
		for(int i=0; i<str.length; i+=1) {
			System.out.print(str[i] + " ");
		} // res ==> Sun. Mon. Tue. Wed. Thu. Fri. Sat. 
		
		
	}

}
