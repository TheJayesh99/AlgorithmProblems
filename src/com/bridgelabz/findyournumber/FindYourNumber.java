package com.bridgelabz.findyournumber;

import java.util.Scanner;

public class FindYourNumber
{
	public static void main(String[] args) 
	{

		Scanner scanner = new Scanner(System.in);
		System.out.println("welcome to number guessing");
		System.out.println("Enter the value upto which you will guess");
		int N = scanner.nextInt();

		System.out.println("Think of a number which we will guess");
		//assigning minimum and maximum value
		int min = 0;
		int max = N;
		
		// computation for binary search
		while(min != max-1  )
		{
			int mid = (min+max) / 2 ;
			System.out.println("Your number is less than "+ mid +" ? y/n :");
			char userDecision = scanner.next().charAt(0);

			//value is less than mid value 
			if (userDecision == 'y')
			{
				max = mid;
			}
			//value is greater than mid value 
			else if (userDecision == 'n')
			{
				min = mid;
			}
			else 
			{
				System.out.println("Enter a correct value");
			}

		}
		System.out.println(min +" is your number that you assumed ");
		scanner.close();
	}
}
