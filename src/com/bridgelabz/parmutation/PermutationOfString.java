package com.bridgelabz.parmutation;

import java.util.Arrays;
import java.util.LinkedList;

public class PermutationOfString 
{
	public static void main(String[] args) 
	{
		String str ="ab";

		int n = str.length();
		//permutation using recursion
		String[] permuteArrayRecursion = permutaionUsingRecursion(str, n);
		System.out.println("permutation using recursive");
		System.out.println(Arrays.toString(permuteArrayRecursion));

		//permutation using iterations
		String[] permuteArrayIteration = permutations(str, n);
		System.out.println("permutation using iterative");		
		System.out.println(Arrays.toString(permuteArrayIteration));

		//sorting both arrays
		Arrays.sort(permuteArrayRecursion);
		Arrays.sort(permuteArrayIteration);
		
		//comparing 2 arrays
		if(Arrays.toString(permuteArrayIteration).equals(Arrays.toString(permuteArrayRecursion)) )
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");	
		}
	}

	
	
 
 
   
    public static String[] permutations(String str, int n)
    {
    	//initializing a empty array
    	String[] permuteArrayIteration = new String[getfactorial(str)];
		int index = 0;
		// converting string to char array
        char[] string = str.toCharArray();
        Arrays.sort(string);
 
        while (true)
        {
        	//assigning value to array
            permuteArrayIteration[index++] = String.valueOf(string);
            //taking largest element in i
            int i = n - 1;
            //returning the array if element at i th position is > previous
            while (string[i-1] >= string[i])
            {
                if (--i == 0) 
                {
                    return permuteArrayIteration;
                }
            }
            //initialize j to traverse back to get the string
            int j = n - 1;
            while (j > i && string[j] <= string[i-1]) 
            {
                j--;
            }
            //swap the string at given index
            swap(string, i - 1, j);
            //reversing the string
            reverse (string, i, n - 1);
        }
    }
    //method  to swap 
    private static void swap(char[] arr, int i, int j)
    {
        char c = arr[i];
        arr[i] = arr[j];
        arr[j] = c;
    }
    
    //method to reverse
    private static void reverse(char[] arr, int i, int j)
    {
       
        while (i < j) {
            swap(arr, i++, j--);
        }
    }
	
	private static String[] permutaionUsingRecursion(String str, int n) 
	{	
		//permutation using recursive
		LinkedList<String> permuteLinkedList = new LinkedList<String>();
		permute(str, 0, n-1,permuteLinkedList);

		//converting linked list to array
		int count = 0;
		String[] permuteArrayRecursion = new String[getfactorial(str)];
		for (String string : permuteLinkedList) 
		{
			permuteArrayRecursion[count++] = string;
		}
		return permuteArrayRecursion;
	}


	//finding factorial
	private static int getfactorial(String str) 
	{
		int fact = 1;
		for (int i = 2; i <=str.length(); i++)
		{
			fact = fact*i;
		}
		return fact;
	}

	//function to calculate permutation
	private static void permute(String str, int l, int r, LinkedList<String> permuteLinkedList)
	{

		if (l == r)
		{
			permuteLinkedList.add(str);
		}
		else
		{
			for (int i = l; i <= r; i++)
			{
				str = swap(str,l,i);
				permute(str, l+1, r, permuteLinkedList);
				str = swap(str,l,i);
			}
		}

	}


	//swap function
	public static String swap(String a, int i, int j)
	{
		char temp;
		char[] charArray = a.toCharArray();
		temp = charArray[i] ;
		charArray[i] = charArray[j];
		charArray[j] = temp;
		return String.valueOf(charArray);
	}
}

