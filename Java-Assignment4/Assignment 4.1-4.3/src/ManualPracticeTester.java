/**
 * 
 * This class provides tests for the the different figures in the assignment4.pdf file
 *
 */
public class ManualPracticeTester {
	/**
	 * Prints out the answers in figure1
	 */
	public static void figure1()
	{
		int i = 0;
		while (i < 21)
		{
			System.out.println( ++i );
			i+=2;
		}
	}
	/**
	 * Prints out the answers in figure2
	 */
	public static void figure2()
	{
		for(int i = 0; i < 21; i += 2)
		{
			System.out.println( i++ );
		}
	}
	/**
	 * Prints out the answers in figure3
	 */
	public static void figure3()
	{
		int k = 30;
		for(int i = 0; i < k; i += 2)
		{
			k++;
			System.out.println( i );
			System.out.println( ++i > k );
		}
	}
	/**
	 * Prints out the answers in figure4
	 */
	public static void figure4()
	{
		int i = 1;
		while (i <= 101)
		{
			int k = i+++2;
			System.out.println(i+=++i*2+k);
		}
	}
	/**
	 * Tests the figure 1-4 methods 
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		System.out.println("Testing Figure 1");
		figure1();
		System.out.println();
		
		System.out.println("Testing Figure 2");
		figure2();
		System.out.println();
		
		System.out.println("Testing Figure 3");
		figure3();
		System.out.println();
		
		System.out.println("Testing Figure 4");
		figure4();
		
	}

}
