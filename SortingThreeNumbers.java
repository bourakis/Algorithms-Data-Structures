public class SortingThreeNumbers 
{
  public static void main(String[] args) 
  {
		int a = 99;
		int b = 10;
		int c = 5;
		int t = 0;
		
		if (a > b) { t = a; a = b; b = t; }
		if (a > c) { t = a; a = c; c = t; }
		if (b > c) { t = b; b = c; c = t; }
		
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}
