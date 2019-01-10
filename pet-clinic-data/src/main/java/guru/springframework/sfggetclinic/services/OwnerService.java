package guru.springframework.sfggetclinic.services;

import guru.springframework.sfggetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {
    Owner findBYLastName(String lastName);
    Owner findById(Long Id);
    Owner save(Owner owner);
    Set<Owner> findAll();
}
