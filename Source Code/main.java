import java.util.Scanner;

class Subject
{
	int subMarks;
	int credits;
	int grade;
}

class Student
{
	Subject subject[];
	String name;
	String usn;
	double SGPA;
	Scanner s;
	int i;

	Student()
	{
		int i;
		subject = new Subject[8];
		for(i=0;i<8;i++)
			subject[i] = new Subject();
		s = new Scanner(System.in);
	}

	void getStudentDetails()
	{
		System.out.println("Enter your name: ");
		name = s.next();
		System.out.println("Enter your USN: ");
		usn = s.next();
	}

	void getMarks()
	{
		for(i=0;i<8;i++)
		{
			System.out.println("Enter marks of subject " + (i+1) + ": ");
			subject[i].subMarks = s.nextInt();
			System.out.println("Enter credits of subject " + (i+1) + ": ");
			subject[i].credits = s.nextInt();
			subject[i].grade = (subject[i].subMarks/10) + 1;
		}
	}
	void computeSGPA()
	{
		int effscore = 0;
		int totalcreds = 0;
		for(i=0;i<8;i++)
		{
			effscore += subject[i].grade * subject[i].credits;
			totalcreds += subject[i].credits;
		}
		SGPA = (double)effscore/(double)totalcreds;
	}
}

class Main
{
	public static void main(String args[])
	{
		Student s1 = new Student();
		s1.getStudentDetails();
		s1.getMarks();
		s1.computeSGPA();
		System.out.println("Name: " + s1.name);
		System.out.println("USN: " + s1.usn);
		System.out.println("SGPA: " + s1.SGPA);
	}
}