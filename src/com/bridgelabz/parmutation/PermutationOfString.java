package com.bridgelabz.parmutation;


public class PermutationOfString 
{
	public static void main(String[] args) 
	{
		String str = "abc";
		String[] paramArray = new String[20];
		int count = 1;
		char[] character = str.toCharArray();
		for (int i = 0; i < str.length()  ; i++) 
		{
			for (int j = 0; j < str.length(); j++) 
			{				
				if(character[j] != character[i] )
				{
					char temp = character[i];
					character[i] = character[j];
					character[j] =temp;
					System.out.println(String.valueOf(character));
				}
			}
		}
	}
}

