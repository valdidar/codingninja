package classesandobjects;

public class Student{
	public String name;
	final private int rollNumber;
	private static int numStudent=0;
	double cgpa;
	public final static double CONVERSIONFACTOR=0.95;
	//static belong to class and available to all objects
//	Student(String name, int rollNumber) {
//		this.rollNumber=rollNumber;
//		this.name=name;
//		numStudent++;
//	}
	Student(String name) {
		this.name=name;
		numStudent++;
		rollNumber=numStudent;
	}
	Student(){
		name="default";
		numStudent++;
		rollNumber=numStudent;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public static int getNumStudents() {
		return numStudent;
	}
//	public void setRollNumber(int rollNumber) {
//		if(rollNumber<=0) 
//			return;
//		this.rollNumber=rollNumber;
//	}
}
