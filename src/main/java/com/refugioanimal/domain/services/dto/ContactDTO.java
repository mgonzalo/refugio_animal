/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

/**
 * @author Administrator
 */
public class ContactDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7593820338087533580L;

	@NotBlank(message = "Ingrese el nombre.")
	@Size(min = 1, max = 255)
	private String contactName;
	@NotBlank(message = "Ingrese el email.")
	@Email(message = "El email insgresado no es un email valido.")
	@Size(min = 1, max = 255)
	private String contactEmail;
	@NotBlank(message = "Ingrese el asunto.")
	@Size(min = 1, max = 255)
	private String contactSubject;
	@NotBlank(message = "Ingrese el mensaje.")
	@Size(min = 1, max = 500)
	private String contactMesagge;

	/**
	 * default constructor for class.
	 */
	public ContactDTO() {
		super();
	}

	/**
	 * Constructor for class
	 * 
	 * @param contactName
	 * @param contactEamil
	 * @param contactSubject
	 * @param contactMesagge
	 */
	public ContactDTO(String contactName, String contactEmail, String contactSubject, String contactMesagge) {
		super();
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactSubject = contactSubject;
		this.contactMesagge = contactMesagge;
	}

	/**
	 * @return the contactName
	 */
	public String getContactName() {
		return contactName;
	}

	/**
	 * @param contactName the contactName to set
	 */
	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	/**
	 * @return the contactEmail
	 */
	public String getContactEmail() {
		return contactEmail;
	}

	/**
	 * @param contactEmail the contactEmail to set
	 */
	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	/**
	 * @return the contactSubject
	 */
	public String getContactSubject() {
		return contactSubject;
	}

	/**
	 * @param contactSubject the contactSubject to set
	 */
	public void setContactSubject(String contactSubject) {
		this.contactSubject = contactSubject;
	}

	/**
	 * @return the contactMesagge
	 */
	public String getContactMesagge() {
		return contactMesagge;
	}

	/**
	 * @param contactMesagge the contactMesagge to set
	 */
	public void setContactMesagge(String contactMesagge) {
		this.contactMesagge = contactMesagge;
	}

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ContactDTO [contactName=" + contactName + ", contactEamil=" + contactEmail + ", contactSubject=" + contactSubject + ", contactMesagge=" + contactMesagge + "]";
	}

}
