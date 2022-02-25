package co.edu.iudigital.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.model.entity.Gender;

public interface GenderRepository extends CrudRepository<Gender , Integer> {

}
