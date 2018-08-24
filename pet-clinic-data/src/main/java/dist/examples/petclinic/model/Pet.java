package dist.examples.petclinic.model;

import java.time.LocalDate;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Pet extends BaseEntity {
	private static final long serialVersionUID = 1301769573969023414L;
	private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
