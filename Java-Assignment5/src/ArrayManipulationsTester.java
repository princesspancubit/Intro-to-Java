import java.util.ArrayList;
import java.util.Arrays;

/**
 * A class that manipulates arrays and arrayLists
 *
 */
public class ArrayManipulationsTester 
{

	/**
	 * This method traverses through an array and determines the largest value.
	 * If the array is empty then it returns integer.min_value
	 * @param a is an array of int
	 * @param curUsage is the amount of slots that are actually used in the array
	 * @return the largest int in the given array, if empty then integer.min_value
	 */
	public static int myMaximum(final int[] a, int curUsage)
	{
		int max_val = 0;
		if(curUsage == 0)
		{
			return Integer.MIN_VALUE;
		}
		else
		{
			for(int i = 0; i < curUsage; i++)
			{
				if(max_val < a[i])
				{
					max_val = a[i];
				}
			}
		}
		return max_val;
	}
	
	/**
	 * This method will modify v by appending to it all elements from w
	 * @param v is an ArrayList of integers
	 * @param w is an ArrayList of integers
	 */
	public static void appendArrayList(ArrayList<Integer> v, final ArrayList<Integer> w)
	{
		for(int i = 0; i < w.size(); i++)
		{
			v.add(w.get(i));
		}
		System.out.println(v);
	}
	
	/**
	 * This method goes through the array of integers and checks how many times k appears.
	 * @param v is an array of integers
	 * @param k is an integer
	 * @return the number of times k appears in v
	 */
	public static int countOccurrences(final int[] v, int k)
	{
		int counter = 0;
		for(int i = 0; i < v.length; i++)
		{
			if(v[i] == k)
			{
				counter++;
			}
		}
		return counter;
	}
	
	/**
	 * This method checks if the 2 dimensional array contains only 0's
	 * @param a is a two dimensional array
	 * @return a boolean of whether or not a has all zeros
	 */
	public static boolean isAllZeros(final int[][] a)
	{
		if(a.length == 0)
		{
			return false;
		}
		else 
		{
			for(int i = 0; i < a.length; i++)
			{
				if(a[i].length == 0)
			{
				return false;
			}
			else {
				for(int j = 0; j < a[i].length; j++)
				{
					if(a[i][j] != 0)
					{
						return false;
					}
				}
				}
			}
		}		
		return true;
	}
	
	/** 
	 * This method checks whether a and b contain the exact same elements in the same order
	 * @param a is an array
	 * @param b is an array
	 * @return a boolean based on whether or not a and b are identical
	 */
	public static boolean areIdentical(final int[] a, final int[] b)
	{
		if(a.length != b.length) 
		{
			return false;
		}
		else
		{
			for(int i = 0; i < a.length; i++)
			{
				if(a[i] != b[i])
				{
					return false;
				}
			}
		}
		return true;
	}
	
	
	/**
	 * This method calculates the average value for all numbers in v
	 * @param v an array of integers
	 * @return the average of all numbers in v
	 */
	public static double myAverage(final int[] v)
	{
		final int LENGTH_OF_V = v.length;
		double sum = 0.0;
		if(LENGTH_OF_V == 0)
		{
			return 0.0;
		}
		else
		{
			for(int element : v)
			{
				sum += element;
			}
		}
		return sum/LENGTH_OF_V;
	}
	
	/** 
	 * This method checks whether v contains values that are in strictly increasing order
	 * @param v is an array of integers
	 * @return a boolean on whether or not v has values that are in strictly increasing order
	 */
	public static boolean isStrictlyIncreasing(final int[] v)
	{
		if(v.length == 0 || v.length == 1)
		{
			return true;
		}
		else 
		{
			int prev = v[0];
			for(int i = 1; i < v.length; i++)
			{
				if(prev >= v[i])
				{
					return false;
				}
				else 
				{
					prev = v[i];
				}
			}
			return true;
		}
	}
	
	/**
	 * This method reverses the given array without creating a second array
	 * @param v is an array of integers
	 */
	public static void reverseArray(int[] v)
	{
		int i = 0, j = v.length - 1;
		for(i = 0; i < v.length / 2; i++, j--)
		{
			int temp = v[i];
			v[i] = v[j];
			v[j] = temp;
		}
		
		//prints elements out
		for(int k = 0; k < v.length; k++)
		{
			System.out.print(v[k] + " ");
		}
		System.out.println();
		
	}
	
