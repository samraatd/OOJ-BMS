package cie;
import java.util.*;
public class Student {

    protected String usn = new String(); 
    protected String name = new String(); 
    protected int sem;

    public void inputStudentDetails() { 

        Scanner s = new Scanner(System.in);
        System.out.println("Enter usn: ");
        usn = s.nextLine();
        System.out.println("Enter name: ");
        name = s.nextLine();
        System.out.println("Enter sem: ");
        sem = s.nextInt();

  
    }

    public void displayStudentDetails() { 
        System.out.println("\nUSN: " + usn);
        System.out.println("\nName: " + name);
        System.out.println("\nSem: " + sem);
    }
}

