package guru.springframework.sfggetclinic.services.map;

import guru.springframework.sfggetclinic.model.Owner;
import guru.springframework.sfggetclinic.services.OwnerService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class OwnerServiceMap
        extends AbstractMapService<Owner, Long>
        implements OwnerService {

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

    @Override
    public Owner findBYLastName(String lastName) {
        return null;
    }
}
