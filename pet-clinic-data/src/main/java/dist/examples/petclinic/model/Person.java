package dist.examples.petclinic.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;

@Data
@EqualsAndHashCode(callSuper=false)
public class Person extends BaseEntity {
	private static final long serialVersionUID = 3349217535162052308L;
	private String firstName;
    private String lastName;
}
