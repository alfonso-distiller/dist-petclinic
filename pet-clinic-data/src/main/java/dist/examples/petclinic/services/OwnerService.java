package dist.examples.petclinic.services;

import java.util.Set;

import dist.examples.petclinic.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
