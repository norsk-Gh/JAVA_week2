package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long res = 1;
		
		for(int i=0; i<=10; i+=1) {
			if (i == 0) {
				res = 1;
			} else {
				res *= 10;
			}
			
			System.out.println(10 + " " + i + " = " + res);
		}
		
//		for(int i=0; i<10; i+=1) {
//			System.out.println(10 + " " + i + " = " + String.format("%15d", (res*=10)/10));
//		}
	}

}
