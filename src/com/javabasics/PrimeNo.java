package com.javabasics;

import java.util.Scanner;

public class PrimeNo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i,m=0,flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a num to check: ");
		int num= sc.nextInt();
		
		m=num/2;
		for(i=2;i<=m;i++)
		{
			if(num%i==0)
			{
				System.out.println(num+" is not prime");
				flag=1;
			    break;
		    }
		}
		if(flag==0)
		{
			System.out.println(num+" is prime");
		}

	}

}
