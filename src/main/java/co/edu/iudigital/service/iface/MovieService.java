package co.edu.iudigital.service.iface;

import java.util.List;

import co.edu.iudigital.model.entity.Movie;

public interface MovieService {
	
	/**
	 * obtener todas las peliculas
	 * @return
	 */
	public List<Movie> getAll();
	
	/**
	 * crear una pelicula
	 * @param movie
	 */
	public void create (Movie movie);
	
	/**
	 * edita una pelicula por su Id
	 * @param movie
	 * @param movieId
	 */
	public void edit(Movie movie, int movieId);
	
	/**
	 * borra una pelicula por su Id
	 * @param movieId
	 */
	public void delete(int movieId);
	
	/**
	 * califica una pelicula
	 * @param movie
	 * @param movieId
	 */
	public void rate(Movie movie, int movieId);

}
