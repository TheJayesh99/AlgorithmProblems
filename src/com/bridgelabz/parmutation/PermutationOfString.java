package com.bridgelabz.parmutation;

import java.util.LinkedList;

public class PermutationOfString 
{
	public static void main(String[] args) 
	{
		String str = "abc";

		int n = str.length();
		System.out.println("permutation using recursive");
		//permutation using recursive
		PermutationOfString permutation = new PermutationOfString();
		permutation.permute(str, 0, n-1);
		System.out.println("permutation using iterative");
		//permutation using iterative
		for (int i=0;i<getfactorial(str);i++)
		{
			LinkedList<String> charlist = stringbuilder(str);

			for (int j = str.length(); j >0 ; j--) 
			{
				int temp = i;
				int q = temp/j;
				int r = temp%j;
				int counter = 0;
				for (String c : charlist) {
					if(counter == r) 
					{
						System.out.print(c);
						charlist.remove(c);
						break;
					}
					counter++;
				}
				temp = q;
			}
			System.out.println();
		}
	}

	//linked list to act as string builder
	private static LinkedList<String> stringbuilder(String str) {
		LinkedList<String> charlist = new LinkedList<>();
		char[] character = str.toCharArray();
		for (char c : character) {
			charlist.add(String.valueOf(c));
		}
		return charlist;
	}

	//finding factorial
	private static int getfactorial(String str) {
		int fact = 1;
		for (int i = 2; i <=str.length(); i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	
		//function to calculate permutation
		private void permute(String str, int l, int r)
	    {
			
	        
			if (l == r)
			{
				System.out.println(str);
				
			}
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swap(str,l,i);
	                permute(str, l+1, r);
	                str = swap(str,l,i);
	            }
	        }
			
	    }
		
		
		//swap function
		public String swap(String a, int i, int j)
	    {
	        char temp;
	        char[] charArray = a.toCharArray();
	        temp = charArray[i] ;
	        charArray[i] = charArray[j];
	        charArray[j] = temp;
	        return String.valueOf(charArray);
	    }
}

