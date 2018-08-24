package dist.examples.petclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper=false)
public class Owner extends Person {
	private static final long serialVersionUID = 8650417817640987184L;
}
