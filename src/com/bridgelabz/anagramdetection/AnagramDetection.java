package com.bridgelabz.anagramdetection;

import java.util.Arrays;
import java.util.Scanner;

public class AnagramDetection
{
	public static void main(String[] args) 
	{		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the 1st string");
		String string1 = scanner.nextLine();
		System.out.println("Enter the 2nd string");
		String string2 = scanner.nextLine();
		scanner.close();
		
		//converting user inputs to character arrays
		char[] characterOfWord1 = string1.toCharArray();
		char[] characterOfWord2 = string2.toCharArray();
		
		//sorting the character present in arrays
		Arrays.sort(characterOfWord1);
		Arrays.sort(characterOfWord2);
		
		//comparing if two sorted arrays are equal
		if (Arrays.toString(characterOfWord1).equals(Arrays.toString(characterOfWord2)))
		{
			System.out.println("Two Strings are Anagram ");
		}
		else
		{			
			System.out.println("Two Strings are not Anagram ");
		}
	}
}
