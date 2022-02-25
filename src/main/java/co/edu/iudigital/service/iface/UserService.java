package co.edu.iudigital.service.iface;

import co.edu.iudigital.model.entity.Users;

public interface UserService {
	
	/**
	 * crear nuevo usuario
	 * @param user
	 */
	
	public void create(Users user);
	
	/**
	 * se loguea un usuario
	 * @param user
	 * @return
	 * @throws Exception
	 */
	
	public Users login(Users user) throws Exception;
	
	

}
