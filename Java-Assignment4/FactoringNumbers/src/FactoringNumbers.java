import java.util.Scanner;

/**
 *A class that generates the prime factorization of the specified input
 *
 */
public class FactoringNumbers 
{	
	/**
	 * Asks the user for input and checks if the given input meets the requirements and if not, asks again.
	 */
	public int input_number;
	
	/**
	 *  Checks whether the input is a valid int and then updates the instance variable
	 *  If it is not valid then it continues to ask for an input
	 */
	FactoringNumbers()
	{
		int input_number;
		Scanner in = new Scanner(System.in);
		do 
		{
			System.out.print("Please enter a positive integer greater than 1: ");
			input_number = in.nextInt();
		}
		while(input_number < 2);
		in.close();
		this.input_number = input_number;
	}
	
	/**
	 *Checks if the given num is valid and if it is then it initializes the instance variable
	 *and if it is not then it prints a message.
	 * @param input_num
	 */
	FactoringNumbers(int input_num)
	{
		if(input_num < 2)
		{
			System.out.printf("Sorry, %d was not a valid input. Please provide a positive integer greater than 1.", input_num);
			System.out.println();
		}
		else
		{
			this.input_number = input_num;
		}
	}
	
	/**
	 * Prints the prime factors of the given input
	 */
	public void printPrimeFactors()
	{
		if(input_number < 2) 
		{
			return;
		}
		while(input_number % 2 == 0)
		{
			System.out.print("2" + " ");
			input_number /= 2;
		}
		for(int i = 3; i < Math.sqrt(input_number); i+=2)
		{
			while(input_number % i == 0)
			{
				System.out.print(i + " ");
				input_number /= i;
			}
		}
		if(input_number > 2)
		{
			System.out.print(input_number);
		}
		System.out.println();
	}
	
	/**
	 * Tests the constructor of the FactoringNumbers class that asks for input and the printPrimeFactors function
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		FactoringNumbers fn = new FactoringNumbers();
		fn.printPrimeFactors();
	}

}
