package Lab1;
/*
 * Lab1Part2Tester.java
 *
 * A tester for the methods in your Student class
 *
 */
public class Lab1Part2Tester {

	public static void main(String[] args) {
		testConstructorsAndGetters();
		testSettersAndGetters();
		testToString();
	}

	public static void testConstructorsAndGetters() {

		// 1)
		// Tests constructor with no arguments, getSID and getGrade
		// uncomment the following to test your implementation
	
		Student s1 = new Student();
		System.out.println("sID of student with default constructor: " + s1.getSID());
		System.out.println("grade of student with default constructor: " + s1.getGrade());

		Student s2 = new Student("V00923094", 85);
		System.out.println("sID of student with custom constructor: " + s2.getSID());
		System.out.println("grade of student with custom constructor: " + s2.getGrade());
		
	}

	public static void testSettersAndGetters(){
		// 2) 
		// Hint: use getSID and getGrade methods to get the updated values
		
		System.out.println("\nOriginal information for student:");
		Student s2 = new Student("V00923094", 85);
		System.out.println("sID of student: " + s2.getSID());
		System.out.println("grade of student: " + s2.getGrade());
		
		s2.setSID("V12345678");
		s2.setGrade(0);
		
		System.out.println("\nUpdated information for student:");
		System.out.println("sID of student: " + s2.getSID());
		System.out.println("grade of student: " + s2.getGrade());
		
	}

	public static void testToString() {
		// 3)
		// create a student object and test the toString method
		Student s2 = new Student("V00999799", 98);
		System.out.println("\ntoString testing:\n" + s2.toString());
	}
}
