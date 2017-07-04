/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class UserDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3020506720120968985L;

	private String name;
	private Long docNumber;
	private String email;
	private String phone;
	private Long provinceId;
	private Long locationId;
	private String street;

	/**
	 * default constructor for class.
	 */
	public UserDTO() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param name
	 * @param docNumber
	 * @param email
	 * @param phone
	 * @param provinceId
	 * @param locationId
	 * @param street
	 */
	public UserDTO(String name, Long docNumber, String email, String phone, Long provinceId, Long locationId, String street) {
		super();
		this.name = name;
		this.docNumber = docNumber;
		this.email = email;
		this.phone = phone;
		this.provinceId = provinceId;
		this.locationId = locationId;
		this.street = street;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the docNumber
	 */
	public Long getDocNumber() {
		return docNumber;
	}

	/**
	 * @param docNumber the docNumber to set
	 */
	public void setDocNumber(Long docNumber) {
		this.docNumber = docNumber;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the provinceId
	 */
	public Long getProvinceId() {
		return provinceId;
	}

	/**
	 * @param provinceId the provinceId to set
	 */
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	/**
	 * @return the locationId
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

	/**
	 * @return the street
	 */
	public String getStreet() {
		return street;
	}

	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}

}
