
public class ManualPracticeProblemsTester 
{

	public static void main(String[] args)
	{
		System.out.println("Figure 1");
		double d1 = 3 / 2 * 3.0 + 8 / 3;
		double d2 = 2.0 * 4 / 5 + 6 / 4.0;
		//answer = 5.0
		System.out.println(d1);
		//answer = 3.1
		System.out.println(d2);
		
		System.out.println("Figure 2");
		//answer = 2+3=23
		System.out.println("2+3=" + 2 + 3);
		//answer = 33
		System.out.println(1 + 2 + "3");
		//answer = 2*3=6
		System.out.println("2*3=" + 2 * 3);
		//answer = 3x
		System.out.println(4 - 1 + "x");
		//answer = error
		System.out.println("\"x\" + 4 - 1 prints out error");
		
		System.out.println("Figure 3");
		//answer = 3.0
		System.out.println((double) 2 + 3 / 2);
		//answer = 2.5
		System.out.println((double) (2 + 3) / 2);
		//answer = 5.5
		System.out.println((double) 22 / 4);
		//answer = 5.5
		System.out.println(22 / (double) 4);
		//answer = 5.0
		System.out.println((double) (22 / 4));
		
		System.out.println("Figure 4");
		int i = 5;
		double d = 0.5;
		char c = 'a';
		boolean b1 = true, b2 = true;
		//answer = 10.479425538604204
		System.out.println(i/d + Math.sin(d));
		//answer = false
		System.out.println(c == 'b');
		//answer = true
		System.out.println(i < 10);
		//answer = false
		System.out.println(b1 == (d >= 5.0));
		//answer = false
		System.out.println(b1 && !b2);
	}
	
}
