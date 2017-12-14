import java.util.Random;

/**
 * 
 * A class that generates 100 random colors in Hexadecimal format
 *
 */
public class RandomColors 
{
	final private char[] SYMBOLS = {'0', '1',  '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
	
	/**
	 * This function prints out 100 random Hexadecimal colors through
	 * randomly picking a char out of the SYMBOLS variable. 
	 */
	public void printRandomColors()
	{
		Random rand = new Random();
		int symbols_length = SYMBOLS.length;
		for(int i = 0; i < 100; i++)
		{
			for(int j = 0; j < 6; j++)
			{
				int rand_nextint = rand.nextInt(symbols_length);
				System.out.print(SYMBOLS[rand_nextint]);
			}
			System.out.println();
		}
	}
	
	/**
	 * This function tests the printRandomColors method. 
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		RandomColors rc = new RandomColors();
		rc.printRandomColors();
	}
}
