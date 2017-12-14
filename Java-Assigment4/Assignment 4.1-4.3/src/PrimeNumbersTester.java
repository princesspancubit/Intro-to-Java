/**
 * 
 * A class that tests whether the instance variable is prime
 *
 */
public class PrimeNumbersTester 
{
	
	/**
	 * Tests the methods of the PrimeNumbers class
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		//checks 0
		PrimeNumbers p1 = new PrimeNumbers(0);
		p1.primePrinter();
		
		//checks 1
		PrimeNumbers p2 = new PrimeNumbers(1);
		p2.primePrinter();
		
		//checks negative number
		PrimeNumbers p3 = new PrimeNumbers(-5);
		p3.primePrinter();
		
		//checks 2
		PrimeNumbers p4 = new PrimeNumbers(2);
		p4.primePrinter();
		
		//checks a positive number
		PrimeNumbers p5 = new PrimeNumbers(44);
		p5.primePrinter();
		
		//checks a positive number
		PrimeNumbers p6 = new PrimeNumbers(3);
		p6.primePrinter();
		
		//checks a large positive number
		PrimeNumbers p7 = new PrimeNumbers(925);
		p7.primePrinter();
		
		//checks a large positive number
		PrimeNumbers p8 = new PrimeNumbers(449);
		p8.primePrinter();
	
	
	}
	
	
}
