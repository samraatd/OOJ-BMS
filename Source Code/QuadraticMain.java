import java.util.Scanner;
class Quadratic{
int a,b,c;
double r1,r2,d;
void getd()
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the coefficients of a,b,c: ");
a = s.nextInt();
b = s.nextInt();
c = s.nextInt();
}
void compute()
{
while(a==0)
{
System.out.println("Not a quadratic equation!");
System.out.println("Enter a non zero value of a: ");
Scanner s = new Scanner(System.in);
a = s.nextInt();
}
d= b*b - 4*a*c;
if(d==0)
{
r1 = (-b)/(2*a);
System.out.println("Roots are real and equal");
System.out.println("Root 1 = Root 2 = " + r1);
}
else if(d>0)
{
r1 = ((-b) + (Math.sqrt(d)))/(double)(2*a);
r2 = ((-b) - (Math.sqrt(d)))/(double)(2*a);
System.out.println("Roots are real and distinct");
System.out.println("Root 1 = " + r1 + " Root 2 = " + r2);
}
else if(d<0)
{
System.out.println("Roots are imaginary");
r1 = (-b)/(2*a);
r2 = Math.sqrt(-d)/(2*a);
System.out.println("Root 1 = " + r1 + " + i " + r2);
System.out.println("Root 2 = " + r1 + " - i " + r2);
}
}
}

class QuadraticMain
{
public static void main(String args[])
{
Quadratic q = new Quadratic();
q.getd();
q.compute();
System.out.println("Name: Samraat Dabolay");
System.out.println("USN: 1BM22CS236");
}
}