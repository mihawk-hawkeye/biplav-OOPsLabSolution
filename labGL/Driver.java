package labGL;

import java.util.Scanner;
/*
 * 
    a) Generate an email with the following syntax 
       firstNamelastName@department.company.com
    b) Determine the department (Technical, Admin, Human Resource, Legal)
    c) Generate a random password which will contain (number, capital letter, small letter & special character)
    d) Display the generated credentials
    e) Use parameterized constructor of class Employee, to pass firstName, lastName.
    f) Create a separate CredentialService which will have generatePassword, generateEmailAddress, & showCredentials method.
 */
public class Driver {

	
	public static void main(String[] args) {
		displayMenu();
		String 	dept=selectDept();
		Employee emp = new Employee("Rakesh","Sharma");
		CredentialService cred = new CredentialService();
		cred.generatePassword();
		cred.generateEmail(dept,emp.getFirstName(),emp.getLastName() ,"abc");
		cred.showCredentials(emp);
		
	
	}

	private static void displayMenu() {

		System.out.println("Please Enter the department from the following");
		System.out.println("1. Techinical \n2. Admin \n3. Human  Resource \n4. Legal");

	}

	private static String selectDept() {

		int  choice;
		
	try (Scanner scan = new Scanner(System.in)) {
		choice = scan.nextInt();
		switch(choice) {
		case 1: 
				System.out.println("you chose Techinical ");
				return "tech";
				
		case 2: 
			System.out.println("you chose Admin ");
			return "adm";
			
		case 3: 
			System.out.println("you chose Human  Resource ");
			return "hr";
			
		case 4: 
			System.out.println("you chose Legal ");
			return "lg";
			
		default:
			System.out.println("you selected wrong choice");
			System.exit(0);
			return "";
			
		}
		
	}
		
		
	
	}

}
