package cie;
import java.util.Scanner;
public class Internals extends Student {
    protected int marks[] = new int[5];

    public void inputCIEmarks(){
        int i;
        Scanner s = new Scanner(System.in); 
        for(i = 0;i<5;i++){
            System.out.println("Enter Marks in subject "+(i+1));
            marks[i] = s.nextInt();
        }
        

    }
}

