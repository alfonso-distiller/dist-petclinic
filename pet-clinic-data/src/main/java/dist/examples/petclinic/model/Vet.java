package dist.examples.petclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Vet extends Person {
	private static final long serialVersionUID = 9015338318301448653L;
}
