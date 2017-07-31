/**
 * 
 */
package com.refugioanimal.domain.model;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 */
@Entity
@Table(name = "CONTACTO")
public class Contact {

	@Id
	@Column(name = "idContacto", unique = true, nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(name = "nombreContacto", nullable = false, length = 255)
	private String contactName;

	@Column(name = "emailContacto", nullable = false, length = 255)
	private String contactEmail;

	@Column(name = "asuntoContacto", nullable = false, length = 255)
	private String contactSubject;

	@Column(name = "mensajeContacto", nullable = false, length = 500)
	private String contactMesajge;

	@Column(name = "fecha", nullable = false)
	private Date contactDate;

	/**
	 * default constructor for class.
	 */
	public Contact() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param contactName
	 * @param contactEmail
	 * @param contactSubject
	 * @param contactMesajge
	 * @param contactDate
	 */
	public Contact(String contactName, String contactEmail, String contactSubject, String contactMesajge, Date contactDate) {
		super();
		this.contactName = contactName;
		this.contactEmail = contactEmail;
		this.contactSubject = contactSubject;
		this.contactMesajge = contactMesajge;
		this.contactDate = contactDate;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
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
	 * @return the contactMesajge
	 */
	public String getContactMesajge() {
		return contactMesajge;
	}

	/**
	 * @param contactMesajge the contactMesajge to set
	 */
	public void setContactMesajge(String contactMesajge) {
		this.contactMesajge = contactMesajge;
	}

	/**
	 * @return the contactDate
	 */
	public Date getContactDate() {
		return contactDate;
	}

	/**
	 * @param contactDate the contactDate to set
	 */
	public void setContactDate(Date contactDate) {
		this.contactDate = contactDate;
	}

}
