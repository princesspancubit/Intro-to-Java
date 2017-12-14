/**
 * 
 * This is a class that tests the ListPrimeNumbers class
 *
 */
public class ListPrimeNumbersTester {
	
	
	/**
	 * Tests the ListPrimeNumbers class
	 * @param args not used
	 */
	public static void main(String[] args)
	{	
		System.out.println("Testing 1");
		ListPrimeNumbers lpm2 = new ListPrimeNumbers(1);
		lpm2.printPrimeNumbers();
		System.out.println();
		
		System.out.println("Testing 90");
		ListPrimeNumbers lpm3 = new ListPrimeNumbers(90);
		lpm3.printPrimeNumbers();
		System.out.println();
		
		System.out.println("Testing -78");
		ListPrimeNumbers lpm4 = new ListPrimeNumbers(-78);
		lpm4.printPrimeNumbers();
		System.out.println();
		
		System.out.println("Testing 0");
		ListPrimeNumbers lpm5 = new ListPrimeNumbers(0);
		lpm5.printPrimeNumbers();
		System.out.println();
		
		ListPrimeNumbers lpm = new ListPrimeNumbers();
		lpm.printPrimeNumbers();
		
	}

}
