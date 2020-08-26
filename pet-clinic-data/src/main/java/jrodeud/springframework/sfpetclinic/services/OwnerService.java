package jrodeud.springframework.sfpetclinic.services;

import jrodeud.springframework.sfpetclinic.model.Owner;


public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
