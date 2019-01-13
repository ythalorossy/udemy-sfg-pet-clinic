package guru.springframework.sfggetclinic.services.map;

import guru.springframework.sfggetclinic.model.Vet;
import guru.springframework.sfggetclinic.services.VetService;

import java.util.Set;

public class VetServiceMap
        extends AbstractMapService<Vet, Long>
        implements VetService {

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return null;
    }

    @Override
    public Vet save(Vet object) {
        return null;
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {

    }
}
