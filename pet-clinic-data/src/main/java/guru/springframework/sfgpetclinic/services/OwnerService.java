package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner Save(Owner owner);
	Set<Owner> findAll();
}
