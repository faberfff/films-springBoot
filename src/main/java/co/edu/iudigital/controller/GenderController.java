package co.edu.iudigital.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.iudigital.model.entity.Gender;
import co.edu.iudigital.service.iface.GenderService;

//API: Application programming Int
@RestController
@RequestMapping("/gender")
@CrossOrigin("*")  //esto sirve para hacer peticiones externas, y el hasterisco quiere desir que de cualquie parte
public class GenderController {
	
	//inyeccion de dependencias desde service
	@Autowired
	
	private GenderService genderService;
	
	@GetMapping
	public List<Gender> getAll(){
		return genderService.getAll();
		
	}

}
