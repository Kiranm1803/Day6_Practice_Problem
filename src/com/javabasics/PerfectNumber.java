package com.javabasics;

import java.util.Scanner;

public class PerfectNumber{
	
public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number : ");
		int num = sc.nextInt();
		
		int sum=0;
		
		for(int i=1;i<=num/2;i++)
		{
			if(num%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(sum==num)
		{
			System.out.println(num+" is perfect number");
		}
		else
		{
			System.out.println(num+" is not perfect number");
		}
 }
}
