package guru.springframework.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person{
	private String address;
	private String city;
	private String telephone;
	private Set<Pet> pets;
}
