package oopsProject;
import java.util.Scanner;

class ATM{
	float balance ;
	int pin = 8340;

public void checkPin() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter your pin");
	int enteredPin = sc.nextInt();
	if(enteredPin==pin) {
		menu();
	}
	else {
		System.out.println("Invalid pin");
		checkPin();	
	}
    }
public void menu() {
    Scanner sc = new Scanner(System.in);
	System.out.println("Eter your choice");
	System.out.println("Press 1 for Balance Check \n Press 2 for Withdraw Money \n Press 3 for Deposit Money \n Press 4 for Exit");
	int option = sc.nextInt();
	
	if (option==1) {
		checkBalance();
	}
	else if (option==2) {
		withdrawMoney();
	}
	else if (option==3) {
		depositMoney();
	}
	else if (option==4) {
		return;
	}
	else 
		System.out.println("Invalid option");
}
public void checkBalance() {
	System.out.println("Balance = "+ balance);
	menu();
}
public void withdrawMoney() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Amount");
	int amount = sc.nextInt();
	if(amount<balance) {
		balance-=amount;
		System.out.println("Amount withdraw successfully");
		menu();
	}
	else {
		System.out.println("Insufficient balance");
		menu();
	}
}
public void depositMoney() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Amount");
	int amount = sc.nextInt();
	balance+=amount;
	System.out.println("Money Deposited");
	menu();
}

}

public class AtmMachine {
	public static void main(String[] args) {
		ATM obj = new ATM ();
		obj.checkPin();
	}

}
