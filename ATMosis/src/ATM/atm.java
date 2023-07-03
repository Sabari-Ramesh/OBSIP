package ATM;
import java.util.*;
public class atm {
public static void main(String[] args) {
	int pin=1234; //atm card pin number
	int balance=10_000;//intial balance
	int deposit=0;
	int withdraw=0;
	int transfer=0;
	String name;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Your Pin NUmber :");
	int password = sc.nextInt();
	if(password==pin) {
		System.out.println("Enter your Name :");
		name=sc.next();
		System.out.println("Welcome "+name);
		while(true) {
			System.out.println("Press 1 to check your Transition History :");
			System.out.println("Press 2 to Withdraw :");
			System.out.println("Press 3 to Deposit :");
			System.out.println("Press 4 to Transfer :");
			System.out.println("Press 5 to Quite :");
			int opt=sc.nextInt();//to get option from user
			if(opt<=4 && opt>0) {
			switch(opt) {
			case 1: //TO CHECK THE TRANSITION HISTORY 
				System.out.println("Available balance :"+balance);
				System.out.println("Amount Deposit    :"+deposit);
				System.out.println("Amount Withdraw   :"+withdraw);
				System.out.println("ThankYou");
				break;
			case 2:  //TO WITHDRAW THE MONEY
				System.out.println("\"Enter Amount to Withdraw :\"");
				withdraw=sc.nextInt();
				if(withdraw>balance) { //TO CHECK MONEY IS AVAILABLE OR NOT
					System.out.println("\"Sorry Your balance is not Sufficient\"");
					System.out.println("Try less than your available Balance");
				}
				else {
					System.out.println("\"Your Amount was Withdraw Successfully\"");
					balance-=withdraw;
				}
				break;
			case 3: //TO DEPOSIT THE AMOUNT
				System.out.println("Enter Amount to Deposit :");
				deposit=sc.nextInt();
				System.out.println("\"Your Amount is Deposited Sucessfully\"");
				balance+=deposit;
				break;
			case 4: //TO TRANSFER THE AMOUNT
				System.out.println("\"Enter Amount to Transfer :\"");
				transfer=sc.nextInt();
				if(balance<transfer) {
					System.out.println("\"Sorry you are not have Sufficient Balance :\"");
				}
				break;
			}
			}
			else if(opt==5) {
				System.out.println("ThankYou !!!");
				break;
			}
			else {
				System.out.println("\"Plese enter valid option\"");
			}
			
		}
	}
	else {
		System.out.println("Please Enter Correct Pin Number:");
	}
}
}
