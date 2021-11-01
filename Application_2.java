
/**
 * Driver class to test constructors, methods, getters/setters for all classes
 *
 * @author Larry Schoch
 * @version 1.0 Construction Project Fall/2021
 */
public class Application_2 {

	public static void main(String[] args) {
		
		// Testing the Task class
		System.out.println("\n-------------------------- TESTING TASK CLASS"
	            +" -------------------------");
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
		System.out.println("Testing empty-argument constructor, getters/"
					+"setters, and toString method:");
		System.out.println(myTask.toString());
		// Testing preferred constructor
		Task t1 = new Task("First To Do", Priority.MED_PRIORITY, Task.Status.IN_PROCESS);
		Task t2 = new Task("Second To Do", Priority.MED_PRIORITY, Task.Status.NOT_STARTED);
		System.out.println("\nTesting preferred constructor:");
		System.out.println("t1.toString(): "+t1.toString());
		System.out.println("t2.toString(): "+t2.toString());
		// Testing compareTo method
		System.out.println("\nTesting compareTo method:");
		System.out.println("When t1 priority == t2 priority, t1.compareTo(t2) returns "+t1.compareTo(t2));
		t1.setPriority(Priority.MIN_PRIORITY);
		System.out.println("When t1 priority < t2 priority, t1.compareTo(t2) returns "+t1.compareTo(t2));
		t1.setPriority(Priority.MAX_PRIORITY);
		System.out.println("When t1 priority > t2 priority, t1.compareTo(t2) returns "+t1.compareTo(t2));
		
		// Testing the Process class
		System.out.println("\n\n-------------------------- TESTING PROCESS CLASS"
	            +" -------------------------");
		// Create an object of the Process class using the empty-argument
		// constructor.
		Process myProcess = new Process();
		// Use setters to set the instance variables of myProcess
		myProcess.setProcessID("myProcessID");
		myProcess.setPriority(Priority.MED_PRIORITY);
		// Testing empty-argument constructor, getters/setters and toString
		// method
		System.out.println("\nTesting empty-argument constructor, getters/"
					+"setters, and toString method:");
		System.out.println(myProcess.toString());
		// Testing preferred constructor
		Process p1 = new Process("firstProcessID", Priority.MED_PRIORITY);
		Process p2 = new Process("secondProcessID", Priority.MED_PRIORITY);
		System.out.println("\nTesting preferred constructor:");
		System.out.println("p1.toString(): "+p1.toString());
		System.out.println("p2.toString(): "+p2.toString());
		// Testing compareTo method
		System.out.println("\nTesting compareTo method:");
		System.out.println("When p1 priority == p2 priority, p1.compareTo(p2) returns "+p1.compareTo(p2));
		p1.setPriority(Priority.MIN_PRIORITY);
		System.out.println("When p1 priority < p2 priority, p1.compareTo(p2) returns "+p1.compareTo(p2));
		p1.setPriority(Priority.MAX_PRIORITY);
		System.out.println("When p1 priority > p2 priority, p1.compareTo(p2) returns "+p1.compareTo(p2));
		
	}//end main

}//end class