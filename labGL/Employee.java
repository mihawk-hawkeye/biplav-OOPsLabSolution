package labGL;



public class Employee {
	
	private  String firstName;
	private String lastName;
	 
	Employee(String fName, String lName){
		firstName=fName;
		lastName=lName;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	

}