	/**
	 * Tests all the methods that were defined above
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		System.out.println("TESTS EX. 1: Find the Max num");
		int[] a = {11, 12, 3, 0, 23, 4, 1, 100, 30, 2, 1};
		int[] b = {};
		int[] p = {1};
		int[] q = {-90, -22, -8, -9, -102};
		int[] w = new int[10];
		w[0] = 2; w[1] = 3; w[2] = 10;
		System.out.println(ArrayManipulationsTester.myMaximum(a, a.length));
		System.out.println(ArrayManipulationsTester.myMaximum(b, b.length));
		System.out.println(ArrayManipulationsTester.myMaximum(p, p.length));
		System.out.println(ArrayManipulationsTester.myMaximum(q, q.length));
		System.out.println(ArrayManipulationsTester.myMaximum(w, 3));
		System.out.println(ArrayManipulationsTester.myMaximum(w, w.length));
		
		System.out.println();
		System.out.println("TESTS EX. 2: Append ArrayLists");
		ArrayList<Integer> c = new ArrayList<Integer>(Arrays.asList(1, 2, 3));
		ArrayList<Integer> d = new ArrayList<Integer>(Arrays.asList(4, 5, 6));
		ArrayList<Integer> r = new ArrayList<Integer>(Arrays.asList(-3, -10, 9, 100));
		ArrayList<Integer> s = new ArrayList<Integer>(Arrays.asList(0, 2, -1000));
		ArrayManipulationsTester.appendArrayList(c, d);
		ArrayManipulationsTester.appendArrayList(r, s);
		
		System.out.println();
		System.out.println("TESTS EX. 3: Count Occurrences");
		int[] e = {2, 3, 2, 2, 25, 1, 23, 15, 15, 25, 25, 25, 6, 9};
		int[] t = {0, 3, 2, 0, -25, 0, -23, 15, -15, 0, 0, 25, 0, 9};
		System.out.println(ArrayManipulationsTester.countOccurrences(e, 25));
		System.out.println(ArrayManipulationsTester.countOccurrences(t, 0));
		System.out.println(ArrayManipulationsTester.countOccurrences(b, 9));
		
		System.out.println();
		System.out.println("TESTS EX. 4: Two-Dimensional Arrays");
		int[][] f = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
				     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
				     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
				     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int[][] g = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		  	     {0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
		 	     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
		 	     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			     {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int[][] m = {{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			    {},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			    {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int[][] n = {{}, {}, {}, {}, {}, {}, {}, {}, {}, {}};
		System.out.println(ArrayManipulationsTester.isAllZeros(f));
		System.out.println(ArrayManipulationsTester.isAllZeros(g));
		System.out.println(ArrayManipulationsTester.isAllZeros(m));
		System.out.println(ArrayManipulationsTester.isAllZeros(n));
		
		System.out.println();
		System.out.println("TESTS EX. 5: Identical Arrays");
		int[] h = {2, 3, 2, 2, 25, 1, 23, 15, 15, 25, 25, 25, 6, 9};
		int[] u = {};
		System.out.println(ArrayManipulationsTester.areIdentical(a, e));
		System.out.println(ArrayManipulationsTester.areIdentical(e, h));
		System.out.println(ArrayManipulationsTester.areIdentical(b, u));
		
		System.out.println();
		System.out.println("TESTS EX. 6: Calculate the Average");
		System.out.println(ArrayManipulationsTester.myAverage(h));
		System.out.println(ArrayManipulationsTester.myAverage(b));
		System.out.println(ArrayManipulationsTester.myAverage(t));
		
		System.out.println();
		System.out.println("TESTS EX. 7: Ordered Arrays");
		int[] j = {9, 25, 12};
		int[] k = {-2, 4, 5, 6, 8};
		int[] l = {3, 4, 6, 6, 9};
		int[] o = {0, 0, 0, 0};
		int[] v = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println(ArrayManipulationsTester.isStrictlyIncreasing(j));
		System.out.println(ArrayManipulationsTester.isStrictlyIncreasing(k));
		System.out.println(ArrayManipulationsTester.isStrictlyIncreasing(l));
		System.out.println(ArrayManipulationsTester.isStrictlyIncreasing(b));
		System.out.println(ArrayManipulationsTester.isStrictlyIncreasing(o));
		System.out.println(ArrayManipulationsTester.isStrictlyIncreasing(v));
		
		
		System.out.println();
		System.out.println("TESTS EX. 8: Reverse an Array");
		ArrayManipulationsTester.reverseArray(j);
		ArrayManipulationsTester.reverseArray(k);
		ArrayManipulationsTester.reverseArray(h);
		ArrayManipulationsTester.reverseArray(b);
		ArrayManipulationsTester.reverseArray(v);
		
	}
}
