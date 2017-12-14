import java.util.Arrays;

/**
 * Generates a random number (int/double) from a set range or a given range.
 *
 */

class RandomNumberGenerator 
{
	private double[] rangeGen;
	
	RandomNumberGenerator()
	{
		rangeGen = new double[] {0.0, 100.0};
	}
	
	RandomNumberGenerator(double lowerBound, double upperBound)
	{
		if(lowerBound < upperBound && lowerBound > 0 && upperBound > 0)
		{
			rangeGen = new double[] {lowerBound, upperBound};
		}
		
	}
	
	/**
	 * Gets the current range that was initialized
	 * @return current range
	 */
	public String getRange()
	{
		return Arrays.toString(rangeGen);
		
	}
	
	/**
	 * Sets the current range to the range given from the input
	 * @param lowerBound is the lower bound for the range
	 * @param upperBound is the upper bound for the range
	 */
	public void setRange(double lowerBound, double upperBound)
	{
		if(lowerBound < upperBound && lowerBound > 0 && upperBound > 0)
		{
			rangeGen[0] = lowerBound;
			rangeGen[1] = upperBound;
		}
		
	}
	
	/**
	 * Gets a random value that is a double within the specified range
	 * @return random double value within range
	 */
	public double nextValue()
	{
		return Math.random() * ((rangeGen[1] - rangeGen[0]) + rangeGen[0]);
	}
	
	/**
	 * Gets a random int value that is within the specified range
	 * @return random int value within the range
	 */
	public int nextValueInt()
	{
		//returns an int random number in the specified range
		return (int) (Math.random() * ((rangeGen[1] - rangeGen[0]) + rangeGen[0]));

	}

	
}

/**
 * A class to test the RandomNumberGenerator class
 *
 */
public class RandomNumberGeneratorTester
{
	/**
	 * Tests the methods of the RandomNumberGenerator class
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		RandomNumberGenerator randGen = new RandomNumberGenerator();
		System.out.println(randGen.getRange());
		System.out.println("Expected: [0.0, 100.0]");
		System.out.println(randGen.nextValue());
		System.out.println(randGen.nextValueInt());
		randGen.setRange(50.0, 200.0);
		System.out.println(randGen.getRange());
		System.out.println("Expected: [50.0, 200.0]");
		System.out.println(randGen.nextValue());
		System.out.println(randGen.nextValueInt());
		
		System.out.println(" ");
		
		RandomNumberGenerator randInp = new RandomNumberGenerator(2.0, 1000.0);
		System.out.println(randInp.getRange());
		System.out.println("Expected: [2.0, 1000.0]");
		System.out.println(randInp.nextValue());
		System.out.println(randInp.nextValueInt());
		randInp.setRange(50000.0, 1000000.0);
		System.out.println(randInp.getRange());
		System.out.println("Expected: [50000.0, 1000000.0]");
		System.out.println(randInp.nextValue());
		System.out.println(randInp.nextValueInt());
		
	}
	
	
}
