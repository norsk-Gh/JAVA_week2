package com.javalec.base;

public class Main {

	public static void main(String[] args) {
		int[] arrayOne = { 10, 20, 30, 40, 50};
		int[] arrayTwo = arrayOne;
		
		for(int i=0; i<arrayOne.length; i++) {
			System.out.print("First Array: " + arrayOne[i] + "/\t");
			System.out.println("Second Array: " + arrayTwo[i]);
			
		}
		
		arrayTwo[0] = 100;
		arrayTwo[1] = 200;
		arrayTwo[2] = 300;
		arrayTwo[3] = 400;
		arrayTwo[4] = 500;
		
		for(int i = 0; i<arrayOne.length; i++) {
			System.out.print("First Array:" + arrayOne[i] + "/\t");
			System.out.println("Second Array: " + arrayTwo[i]);
		}
		
		int[] arrayThree = new int[arrayOne.length];
		arrayThree = arrayOne; //Call by reference
	
//		for(int i = 0; i<arrayOne.length; i++) {
//			arrayThree[i] = arrayOne[i];
//		} //Call by value
		
		
		for(int i = 0; i<arrayOne.length; i++) {
			System.out.print("First Array:" + arrayOne[i] + "\t");
			System.out.println("Third Array: " + arrayThree[i]);
		}
		
		arrayThree[0] = 100;
		arrayThree[1] = 200;
		arrayThree[2] = 300;
		arrayThree[3] = 400;
		arrayThree[4] = 500;
		
		for(int i = 0; i<arrayOne.length; i++) {
			System.out.print("First Array:" + arrayOne[i] + "/\t");
			System.out.println("Third Array: " + arrayThree[i]);
		}
		
	}

}
