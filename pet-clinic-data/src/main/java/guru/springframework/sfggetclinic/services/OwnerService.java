package guru.springframework.sfggetclinic.services;

import guru.springframework.sfggetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {

    Owner findByLastName(String lastName);
}
