import java.util.Scanner;

//********************************************************************
// Application.java
//
// Driver class to test implementation of the Comparable interface.
//********************************************************************

public class Application {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter numerator for first rational number: ");
		int n1 = s.nextInt();
		System.out.println("Enter denominator for first rational number: ");
		int d1 = s.nextInt();
		System.out.println("Enter numerator for second rational number: ");
		int n2 = s.nextInt();
		System.out.println("Enter denominator for second rational number: ");
		int d2 = s.nextInt();
		
		RationalNumber r1 = new RationalNumber(n1, d1);
		RationalNumber r2 = new RationalNumber(n2, d2);
		int compare = r1.compareTo(r2);
		System.out.println("r1.compareTo(r2) returns "+compare);
		if (compare == 0)
			System.out.println("r1 and r2 are essentially equal");
		else if (compare == -1)
			System.out.println("r1 is greater than r2");
		else
			System.out.println("r1 is less than r2");
		s.close();
	}//end main

}//end class
