
/**
 * Driver class to test constructors, methods, getters/setters for all classes
 * of Problem 1.
 * 
 * @author Larry Schoch
 * @version 1.0 Interfaces_LHS Fall/2021
 */

public class Application_1 {
	/**
	 * Main method for the Application_1 class
	 * @param args this method does not use command line arguments
	 */
	public static void main(String[] args) {
		// Create 3 rational numbers for testing
		RationalNumber r1 = new RationalNumber(49999, 100000);
		RationalNumber r2 = new RationalNumber(1, 2);
		RationalNumber r3 = new RationalNumber(3, 4);
		
		String str1 = r1.getNumerator()+"/"+r1.getDenominator();
		String str2 = r2.getNumerator()+"/"+r2.getDenominator();
		String str3 = r3.getNumerator()+"/"+r3.getDenominator();
		
		// Format and print output to console
		System.out.println("\nTesting compareTo method:\n");
		System.out.printf("%-16s", " r2");
		System.out.printf("%-16s", "| r2");
		System.out.printf("%-18s", "| r1.compareTo(r2)");
		System.out.println();
		System.out.println("----------------|---------------|-----------------");
		
		// Print results of compareTo method using combinations of the rational
		// numbers created for testing
		System.out.printf("%-16s", " "+str1);
		System.out.printf("%-16s", "| "+str2);
		System.out.printf("%-18s", "| "+padR(r1, r2));
		System.out.println();
		
		System.out.printf("%-16s", " "+str2);
		System.out.printf("%-16s", "| "+str3);
		System.out.printf("%-18s", "| "+padR(r2, r3));
		System.out.println();
		
		System.out.printf("%-16s", " "+str3);
		System.out.printf("%-16s", "| "+str2);
		System.out.printf("%-18s", "| "+padR(r3, r2));
		System.out.println();

	}// end main
	
	/**
	 * This method pads the result of the compareTo method to align the data 
	 * in the output table.
	 * 
	 * @param rA the first rational number for the comparison
	 * @param rB the second rational number for the comparison
	 * @return the padded string result of the comparison
	 */
	public static String padR(RationalNumber rA, RationalNumber rB) {
		int comp = rA.compareTo(rB);
		
		if (comp >= 0)
				return " "+comp;
		else
			return ""+comp;
		
	}//end padR	
	
}// end class
