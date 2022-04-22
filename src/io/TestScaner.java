package io;

import java.util.Scanner;

public class TestScaner {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("請輸入選項:1. AAA 2. BBB");
		
		String answer = scanner.nextLine();
		System.out.println("你輸入的是:"+answer);
		
		
	}

}
