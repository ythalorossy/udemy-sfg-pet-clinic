package guru.springframework.sfggetclinic.repositories;

import guru.springframework.sfggetclinic.model.Vet;
import org.springframework.data.repository.CrudRepository;

public interface VetRepository extends CrudRepository<Vet, Long> {
}
