package classesandobjects;
public class Studentuse{
	public static void main(String[] args) {
		Student s1=new Student();
		System.out.println(s1);
		s1.name="val didar singh";
		s1.setRollNumber(2233);
		
		System.out.println(s1.name);
		System.out.println(s1.getRollNumber());
	}
	
}
