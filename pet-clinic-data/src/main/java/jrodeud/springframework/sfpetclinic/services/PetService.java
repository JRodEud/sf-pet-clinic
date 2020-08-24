package jrodeud.springframework.sfpetclinic.services;


import jrodeud.springframework.sfpetclinic.model.Pet;

import java.util.Set;

public interface PetService {
    Pet findBy(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
