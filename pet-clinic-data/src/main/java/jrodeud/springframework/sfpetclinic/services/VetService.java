package jrodeud.springframework.sfpetclinic.services;

import jrodeud.springframework.sfpetclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findBy(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
