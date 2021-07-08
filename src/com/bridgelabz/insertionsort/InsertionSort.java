package com.bridgelabz.insertionsort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort 
{

	public static void main(String[] args) 
	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		scanner.close();
		String[] words = string.toLowerCase().split(" ");
		//looping through each words 
		for (int i = 0; i < words.length; i++) 
		{
			//assigning key which we will compare 
			String key = words[i];
			int j = i-1;
			//we will shift all values which are greater than key to the right
			while (j >= 0 && words[j].compareTo(key) > 0)
			{
				words[j + 1] = words[j];
				j = j - 1;
			}
			//after making space we will assign key to that place
			words[j+1] = key;
		}
		System.out.println("Your required sorted string is "+Arrays.toString(words));
	}

}
