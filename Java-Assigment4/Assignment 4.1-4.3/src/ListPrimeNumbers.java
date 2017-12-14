import java.util.Scanner;

/**
 * 
 * A class that generates a list of Prime Numbers from a specified integer
 *
 */
public class ListPrimeNumbers 
{
	private int input_num;
	
	/**
	 * This constructor continuously asks the user for input until it is a positive integer.
	 */
	ListPrimeNumbers()
	{	
		int input_num;
		Scanner in = new Scanner(System.in);
		do 
		{
			System.out.print("Please enter a positive integer: ");
			input_num = in.nextInt();
		}
		while(input_num < 0);
		this.input_num = input_num;
		in.close();
	}
	
	/**
	 * This constructor takes in the parameter and initializes it to the instance variable
	 * @param inp is an integer 
	 */
	ListPrimeNumbers(int inp)
	{
		this.input_num = inp;
	}

	
	/**
	 * Prints all the prime numbers from 2 to their input
	 */
	public void printPrimeNumbers()
	{
		if(input_num > 2) 
		{
			for(int i = 0; i < input_num; i++) 
			{
				if(PrimeNumbers.isPrime(i))
				{
					System.out.print(i + " ");
				}
			}
		}
		else
		{
			System.out.printf("There are no prime numbers between %d and 2", input_num);
		}
		System.out.println();
	}
	
	/**
	 * This main method tests the ListPrimeNumbers class when asking for an input
	 * @param args
	 */
	public static void main(String[] args)
	{
		ListPrimeNumbers lpm = new ListPrimeNumbers();
		lpm.printPrimeNumbers();
	}


}
