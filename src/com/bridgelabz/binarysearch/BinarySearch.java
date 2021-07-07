package com.bridgelabz.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		System.out.println("Enter the word to find");
		String value  = scanner.next().toLowerCase();
		scanner.close();
		String[] words = str.toLowerCase().split(" ");
		Arrays.sort(words);
		int min = 0;
		int max = words.length;
		while(min <= max  )
		{
			int mid = (min+max) / 2 ;
			if(value.compareTo(words[mid]) == 0)
			{
				System.out.println(value+" Found ");
				break;
			}
			else if (value.compareTo(words[mid] )< 0)
				{
					max = mid-1;
				}
			else 
			{
				min = mid+1;
			}
			if(min > max)
			{
				System.out.println(value+" not found");
			}
			
		}
	}
}
