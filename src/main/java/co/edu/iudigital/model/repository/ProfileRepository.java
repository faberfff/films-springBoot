package co.edu.iudigital.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.model.entity.Profile;

public interface ProfileRepository extends CrudRepository<Profile, Integer> {

}
