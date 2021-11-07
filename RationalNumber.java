
/**
 * This class represents one rational number with a numerator and denominator,
 * and it includes methods for performing various operations on rational
 * numbers.
 * 
 * @author lschoch
 * @version 1.0 Interfaces_LHS Fall/2021 Interfaces_LHS
 */

public class RationalNumber implements Comparable<RationalNumber> {

	/**
	 * Integer variables to hold the numerator and denominator of the rational
	 * number.
	 */
	private int numerator, denominator;

	/**
	 * Floating point variable to hold TOLERANCE - the numerical difference between
	 * two floating point numbers must be less than TOLERANCE if these two numbers
	 * are to be considered equal.
	 */
	final float TOLERANCE = 0.0001F;

	/**
	 * Constructor: Sets up the rational number by ensuring a nonzero denominator
	 * and making only the numerator signed.
	 * 
	 * @param numer the numerator of the rational number
	 * @param denom the denominator of the rational number
	 */
	public RationalNumber(int numer, int denom) {
		if (denom == 0)
			denom = 1;

		// Make the numerator "store" the sign
		if (denom < 0) {
			numer = numer * -1;
			denom = denom * -1;
		}

		numerator = numer;
		denominator = denom;

		reduce();
	}//end constructor

	/**
	 * Getter for the numerator of this rational number
	 * 
	 * @return the current value of the numerator
	 */
	public int getNumerator() {
		return numerator;
	}//end Getter

	/**
	 * Getter for the denominator of this rational number
	 * 
	 * @return the current value of the denominator
	 */
	public int getDenominator() {
		return denominator;
	}//end getDenominator

	/**
	 * Method to compute the reciprocal of the input rational number
	 * 
	 * @return the reciprocal of the input rational number
	 */
	public RationalNumber reciprocal() {
		return new RationalNumber(denominator, numerator);
	}//end reciprocal

	/**
	 * Adds this rational number to the one passed as a parameter. A common
	 * denominator is found by multiplying the individual denominators.
	 * 
	 * @param op2 the rational number to be added to this rational number
	 * @return the sum of this rational number and the input rational number
	 */
	public RationalNumber add(RationalNumber op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int sum = numerator1 + numerator2;

		return new RationalNumber(sum, commonDenominator);
	}//end add

	/**
	 * Subtracts the rational number passed as a parameter from this
	 * rational number.
	 * 
	 * @param op2 the rational number to be subtracted from this rational
	 * number
	 * @return the difference between this rational number and the input
	 * rational number
	 */
	public RationalNumber subtract(RationalNumber op2) {
		int commonDenominator = denominator * op2.getDenominator();
		int numerator1 = numerator * op2.getDenominator();
		int numerator2 = op2.getNumerator() * denominator;
		int difference = numerator1 - numerator2;

		return new RationalNumber(difference, commonDenominator);
	}//end subtract

	/**
	 * Multiplies this rational number by the one passed as a parameter.
	 * @param op2 the rational number by which to multiply this rational
	 * number.
	 * 
	 * @return the product of the input rational number and this rational
	 * number
	 */
	public RationalNumber multiply(RationalNumber op2) {
		int numer = numerator * op2.getNumerator();
		int denom = denominator * op2.getDenominator();

		return new RationalNumber(numer, denom);
	}//end multiply

	// -----------------------------------------------------------------
	// Divides this rational number by the one passed as a parameter
	// by multiplying by the reciprocal of the second rational.
	// -----------------------------------------------------------------
	/**
	 * Divides this rational number by the one passed as a parameter
	 * by multiplying by the reciprocal of the second rational.
	 * 
	 * @param op2 the rational number by which this rational number will be 
	 * divided.
	 * @return the numerical result when this random number is divided by 
	 * the input random number
	 */
	public RationalNumber divide(RationalNumber op2) {
		return multiply(op2.reciprocal());
	}//end divide

	/**
	 * Determines if this rational number is equal to the one passed as a 
	 * parameter. Assumes they are both reduced.
	 * 
	 * @param op2 the reduced rational number to be matched for equality
	 * @return true if the two rational numbers are equal, false if not
	 */
	public boolean isLike(RationalNumber op2) {
		return (numerator == op2.getNumerator() && denominator == op2.getDenominator());
	}//end isLike

	/**
	 * Returns this rational number as a string.
	 * 
	 * @return this rational number as a string
	 */
	// 
	// -----------------------------------------------------------------
	public String toString() {
		String result;

		if (numerator == 0)
			result = "0";
		else if (denominator == 1)
			result = numerator + "";
		else
			result = numerator + "/" + denominator;

		return result;
	}//end toString

	/**
	 * Reduces this rational number by dividing both the numerator and the
	 * denominator by their greatest common divisor.
	 */
	private void reduce() {
		if (numerator != 0) {
			int common = gcd(Math.abs(numerator), denominator);

			numerator = numerator / common;
			denominator = denominator / common;
		}
	}//end reduce

	/**
	 * Computes and returns the greatest common divisor of the two positive 
	 * parameters. Uses Euclid's algorithm.
	 * 
	 * @param num1 the first positive parameter
	 * @param num2 the second positive parameter
	 * @return the greatest common denominator of the two positive parameters
	 */
	private int gcd(int num1, int num2) {
		while (num1 != num2)
			if (num1 > num2)
				num1 = num1 - num2;
			else
				num2 = num2 - num1;

		return num1;
	}//end gcd
	
	/**
	 * Computes the equivalent numerical floating point values of the
	 * two RationalNumbers and compares them. Returns 0 if the difference
	 * between the values is less than the TOLERANCE, returns 1 if the
	 * floating point value for this RationalNumber is greater than that
	 * for the input RationalNumber, and returns -1 if it is less than that
	 * for the input RationalNumber.
	 * 
	 * @return the integer indicator of the numerical sort order of the two
	 * rational numbers
	 */
	@Override
	public int compareTo(RationalNumber r2) {
		double diff = (float) numerator / denominator - (float) (r2.getNumerator()) / r2.getDenominator();
		if (Math.abs(diff) < TOLERANCE)
			return 0;
		else if (diff > 0)
			return 1;
		else
			return -1;
	}//end compareTo

}// end class
