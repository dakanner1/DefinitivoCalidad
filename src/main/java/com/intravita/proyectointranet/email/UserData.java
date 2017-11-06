package com.intravita.proyectointranet.email;
/**
 * UserData- Clase en la que se apoya mailSender para enviar correos automáticos
 *
 * @author Intravita
 * @since sprint 1
 */
public class UserData {
	/** 
	   *Gestiona los datos para enviar correos a usuarios a través de 
	   * @see MailSender
	   */
	private String userName;
	private String password;
	
	
	public UserData() {
	
		this.userName = "customer.service.intravita@gmail.com";
		this.password = "customerserviceintravita1234";
		
	}
	
	//Get atributos
	public String getUserName() {
		return this.userName;
	}
	
	public String getPassword() {
		return this.password;
	}
	//Set atributos
	public void setUserName(String userName) {
		this.userName=userName;
	}

	public void setPassword(String password) {
		this.password=password;
	}
	
}
