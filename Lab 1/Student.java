package Lab1;
/*
* Student.java
* A Student class
*/
public class Student {

	private String sID;
	private int grade;

	public Student() {
		sID = "";
		grade = -1;
	}

	public Student(String sID, int grade) {
		this.sID = sID;
		this.grade = grade;
	}
	
	public void setSID(String sID) {
		this.sID = sID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public String getSID() {
		return sID; // so it compiles
	}
	
	public int getGrade() {
		return grade; // so it compiles
	}

	public String toString() {
		return (this.sID + ":" + this.grade);
	}

}
