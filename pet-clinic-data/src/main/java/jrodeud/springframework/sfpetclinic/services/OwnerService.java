package jrodeud.springframework.sfpetclinic.services;

import jrodeud.springframework.sfpetclinic.model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findBy(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}
