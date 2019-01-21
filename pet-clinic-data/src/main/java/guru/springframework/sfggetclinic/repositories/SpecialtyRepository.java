package guru.springframework.sfggetclinic.repositories;

import guru.springframework.sfggetclinic.model.Speciality;
import org.springframework.data.repository.CrudRepository;

public interface SpecialtyRepository extends CrudRepository<Speciality, Long> {
}
