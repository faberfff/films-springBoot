package co.edu.iudigital.service.iface;

import java.util.List;

import co.edu.iudigital.model.entity.Gender;

public interface GenderService {
	//lista todos los generos;
    public List<Gender> getAll();
}
