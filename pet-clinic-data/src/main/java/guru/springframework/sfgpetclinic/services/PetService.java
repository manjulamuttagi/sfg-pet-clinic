package guru.springframework.sfgpetclinic.services;

import java.util.Set;

import guru.springframework.sfgpetclinic.model.Pet;

public interface PetService {
	Pet findById(Long id);
	Pet Save(Pet pet);
	Set<Pet> findAll();
}
