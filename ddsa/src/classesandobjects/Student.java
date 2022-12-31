package classesandobjects;

public class Student{
	public String name;
	private int rollNumber;
	public Student() {
		
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		if(rollNumber<=0) 
			return;
		this.rollNumber=rollNumber;
	}
}
