
/**
 * An egg carton that begins empty and can have up to 12 eggs in its carton.
 *
 */
class EggCarton
{
	private int brownEggs;
	private int whiteEggs;
	
	EggCarton()
	{
		brownEggs = 0;
		whiteEggs = 0;
	}
	
	EggCarton(int brownEggs, int whiteEggs)
	{
		this.brownEggs = brownEggs;
		this.whiteEggs = whiteEggs;
	}
	
	/**
	 Adds brown eggs to the carton
	 @param amount of brown eggs to add
	 @return True if eggs have been added
	 */
	public boolean addBrownEggs(int n)
	{
		if((n <= 12) && ((brownEggs + whiteEggs + n) <= 12))
		{
			brownEggs = brownEggs + n;
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * Adds white eggs to the carton
	 * @param amount of white eggs to add
	 * @return True if eggs have been added
	 */
	public boolean addWhiteEggs(int n)
	{
		if((n <= 12) && ((brownEggs + whiteEggs + n) <= 12))
		{
			whiteEggs = whiteEggs + n;
			return true;
		}
		else
		{
			return false;
		}	
	}
	
	/**
	 * Gets the current amount of eggs in the carton
	 * @return the amount of eggs
	 */
	public int getTotalEggs()
	{
		return brownEggs + whiteEggs;
	}
}

/**
 * A class to test the EggCarton class
 *
 */

public class EggCartonTester 
{
	/**
	 * Tests the methods of the EggCarton class
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		EggCarton carton = new EggCarton(); //new carton w/ 0 eggs
		EggCarton second_carton = new EggCarton(1, 2); //1 brown, 2 white
		
		//tests the first carton with init 0 eggs
		System.out.println(carton.getTotalEggs());
		System.out.println("Expected: 0");
		System.out.println(carton.addBrownEggs(2));
		System.out.println("Expected: true");
		System.out.println(carton.addWhiteEggs(10));
		System.out.println("Expected: true");
		System.out.println(carton.addBrownEggs(1));
		System.out.println("Expected: true");
		System.out.println(carton.getTotalEggs());
		System.out.println("Expected: 12");
		
		System.out.println(" ");
		
		//tests the second carton with 3 eggs
		System.out.println(second_carton.getTotalEggs());
		System.out.println("Expected: 3");
		System.out.println(second_carton.addBrownEggs(10));
		System.out.println("Expected: false");
		System.out.println(second_carton.addWhiteEggs(7));
		System.out.println("Expected: true");
		System.out.println(second_carton.addBrownEggs(12));
		System.out.println("Expected: false");
		System.out.println(second_carton.getTotalEggs());
		System.out.println("Expected: 10");
		
	}
}
