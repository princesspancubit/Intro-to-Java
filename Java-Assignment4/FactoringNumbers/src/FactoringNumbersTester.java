/**
 * This is a tester class that tests the methods in the FactoringNumber class
 *
 */

public class FactoringNumbersTester
{
	/**
	 * The main method calls the FactoringNumbers class to test it
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		FactoringNumbers fn1 = new FactoringNumbers(3);
		System.out.println("Testing a positive prime number");
		fn1.printPrimeFactors();
		System.out.println();
		
		System.out.println("Testing a negative prime number");
		FactoringNumbers fn2 = new FactoringNumbers(-5);
		fn2.printPrimeFactors();
		System.out.println();
		
		System.out.println("Testing a positive non-prime number");
		FactoringNumbers fn3 = new FactoringNumbers(68);
		fn3.printPrimeFactors();
		System.out.println();
		
		System.out.println("Testing a negative non-prime number");
		FactoringNumbers fn4 = new FactoringNumbers(-95);
		fn4.printPrimeFactors();
		System.out.println();
		
		System.out.println("Testing 0");
		FactoringNumbers fn5 = new FactoringNumbers(0);
		fn5.printPrimeFactors();
		System.out.println();
		
		System.out.println("Testing 1");
		FactoringNumbers fn6 = new FactoringNumbers(1);
		fn6.printPrimeFactors();
		System.out.println();
		
		System.out.println("Testing a positive number");
		FactoringNumbers fn7 = new FactoringNumbers(38);
		fn7.printPrimeFactors();
		System.out.println();
		
		System.out.println("Testing a negative number");
		FactoringNumbers fn8 = new FactoringNumbers(-7);
		fn8.printPrimeFactors();
		System.out.println();
		
	}
}