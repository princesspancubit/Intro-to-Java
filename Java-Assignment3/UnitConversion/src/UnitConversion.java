import java.util.Scanner;


/***
 * 
 * A program that converts the given input of meters into feet and inches
 */
public class UnitConversion 
{
		public static void main(String[] args)
		{
			Scanner in = new Scanner(System.in);
			System.out.print("Please enter a measurement in meters: ");
			double measurement = in.nextDouble();
			
			final double INCHES_IN_A_METER = 39.3700787;
			final int INCHES_IN_A_FOOT = 12; 
			
			//converts the given input to inches
			double meters_to_inches = (measurement * INCHES_IN_A_METER) + 0.5;
			//determines how many feet there are in the given input
			int feet = (int)(meters_to_inches/INCHES_IN_A_FOOT);
			//determines how many inches in the given input
			int inches = (int)(meters_to_inches % INCHES_IN_A_FOOT);
			
			System.out.printf("%d ft %d in", feet, inches);
			
		}
}
