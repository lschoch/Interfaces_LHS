
/**
 * This class represents a task such as one that might appear on a To Do list.
 * 
 * @author lschoch
 * @version 1.0 Interfaces_LHS Fall/2021
 */

public class Task implements Priority, Comparable<Task> {

	/**
	 * Enumeration to set values for an enumerated data type named Status.
	 * 
	 */
	enum Status {
		IN_PROCESS, NOT_STARTED, COMPLETE
	}

	/**
	 * The name and/or a brief description of the task.
	 */
	private String name;

	/**
	 * An integer to quantify the priority assigned to the task.
	 */
	private int priority;

	/**
	 * The task's stage of completion.
	 */
	private Status status;

	/**
	 * Empty-argument constructor to put object into consistent state.
	 */
	public Task() {
		name = "";
		priority = 0;
		status = Status.NOT_STARTED;
	}// end empty-argument constructor

	/**
	 * Constructor to create object with common usage. This is the preferred
	 * constructor.
	 * 
	 * @param name the name of the object
	 * @param priority the priority assigned to the object
	 * @param status the status of the object
	 */
	public Task(String name, int priority, Task.Status status) {
		super();
		this.name = name;
		this.priority = priority;
		this.status = status;
	}// end preferred constructor

	/**
	 * Compares the priorities for this task and the input task. Returns 0 if the
	 * two are equal, returns 1 if the priority for this task is greater than that
	 * for the input task, returns -1 if the priority for this task is less than that
	 * for the input task.
	 */
	@Override
	public int compareTo(Task task) {
		if (this.priority == task.getPriority())
			return 0;
		else if (this.priority < task.getPriority())
			return -1;
		else
			return 1;
	}// end compareTo

	/**
	 * Getter for name
	 * 
	 * @return the current value for name
	 */
	public String getName() {
		return name;
	}// end getName

	/**
	 * Setter for name
	 * 
	 * @param name the value of name to be set
	 */
	public void setName(String name) {
		this.name = name;
	}// end setName

	/**
	 * Getter for priority
	 * 
	 * @return the current value of priority
	 */
	public int getPriority() {
		return priority;
	}// end priority

	/**
	 * Setter for priority
	 * 
	 * @param priority the value of priority to be set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}// end priority

	/**
	 * Getter for status
	 * 
	 * @return the current value for status
	 */
	public Status getStatus() {
		return status;
	}// end getStatus

	/**
	 * Setter for status
	 * 
	 * @param status the value of status to be set
	 */
	public void setStatus(Status status) {
		this.status = status;
	}// end setStatus

	@Override
	public String toString() {
		return "Task [name=" + name + ", priority=" + priority + ", status=" + status + "]";
	}// end toString

}// end class
