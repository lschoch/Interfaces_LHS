
/**
 * Driver class to test constructors, methods, getters/setters for all classes
 * of Problem 2
 * 
 * @author Larry Schoch
 * @version 1.0 Interfaces_LHS Fall/2021
 */

public class Application_2 {
	/**
	 * Main method for the Application_2 class
	 * @param args this method does not use command line arguments
	 */
	public static void main(String[] args) {

		// Testing the Task class
		System.out.println("\n-------------------------- TESTING TASK CLASS" + " -------------------------");

		// Create an object of the Task class using the empty-argument
		// constructor.
		Task myTask = new Task();

		// Use setters to set the instance variables of myTask
		myTask.setName("Wash the car");
		myTask.setPriority(Priority.MED_PRIORITY);
		myTask.setStatus(Task.Status.NOT_STARTED);

		// Testing empty-argument constructor, getters/setters and toString
		// method
		System.out.println();
		System.out.println("Testing empty-argument constructor, getters/" + "setters, and toString method:");
		System.out.println("myTask.toString(): " + myTask.toString());

		// Testing preferred constructor
		Task t1 = new Task("First To Do", Priority.MED_PRIORITY, Task.Status.IN_PROCESS);
		Task t2 = new Task("Second To Do", Priority.MED_PRIORITY, Task.Status.NOT_STARTED);
		System.out.println("\nTesting preferred constructor:");
		System.out.println("t1.toString(): " + t1.toString());
		System.out.println("t2.toString(): " + t2.toString());

		// Testing compareTo method
		System.out.println("\nTesting compareTo method:");
		System.out.println(" t1\tt2\tt1.compareTo(t2)");
		System.out.println("----   ----    ------------------");
		System.out.println("  " + t1.getPriority() + "\t" + t2.getPriority() + "\t       " + t1.compareTo(t2));
		t1.setPriority(Priority.MIN_PRIORITY);
		System.out.println("  " + t1.getPriority() + "\t" + t2.getPriority() + "\t       " + t1.compareTo(t2));
		t1.setPriority(Priority.MAX_PRIORITY);
		System.out.println(" " + t1.getPriority() + "\t" + t2.getPriority() + "\t      " + t1.compareTo(t2));

		// Testing the Process class
		System.out.println("\n\n-------------------------- TESTING PROCESS CLASS" + " -------------------------");

		// Create an object of the Process class using the empty-argument
		// constructor.
		Process myProcess = new Process();

		// Use setters to set the instance variables of myProcess
		myProcess.setProcessID("myProcessID");
		myProcess.setPriority(Priority.MED_PRIORITY);

		// Testing empty-argument constructor, getters/setters and toString
		// method
		System.out.println("\nTesting empty-argument constructor, getters/" + "setters, and toString method:");
		System.out.println("myProcess.toString(): " + myProcess.toString());

		// Testing preferred constructor
		Process p1 = new Process("firstProcessID", Priority.MED_PRIORITY);
		Process p2 = new Process("secondProcessID", Priority.MED_PRIORITY);
		System.out.println("\nTesting preferred constructor:");
		System.out.println("p1.toString(): " + p1.toString());
		System.out.println("p2.toString(): " + p2.toString());

		// Testing compareTo method
		System.out.println("\nTesting compareTo method:");
		System.out.println(" p1\tp2\tp1.compareTo(p2)");
		System.out.println("----   ----    ------------------");
		System.out.println("  " + p1.getPriority() + "\t" + p2.getPriority() + "\t       " + p1.compareTo(p2));
		p1.setPriority(Priority.MIN_PRIORITY);
		System.out.println("  " + p1.getPriority() + "\t" + p2.getPriority() + "\t       " + p1.compareTo(p2));
		p1.setPriority(Priority.MAX_PRIORITY);
		System.out.println(" " + p1.getPriority() + "\t" + p2.getPriority() + "\t      " + p1.compareTo(p2));

	}// end main

}// end class
