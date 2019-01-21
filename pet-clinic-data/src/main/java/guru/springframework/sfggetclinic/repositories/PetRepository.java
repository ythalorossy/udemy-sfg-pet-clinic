package guru.springframework.sfggetclinic.repositories;

import guru.springframework.sfggetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
