package guru.springframework.sfggetclinic.repositories;

import guru.springframework.sfggetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
