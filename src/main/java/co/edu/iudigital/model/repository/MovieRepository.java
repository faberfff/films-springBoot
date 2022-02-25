package co.edu.iudigital.model.repository;

import org.springframework.data.repository.CrudRepository;

import co.edu.iudigital.model.entity.Movie;

public interface MovieRepository extends CrudRepository<Movie, Integer> {

}
