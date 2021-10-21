package com.standard.java.condition;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		
		// if문
		String a = "abc";
		String b = "";
		b = a; 
		
		if(a == b) {
			System.out.println(a);
			System.out.println(b);
		}
		
		// if-else문
		int num1 = 1;
		int num2 = 2;
		
		if(num1 == num2) {
			System.out.println("num1 = num2");
		}else {
			System.out.println("num1 =x num2");
		}
		
		// if-else if문
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("당신의 학점을 입력해주세요>");
		Scanner scan = new Scanner(System.in);
		score = scan.nextInt();
		
		
		// 단순 if-else if문
		
		/*
		if(score >= 90) {
			grade = 'A';
		}else if(score >=80) {
			grade = 'B';
		}else if(score >= 70) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		
		System.out.println("당신의 학점은 " + grade + "입니다.");
		*/
		
		// 중복 조건문
		System.out.printf("당신의 점수는 %d입니다.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			
			if(score >= 98) {
				opt = '+';
			}else if(score < 94){
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
			
			if(score >= 88) {
				opt = '+';
			}else if(score < 84) {
				opt = '-';
			}
		}else {
			grade = 'C';
		}
		
		System.out.printf("당신의 학점은 %c%c입니다.%n", grade, opt);
		
	}

}
