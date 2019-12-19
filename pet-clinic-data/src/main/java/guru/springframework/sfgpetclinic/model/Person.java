package guru.springframework.sfgpetclinic.model;

public class Person extends BaseEntity{
	private String firstName;
	private String lastName;
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;  
	}
	
}
