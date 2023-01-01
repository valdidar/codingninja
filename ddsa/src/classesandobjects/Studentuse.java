package classesandobjects;
public class Studentuse{
	public static void main(String[] args) {
		Student s1=new Student("val didar singh");
		System.out.println(s1);
//		s1.name="val didar singh";
//		s1.setRollNumber(2233);
		Student s2=new Student("girik");
		Student s3=new Student();		
		System.out.println(s1.name);
		System.out.println(s1.getRollNumber());
		System.out.println(s2.name);
		System.out.println(s2.getRollNumber());
		System.out.println(s3.name);
		System.out.println(s3.getRollNumber());
		System.out.println(Student.numStudent);
	}
	
}
