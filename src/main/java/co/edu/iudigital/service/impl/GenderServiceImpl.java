package co.edu.iudigital.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.edu.iudigital.model.entity.Gender;
import co.edu.iudigital.model.repository.GenderRepository;
import co.edu.iudigital.service.iface.GenderService;

@Service
public class GenderServiceImpl implements GenderService{

	@Autowired
	private GenderRepository genderRepository;
	
	@Override
	public List<Gender> getAll() {
		List<Gender> genders = new ArrayList<>();
		genders = (List<Gender>) genderRepository.findAll();
		return genders;
		
}
}
