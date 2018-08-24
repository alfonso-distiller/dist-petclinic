package dist.examples.petclinic.services;

import java.util.Set;

import dist.examples.petclinic.model.Vet;

public interface VetServices {
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
