package com.calculator;

import java.util.Scanner;

public class Driver {
		
		public static void main(String[] args) {
			Implementation implementation = new Implementation();
			
			System.out.println("**************************WELCOME TO CALCULATOR**************************");
			
			System.out.println("1.Addition \n2.Subtraction \n3.Multiplication \n4.Division");
			
			System.out.println("Enter your Choice:");
			Scanner sc = new Scanner(System.in);
			int value = sc.nextInt();
			
			switch(value) {
				
			case 1:{
					
					System.out.println("You have choosen Addition operation.");
					System.out.println("Enter first value");
					int a = sc.nextInt();
					
					System.out.println("Enter second value");
					int b = sc.nextInt();
					
					int answer = implementation.add(a, b);
					
					System.out.println("Addition of "+a+" and "+b +" is :"+answer);
				}
				break;
			case 2:{
				
				}
				break;
			case 3:{
				
				}
				break;
			case 4:{
				
				}
				break;
			default: System.out.println("Enter valid option!!");
			
			
			}
		}
}
