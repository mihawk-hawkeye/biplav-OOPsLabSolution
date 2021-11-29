package labGL;

import java.util.Random;

public class CredentialService {

	private String email;
	private String pass;
	public void generatePassword() {
		String numbers="0123456789";
		String smallLetters="abcdefghijklmnopqrstuvwxyz";
		String capLetters=smallLetters.toUpperCase();
		String specialChar="!@#$%^&*()<>?:";
		String combinedChars = capLetters + smallLetters + specialChar + numbers;
	     
		Random rand = new Random();
		char[] password=new char[8];
		password[0]= smallLetters.charAt(rand.nextInt(smallLetters.length()));
		password[1]= capLetters.charAt(rand.nextInt(capLetters.length()));
		password[2]= specialChar.charAt(rand.nextInt(specialChar.length()));
		password[3]= numbers.charAt(rand.nextInt(numbers.length()));
		for(int i=4;i<8;i++) {
			password[i]=combinedChars.charAt(rand.nextInt(combinedChars.length()));
			
		}
		//System.out.println("final password= "+new String(password));
		pass = new String(password);
		
	}

	public void showCredentials(Employee emp) {
		
		 System.out.println("Dear "+emp.getFirstName()+", your credentials are as follows");
		 System.out.println("Email        ---> "+ email);
		 System.out.println("Password ---> "+ pass);
	}

	public void generateEmail(String dept, String firstName, String lastName, String compName) {
		
		email = firstName+lastName+"@"+dept+"."+compName+".com";
	}

}
