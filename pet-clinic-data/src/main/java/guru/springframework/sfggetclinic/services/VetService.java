package guru.springframework.sfggetclinic.services;

import guru.springframework.sfggetclinic.model.Owner;
import guru.springframework.sfggetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long Id);

    Vet save(Owner vet);

    Set<Vet> findAll();
}
