package com.bridgelabz.primenumber;

import java.util.Arrays;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("The prime number between 0 to 1000 which are Anagram and Palindrome are : ");
		int[] primeNumberArray = new int[168];
		int count = 0;
		
		//checking number is prime and adding it to prime array
		for (int i = 2; i <= 1000; i++) 
		{	
			if(checkPrime(i))
			{
				primeNumberArray[count++] = i;
			}
		}
		checkAnagram(primeNumberArray);
	}
	//method to check numbers are anagram
	private static void checkAnagram(int[] primeNumberArray) 
	{
		for (int i = 0; i < primeNumberArray.length; i++)
		{
			int number1 = primeNumberArray[i];
			for (int j = i+1; j < primeNumberArray.length; j++)
			{
				int number2 = primeNumberArray[j];
				char[] characterArrayNumber1 = String.valueOf(number1).toCharArray();
				char[] characterArrayNumber2 = String.valueOf(number2).toCharArray();
				
				//sorting the character present in arrays
				Arrays.sort(characterArrayNumber1);
				Arrays.sort(characterArrayNumber2);
				
				//comparing if two sorted arrays are equal
				if (Arrays.toString(characterArrayNumber1).equals(Arrays.toString(characterArrayNumber2)))
				{
					checkpalindrome(primeNumberArray, i);
					break;
				}
			}
		}
	}

	//method to check number is Palindrome or not
	private static void checkpalindrome(int[] primeNumberArray, int i) 
	{
		int number = primeNumberArray[i];
		int reverse = 0;
		while (number != 0)
		{
			reverse = reverse*10 + number%10;
			number = number/10;
		}
		if (reverse == primeNumberArray[i])
		{
			System.out.println(primeNumberArray[i]);
		}
	}

	//method to find prime numbers
	private static boolean checkPrime(int i) 
	{
		//checking taken number is prime 
		for (int number = 2 ; number<i ;number++ )
		{
			int remainder = i % number ;
			//if number is completely get divisible by any number then
			if (remainder == 0)
			{
				return false;
			}
		}
		return true;
	}
}
