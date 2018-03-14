package krzysiek.olejnik.katalogue.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import krzysiek.olejnik.katalogue.validator.UniqueEmail;
import krzysiek.olejnik.katalogue.validator.UniqueUsername;
import krzysiek.olejnik.katalogue.validator.UserFirstName;
import krzysiek.olejnik.katalogue.validator.UserLastName;

@Entity
@Table(name = "user")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@UserFirstName
	private String firstName;
	@UserLastName
	private String lastName;
	@NotBlank
	@UniqueUsername
	private String username;
	@Size(min = 3)
	private String password;
	@NotBlank
	@UniqueEmail
	private String email;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}

}
