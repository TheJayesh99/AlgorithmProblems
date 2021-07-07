package com.bridgelabz.bubblesort;

import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort 
{
	public static void main(String[] args) 
	{		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		scanner.close();
		
		//converting string to array
		String[] arrayToSort = string.toLowerCase().split(" ");
		
		//computation for bubble sort
		for (int i = 0; i < arrayToSort.length; i++) 
		{
			for (int j = i; j < arrayToSort.length; j++) 
			{
				//swap value if value > next value
				if(arrayToSort[i].compareTo(arrayToSort[j]) > 0 )
				{
					String temp = arrayToSort[i];
					arrayToSort[i] = arrayToSort[j];
					arrayToSort[j] = temp;
				}
			}
		}
		System.out.println("After sorting : "+Arrays.toString(arrayToSort));
	}
}
