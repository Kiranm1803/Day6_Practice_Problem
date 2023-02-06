package com.javabasics;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to reverse: ");
		int num = sc.nextInt();
		
		int temp,reverse=0,remainder;
		
		temp= num;
		while(num!=0)
		{
			remainder=num%10;
			reverse=(reverse*10)+remainder;
			num=num/10;
		}
		System.out.println("Reversed number: "+reverse);
		
		
	}

}