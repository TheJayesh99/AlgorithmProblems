package com.bridgelabz.mergesort;

import java.util.Arrays;
import java.util.Scanner;

public class MyMergeSort {

	private static	void merge(String[] words, int low, int mid, int high)  
	{  

		int l = mid - low + 1;  
		int r = high - mid;  
		//creating 2 separate arrays
		String LeftArray[] = new String [l];  
		String RightArray[] = new String [r];  

		for (int i=0; i<l; ++i)  
		{
			LeftArray[i] = words[low + i];  
		}
		for (int j=0; j<r; ++j)
		{
			RightArray[j] = words[mid + 1+ j];  
		}
		//merge  2 arrays
		int i = 0, j = 0;  
		int k = low;  
		while ( i < l && j < r)  
		{  
			if (LeftArray[i].compareTo(RightArray[j]) < 0 )  
			{  
				words[k] = LeftArray[i];  
				i++;  
			}  
			else  
			{  
				words[k] = RightArray[j];  
				j++;  
			}  
			k++;  
		}  
		//merging remaining elements of left array
		while (i<l)  
		{  
			words[k] = LeftArray[i];  
			i++;  
			k++;  
		}  
		//merging remaining elements of right array
		while (j<r)  
		{  
			words[k] = RightArray[j];  
			j++;  
			k++;  
		}  
	}  
	//merge sort method to divide the array
	private static	void mergeSort(String[] words, int low, int high)  
	{  
		if ( low < high )  
		{  
			int mid = ( low + high ) / 2;  
			mergeSort(words, low, mid);  
			mergeSort(words , mid+1, high);  
			merge(words, low, mid, high);  
		}  
	}

	public static void main(String args[])  
	{  
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		scanner.close();
		String[] words = string.toLowerCase().split(" ");  
		mergeSort(words, 0, words.length-1);  
		System.out.println("Sorted array");  
		System.out.println(Arrays.toString(words));
	}  
}
