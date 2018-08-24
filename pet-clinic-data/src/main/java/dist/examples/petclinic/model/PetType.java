package dist.examples.petclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class PetType extends BaseEntity {
	private static final long serialVersionUID = -5120822570766786611L;
	private String name;
}
