package dist.examples.petclinic.model;

import java.time.LocalDate;
import lombok.*;

@Getter
@Setter
public class Pet {
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;
}
