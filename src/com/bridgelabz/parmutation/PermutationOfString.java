package com.bridgelabz.parmutation;

import java.util.Arrays;
import java.util.LinkedList;

public class PermutationOfString 
{
	public static void main(String[] args) 
	{
		String str = "abc";

		int n = str.length();
		int count = 0;
		PermutationOfString permutation = new PermutationOfString();
		String[] permutationUsingArray = new String[getfactorial(str)];
		permutation.permute(str, 0, n-1,permutationUsingArray,count);

		System.out.println(Arrays.toString(permutationUsingArray));
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

	private static LinkedList<String> stringbuilder(String str) {
		LinkedList<String> charlist = new LinkedList<>();
		char[] character = str.toCharArray();
		for (char c : character) {
			charlist.add(String.valueOf(c));
		}
		return charlist;
	}

	private static int getfactorial(String str) {
		int fact = 1;
		for (int i = 2; i <=str.length(); i++)
		{
			fact = fact*i;
		}
		return fact;
	}

		private void permute(String str, int l, int r,String[]  permutationUsingArray,int count)
	    {
			
	        
			if (l == r)
			{
				System.out.println(str);
				permutationUsingArray[count++]= str;
			}
	        else
	        {
	            for (int i = l; i <= r; i++)
	            {
	                str = swap(str,l,i);
	                permute(str, l+1, r,permutationUsingArray,count);
	                str = swap(str,l,i);
	            }
	        }
			
	    }
		
		
		
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

