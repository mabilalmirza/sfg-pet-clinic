package guru.springframework.sfgpetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
public class Vet extends BaseEntity {

    private Set<Speciality> specialities = new HashSet<>();

}
