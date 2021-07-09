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
		String[] wordsToSort = string.toLowerCase().split(" ");
		
		//computation for bubble sort
		bubbleSort(wordsToSort);
	}

	private static <T extends Comparable<T>> void bubbleSort(T[] wordsToSort) {
		for (int i = 0; i < wordsToSort.length; i++) 
		{
			for (int j = i; j < wordsToSort.length; j++) 
			{
				//swap value if value > next value
				if(wordsToSort[i].compareTo(wordsToSort[j]) > 0 )
				{
					T temp = wordsToSort[i];
					wordsToSort[i] = wordsToSort[j];
					wordsToSort[j] = temp;
				}
			}
		}
		System.out.println("After sorting : "+Arrays.toString(wordsToSort));
	}
}
