package co.edu.iudigital.model.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "users")

public class Users implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "users_id")
	private int usersId;
	private String name;
	private String email;
	private String password;
	@Column(name = "create_at")
	private LocalDateTime createAt;
	
	//profile_Id esta en otra tabla por eso hay que crear varias notaciones una de ellas es que clase de relacion hay entre las tablas
	//en este caso la relacion es de muchos a uno, por eso se tiene que anotar de esa manera, como es una clave foranea no se puede 
	//anotar con column si no que se hace con (@joinColumn) esto quiere decir que es una clave foranea tambien se le coloca que es una
	//relacion de ManyToOne(@ManyToOne)
	@ManyToOne
	@JoinColumn(name = "profile_id")
	private Profile profileId;

	public int getUsersId() {
		return usersId;
	}

	public void setUsersId(int usersId) {
		this.usersId = usersId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public LocalDateTime getCreateAt() {
		return createAt;
	}

	public void setCreateAt(LocalDateTime createAt) {
		this.createAt = createAt;
	}

	public Profile getProfileId() {
		return profileId;
	}

	public void setProfileId(Profile profileId) {
		this.profileId = profileId;
	}
	

}
