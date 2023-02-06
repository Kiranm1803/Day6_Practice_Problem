package com.javabasics;

import java.util.Scanner;

public class StopWatch {

	public static void main(String[] args) {
		
		long start,end;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter any no to start the stopwatch: ");
		start=input.nextInt();
		
		start=System.currentTimeMillis();
		
		System.out.println("Enter any no to stop the stopwatch: ");
		end=input.nextInt();
		
		end=System.currentTimeMillis();
		
		double elapsed_time=(end-start)/1000.0;
		
		System.out.println("elapsed time is: "+elapsed_time);
	}
	
}
