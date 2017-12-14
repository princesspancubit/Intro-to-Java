/***
 * 
 * A class that determines whether the instance variable is prime
 *
 */

class PrimeNumbers
{
	private int num;
	
	/**
	 * This constructor takes the parameter and initializes it to the instance variable.
	 * @param num
	 */
	PrimeNumbers(int num)
	{
		this.num = num;
	}
	
	/**
	 * Determines whether the instance variable is a prime number
	 * @return boolean 
	 */
	public static boolean isPrime(int num)
	{
		if(num <= 1)
			return false;
		for(int i = 2; i < num; i++)
		{
			if(num % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	
	/**
	 * Prints out whether the instance variable is prime
	 */
	public void primePrinter()
	{
		if(isPrime(num))
		{
			System.out.println(num + " is prime.");
		}
		else
		{
			System.out.println(num + " is not prime.");
		}
	}
}
