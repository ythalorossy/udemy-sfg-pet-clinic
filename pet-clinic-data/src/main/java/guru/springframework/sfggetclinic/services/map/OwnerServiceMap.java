package guru.springframework.sfggetclinic.services.map;

import guru.springframework.sfggetclinic.model.Owner;
import guru.springframework.sfggetclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap
        extends AbstractMapService<Owner, Long>
        implements CrudService<Owner, Long> {

    public Set<Owner> findAll() {
        return super.findAll();
    }

    public Owner findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    public void deleteById(Long id) {
        super.deleteById(id);
    }
}
