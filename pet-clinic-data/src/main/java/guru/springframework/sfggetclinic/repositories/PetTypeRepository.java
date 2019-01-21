package guru.springframework.sfggetclinic.repositories;

import guru.springframework.sfggetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
