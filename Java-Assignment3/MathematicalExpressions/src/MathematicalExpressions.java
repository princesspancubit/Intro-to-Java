
import java.lang.Math;
import java.util.Scanner;


/***
 * A program that receives 3 inputs as a double and computes 
 * different mathematical expressions with the given input.
 */
public class MathematicalExpressions 
{
	
	public static void main(String[] args)
	{
		//requests for 3 inputs
		Scanner in = new Scanner(System.in);
		System.out.print("Please enter the first double precision point number: ");
		double x = in.nextDouble();
		System.out.print("Please enter the second double precision point number: ");
		double y = in.nextDouble();
		System.out.print("Please enter the third double precision point number: ");
		double z = in.nextDouble();
		
		//tests the average
		System.out.println((x+y+z)/3);
		//tests the cosine
		System.out.println(Math.cos((x+y)/z));
		//tests the cube root
		System.out.println(Math.cbrt(x));
		//tests the power
		System.out.println(Math.pow(x, y));
		//tests log base 10
		System.out.println(Math.log10(x));
	}
	
}


