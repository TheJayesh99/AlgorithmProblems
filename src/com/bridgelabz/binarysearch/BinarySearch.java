package com.bridgelabz.binarysearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the string");
		Scanner scanner = new Scanner(System.in);
		String string = scanner.nextLine();
		System.out.println("Enter the word to find");
		String value  = scanner.next().toLowerCase();
		scanner.close();
		
		//converting string to array
		String[] words = string.toLowerCase().split(" ");
		
		//sorting the elements in arrays
		Arrays.sort(words);
		
		//assigning minimum and maximum value
		int min = 0;
		int max = words.length;
	
		// computation for binary search
		while(min <= max  )
		{
			int mid = (min+max) / 2 ;
			//mid value equals to value
			if(value.compareTo(words[mid]) == 0)
			{
				System.out.println(value+" Found ");
				break;
			}
			//value is less than mid value 
			else if (value.compareTo(words[mid] )< 0)
				{
					max = mid-1;
				}
			//value is greater than mid value 
			else 
			{
				min = mid+1;
			}
			//if element not found
			if(min > max)
			{
				System.out.println(value+" not found");
			}
			
		}
	}
}
