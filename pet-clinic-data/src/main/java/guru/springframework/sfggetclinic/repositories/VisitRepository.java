package guru.springframework.sfggetclinic.repositories;

import guru.springframework.sfggetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
