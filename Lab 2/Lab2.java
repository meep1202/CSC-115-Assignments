/*
 * Lab2.java
 *
 * A class of static methods that operate on Students
 *
 */
public class Lab2 {
    
	/*
	 * Purpose: determines which student has the higher grade
	 * Parameters: Student - s1, Student - s2
	 * Returns: Student - the Student with the higher grade,
	 *                    s1 if they have the same grade
	 * Precondition: s1 and s2 are not null
	 */
	public static Student getHigherGradeStudent(Student s1, Student s2) {
		if (s1.getGrade() >= s2.getGrade()) {
			return s1;
		}
		return s2;
	}


	/*
	 * Purpose: determines whether the grade of Student s
	 *          is above the threshold
	 * Parameters: Student - s, int - threshold
	 * Returns: boolean - true if grade is above threshold, false otherwise
	 * Preconditions: s is not null
	 */
	public static boolean isGradeAbove(Student s, int threshold) {
		if (s.getGrade() > threshold) {
			return true;
		}
		return false;
	}



	/*
	 * Purpose: creates an array sIDs of all Students in students
	 * Parameters: Student[] - students
	 * Returns: String[] - array of sIDs
	 * Preconditions: students is not null and contains no null elements
	 */
	public static String[] getClasslist(Student students[]) {
		String strang[] = new String[students.length];
		for (int i = 0; i < students.length; i++) {
			strang[i] = students[i].getSID();
		}
		return strang;
	}


	/*
	 * Purpose: counts the number of Students in students
	 *          with grade above threshold
	 * Parameters: Student[] - students, int - threshold
	 * Returns: int - the number of students with a grade above threshold
	 * Preconditions: students is not null and contains no null elements
	 */
	// HINT: you should be using the isGradeAbove method!
	public static int countAbove(Student[] students, int threshold) {
		int count = 0;
		for (int i = 0; i < students.length; i++) {
			if (isGradeAbove(students[i], threshold)) {
				count++;
			}
		}
		return count;
	}


	/*
	 * Purpose: calculates the average grade of Students in students,
	 *          does NOT include students with -1 grade in calculation
	 *          average is 0.0 if students is empty or all students have -1 grade
	 * Parameters: Student[] - students
	 * Returns: double - the average grade
	 * Preconditions: students is not null and contains no null elements
	 */
	// HINT: you can use the isGradeAbove method again
	public static double getClassAverage(Student[] students) {
		if (students.length == 0) {
			return 0.0;
		}
		double total = 0;
		double count = 0;
		for (int i = 0; i < students.length; i++) {
			if (isGradeAbove(students[i], -1)) {
				total += students[i].getGrade();
				count++;
			}
		}
		return (total/count);
	}


	/*
	 * Purpose: creates a new array 1 longer than students
	 *          and adds all students and s to the new array
	 * Parameters: Student[] - students, Student s
	 * Returns: Student[] - the new array
	 * Preconditions: students is not null and contains no null elements
	 *                Student s is not already contained within students
	 */
	public static Student[] registerStudent(Student[] students, Student s) {
		Student[] studentsfinal = new Student[students.length + 1];
		for (int i = 0; i < students.length; i++) {
			studentsfinal[i] = students[i];
		}
		studentsfinal[studentsfinal.length - 1] = s;
		return studentsfinal;
	}

}
