package guru.springframework.sfggetclinic.services;

import guru.springframework.sfggetclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long Id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
