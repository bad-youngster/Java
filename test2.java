package com.test.java;

import java.util.Scanner;

/** 
* @author wayne 
* @version Nov 29, 2017 5:16:39 PM 
* 
*/

public class test2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("please input a number:");
		long year = scanner.nextLong();
		if (year % 4 == 0&& year % 100!=0||year % 400 == 0) {
			System.out.println("leap year ");			
		}else {
			System.out.println("not leap year");
		}
	}

}
