package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Vet extends Person{
	private Set<Speciality> specialites;

	public Set<Speciality> getSpecialites() {
		return specialites;
	}

	public void setSpecialites(Set<Speciality> specialites) {
		this.specialites = specialites;
	}

	
	
}
