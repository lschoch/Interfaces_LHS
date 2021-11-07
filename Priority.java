
/**
 * Interface to set priority constants, includes two abstract methods:
 * getPriority and setPriority.
 * 
 * @author lschoch
 * @version 1.0 Interfaces_LHS Fall/2021 Interfaces_LHS
 */

public interface Priority {

	/**
	 * Sets value for minimum priority
	 */
	public final int MIN_PRIORITY = 1;

	/**
	 * Sets value for maximum priority
	 */
	public final int MAX_PRIORITY = 10;

	/**
	 * Sets value for medium priority
	 */
	public final int MED_PRIORITY = 5;

	/**
	 * Getter for priority
	 * 
	 * @return the current value for priority
	 */
	public int getPriority();

	/**
	 * Setter for priority
	 * 
	 * @param priority the
	 */
	public void setPriority(int priority);

}