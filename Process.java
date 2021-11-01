
/**
 * This class represents a process such as one that might run on a computer.
 * 
 * @author lschoch
 * @version 1.0 Interfaces_LHS Fall/2021 Interfaces_LHS
 */

public class Process implements Priority, Comparable<Process> {

	/**
	 * An integer that identifies the process, important for identifying the process
	 * as it's running.
	 */
	private String processID;

	/**
	 * An integer to quantify the priority given to the object by the system.
	 */
	private int priority;

	/**
	 * Empty-argument constructor to put object into consistent state
	 */
	public Process() {
		this.processID = "";
		this.priority = 0;
	}//end empty-argument constructor

	/**
	 * Constructor to create object with common usage. This is the preferred
	 * constructor.
	 * 
	 * @param priority the priority assigned to the object
	 */
	public Process(String processID, int priority) {
		super();
		this.processID = processID;
		this.priority = priority;
	}//end preferred constructor

	/**
	 * Compares the priorities for this process and the input process. Returns 0 if
	 * the two are equal, returns -1 if the priority for this process is greater
	 * than that for the input process, returns 1 if the priority for this process
	 * is less than that for the input process.
	 */
	@Override
	public int compareTo(Process process) {
		if (this.priority == process.getPriority())
			return 0;
		else if (this.priority < process.getPriority())
			return -1;
		else
			return 1;
	}//end compareTo

	/**
	 * Getter for processID
	 * 
	 * @return the current value of processID
	 */
	public String getProcessID() {
		return processID;
	}//end getProcessID

	/**
	 * Setter for processID
	 * 
	 * @param processID the value of processID to be set
	 */
	public void setProcessID(String processID) {
		this.processID = processID;
	}//end setProcessID

	/**
	 * Getter for priority
	 * 
	 * @return the current value for priority
	 */
	public int getPriority() {
		return priority;
	}//end getPriority

	/**
	 * Setter for priority
	 * 
	 * @param priority the value of the priority to be set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}//end setPriority

	@Override
	public String toString() {
		return "Process [processID=" + processID + ", priority=" + priority + "]";
	}//end toString

}//end class