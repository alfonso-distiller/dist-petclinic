package dist.examples.petclinic.services;

import java.util.Set;

import dist.examples.petclinic.model.Pet;

public interface PetServices {
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
