package dist.examples.petclinic.services.map;

import java.util.Set;

import dist.examples.petclinic.model.Vet;
import dist.examples.petclinic.services.VetService;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements VetService {

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}

	@Override
	public Vet findById(Long id) {
		return super.findById(id);

	}

	@Override
	public Vet save(Vet object) {
		return super.save(object, object.getId());
	}

	@Override
	public void delete(Vet object) {
		super.delete(object);
	}

	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

}
