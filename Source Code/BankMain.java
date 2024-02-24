import java.util.*;
import java.lang.Math;
abstract class Bank{
	abstract void withdraw(double amt);
	abstract void deposit(double amt);
	abstract void display();
	abstract void menudisp();
}

class Account extends Bank{
	String name;
	int acc_num;
	String type;
	double bal;
	String menu = " ";
	Account(String name, int acc_num, String type, double bal, String menu){
		this.name = name;
		this.acc_num = acc_num;
		this.type = type;
		this.bal = bal;
		this.menu = menu;
	}
	public void withdraw(double amt){
		if(amt>bal){
			System.out.println("Withdraw declined! Max amount you can withdraw is: " + bal);
		}
		else{
			bal -= amt;
			System.out.println("Updated balance is: " + bal);
		}
	}

	public void deposit(double amt){
		bal += amt;
		System.out.println("Updated balance is: " + bal);
	}
	
	
	public void display(){
		System.out.println("Account number: " + name);
		System.out.println("Account name: " + acc_num);
		System.out.println("Account type: " + type);
		System.out.println("Balance: " + bal);
	}
	public void menudisp(){
		menu = "---------MENU---------\n1. Deposit\n2. Withdraw\n3. Display";
	}
}

class Savings extends Account{
	double interest;
	Savings(String name, int acc_num, String type, double bal,String menu, double interest){
		super(name, acc_num, type, bal,menu);
		this.interest = interest;
	}
	public double interest(int time){
		double comp;
		comp = bal + Math.pow((bal*(1+(interest/100))),time);
		return comp;
	}
	public void menudisp(){
		super.menudisp();
		menu += "\n4. Compute Interest\n5. Exit";
	}
}

class Current extends Account{
	double minbal = 10000;
	Current(String name, int acc_num, String type, double bal, String menu, double minbal){
		super(name, acc_num, type, bal,menu);
		this.minbal = minbal;
	}

	public void menudisp(){
		super.menudisp();
		menu += "\n4. Cheque Book\n5. Exit";
	}

	public void withdraw(double amt){
		if(amt>bal){
			System.out.println("Withdraw declined! Max amount you can withdraw is: " + bal);
		}
		else{
			bal -= amt;
			System.out.println("Updated balance is: " + bal);
		}
	}
	
}

class BankMain{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		String name;
		String menu = " ";
		int acc_num;
		String type;
		double bal = 0;
		double interest;
		int choice;
		int time;
		double money;
		System.out.println("Enter customer name: ");
		name = s.next();
		System.out.println("Enter account number: ");
		acc_num = s.nextInt();
		System.out.println("---------ACCOUNT TYPE---------\n1.Savings Account\n2.Current Account\nPlease select account type: ");
		type = s.next();
		
		if(type.equals("savings")){
			System.out.println("Enter interest amount: ");
			interest = s.nextDouble();
			Savings accs = new Savings(name, acc_num, type, bal, menu, interest);
			do{
				accs.menudisp();				
				System.out.println(accs.menu);
				System.out.println("Enter choice: ");
				choice = s.nextInt();
				switch(choice){
					case 1: 
						System.out.println("Enter amount to be deposited: ");
						money = s.nextDouble();
						accs.deposit(money);
						break;
					case 2: 
						System.out.println("Enter amount to be withdrawn: ");
						money = s.nextDouble();
						accs.withdraw(money);
						break;
					case 3: 
						accs.display();
						break;
					case 4: 
						System.out.println("Enter time to calculate interest in years: ");
						time = s.nextInt();
						money = accs.interest(time);
						System.out.println("Compund interest is: " + money);
						break;
					case 5:
						break;
				}	
			}while(choice!=5);
		}
		
	}
}