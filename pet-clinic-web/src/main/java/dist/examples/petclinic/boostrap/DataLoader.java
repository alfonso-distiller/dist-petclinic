package dist.examples.petclinic.boostrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import dist.examples.petclinic.model.Owner;
import dist.examples.petclinic.model.Vet;
import dist.examples.petclinic.services.OwnerService;
import dist.examples.petclinic.services.VetService;

@Component
public class DataLoader implements CommandLineRunner {

	private final OwnerService ownerService;
	private final VetService vetService;
	
	public DataLoader(OwnerService ownerService, VetService vetService) {
		super();
		this.ownerService = ownerService;
		this.vetService = vetService;
	}

	@Override
	public void run(String... args) throws Exception {
		Owner owner1 =  new Owner();
		owner1.setFirstName("Juan");
		owner1.setId(1L);
		owner1.setLastName("Camaney");
		
		Owner owner2 =  new Owner();
		owner2.setFirstName("Sergio");
		owner2.setId(2L);
		owner2.setLastName("el Bailador");
		
		ownerService.save(owner1);
		ownerService.save(owner2);
		
		System.out.println("Loaded owners...");
		
		Vet vet1 =  new Vet();
		vet1.setFirstName("Juan");
		vet1.setId(1L);
		vet1.setLastName("Perez");
		
		Vet vet2 =  new Vet();
		vet2.setFirstName("Fulano");
		vet2.setId(2L);
		vet2.setLastName("de Tal");
		
		vetService.save(vet1);
		vetService.save(vet2);
		
		System.out.println("Loaded vets...");
	}

}
