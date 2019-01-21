package guru.springframework.sfggetclinic.services.map;

import guru.springframework.sfggetclinic.model.Owner;
import guru.springframework.sfggetclinic.model.Pet;
import guru.springframework.sfggetclinic.services.OwnerService;
import guru.springframework.sfggetclinic.services.PetService;
import guru.springframework.sfggetclinic.services.PetTypeService;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.Set;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Service
@Profile({"default", "map"})
public class OwnerServiceMap
        extends AbstractMapService<Owner, Long>
        implements OwnerService {

    private final PetTypeService petTypeService;
    private final PetService petService;

    public OwnerServiceMap(PetTypeService petTypeService, PetService petService) {
        this.petTypeService = petTypeService;
        this.petService = petService;
    }

    public Set<Owner> findAll() {
        return super.findAll();
    }

    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        if (nonNull(object)) {
            if (nonNull(object.getPets())) {
                object.getPets().forEach(pet -> {
                    if (nonNull(pet.getPetType())) {
                        if (isNull(pet.getPetType().getId())) {
                            pet.setPetType(petTypeService.save(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }

                    if (isNull(pet.getId())) {
                        Pet savedPet = petService.save(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }

            return super.save(object);
        } else {
            return null;
        }
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findBYLastName(String lastName) {
        return null;
    }
}
