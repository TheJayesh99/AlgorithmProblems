package com.bridgelabz.primenumber;

public class PrimeNumber 
{
	public static void main(String[] args) 
	{
		System.out.println("The prime number between 0 to 1000 are : ");
		for (int i = 0; i <= 1000; i++) 
		{
			if(i >= 2)
			{				
				checkPrime(i);
			}
		}
	}

	//method to find prime numbers
	private static void checkPrime(int i) 
	{
		boolean is_prime = true;
		//checking taken number is prime 
		for (int j = 2 ; j<i ;j++ )
		{
			int remainder = i % j ;
			//if number is completely get divisible by any number then
			if (remainder == 0)
			{
				is_prime = false ;
				break;
			}
		}
		if (is_prime)
		{
		System.out.println(i);	
		}
	}
}
