import java.util.*;
class WrongAge extends Exception{
    WrongAge(String s){
        super(s);
    }
}

class InputScanner{
    Scanner s = new Scanner(System.in);
}

class Father extends InputScanner{
    int fatherAge;
    Father() throws WrongAge {
        System.out.println("Enter father's age: ");
        fatherAge = s.nextInt();
        if (fatherAge < 0) 
            throw new WrongAge("Age cannot be negative");
    }

    void displayf(){
        System.out.println("\nFather's  age: " + fatherAge);
    }
}

class Son extends Father{
    int sonAge;
    Son() throws WrongAge{
        super();
        System.out.println("Enter son's age: ");
        sonAge = s.nextInt();
        if (sonAge < 0)  
            throw new WrongAge("Age cannot be negative.");
        else if(sonAge > fatherAge)
            throw new WrongAge("Son's age cannot be greater than father's age.");
        else{
            displayf();
            displaySon();
            throw new WrongAge("Valid age.");
        }
    }

    void displaySon(){
        System.out.println("\nSon's age : "+ sonAge);
    }
}

class exceptionsmain {
    public static void main(String[] args) {
        try{
            Son son = new Son();
        } catch(WrongAge e) {
            System.err.println(e.getMessage());
        }
    }

}
