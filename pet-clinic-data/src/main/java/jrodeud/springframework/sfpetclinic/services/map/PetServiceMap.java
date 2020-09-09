package jrodeud.springframework.sfpetclinic.services.map;

import jrodeud.springframework.sfpetclinic.model.Pet;
import jrodeud.springframework.sfpetclinic.services.PetService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public void deletedById(Long id) {
        super.deletedById(id);
    }
}
