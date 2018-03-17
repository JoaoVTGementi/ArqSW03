package br.usjt.arqsw.entity;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

/**
 * 
 * @author João Victor Telles Gementi 81616650  14/03/2017
 *
 */

@Entity
public class Login implements Serializable{

	private static final long serialVersionUID = 1L;

	public static final String LOGADO = "logado";
	
		@NotNull
		private String username;
	
		@NotNull
		private String password;
	
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
	
	
	@Override
	public String toString() {
		return "Login [username=" + username+ ", password=" + password + "]";
	}
}
