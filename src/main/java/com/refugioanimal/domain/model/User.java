/**
 * 
 */
package com.refugioanimal.domain.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 */
@Entity
@Table(name = "USUARIO")
public class User {

	@Id
	@Column(name = "idUsuario", nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(name = "nombre", nullable = false, length = 150)
	private String name;
	@Column(name = "apellido", nullable = false, length = 150)
	private String lastname;
	@Column(name = "dni", nullable = false)
	private String dni;
	@Column(name = "email", nullable = false, length = 150)
	private String email;
	@Column(name = "telfono", nullable = false, length = 80)
	private String phone;
	@Column(name = "movil", nullable = true, length = 80)
	private String mobilePhone;
	@Column(name = "idPais", nullable = false)
	private Long countryId;
	@Column(name = "idProvincia", nullable = false)
	private Long provinceId;
	@Column(name = "idLocalidad", nullable = false)
	private Long locationId;
	@Column(name = "direccion", nullable = true, length = 250)
	private String direction;
	@Column(name = "idTipoEntidad", nullable = false)
	private Long entityTypeId;
	@Column(name = "razon_Social", nullable = true, length = 200)
	private String businessName;
	@Column(name = "horario", nullable = true, length = 200)
	private String workingHours;
	@Column(name = "tiempo_disponible", nullable = true, length = 200)
	private String availableTime;
	@Column(name = "dedicacion", nullable = true, length = 200)
	private String dedication;

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
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
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
	 * @return the mobilePhone
	 */
	public String getMobilePhone() {
		return mobilePhone;
	}

	/**
	 * @param mobilePhone the mobilePhone to set
	 */
	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	/**
	 * @return the countryId
	 */
	public Long getCountryId() {
		return countryId;
	}

	/**
	 * @param countryId the countryId to set
	 */
	public void setCountryId(Long countryId) {
		this.countryId = countryId;
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
	 * @return the direction
	 */
	public String getDirection() {
		return direction;
	}

	/**
	 * @param direction the direction to set
	 */
	public void setDirection(String direction) {
		this.direction = direction;
	}

	/**
	 * @return the entityTypeId
	 */
	public Long getEntityTypeId() {
		return entityTypeId;
	}

	/**
	 * @param entityTypeId the entityTypeId to set
	 */
	public void setEntityTypeId(Long entityTypeId) {
		this.entityTypeId = entityTypeId;
	}

	/**
	 * @return the businessName
	 */
	public String getBusinessName() {
		return businessName;
	}

	/**
	 * @param businessName the businessName to set
	 */
	public void setBusinessName(String businessName) {
		this.businessName = businessName;
	}

	/**
	 * @return the workingHours
	 */
	public String getWorkingHours() {
		return workingHours;
	}

	/**
	 * @param workingHours the workingHours to set
	 */
	public void setWorkingHours(String workingHours) {
		this.workingHours = workingHours;
	}

	/**
	 * @return the availableTime
	 */
	public String getAvailableTime() {
		return availableTime;
	}

	/**
	 * @param availableTime the availableTime to set
	 */
	public void setAvailableTime(String availableTime) {
		this.availableTime = availableTime;
	}

	/**
	 * @return the dedication
	 */
	public String getDedication() {
		return dedication;
	}

	/**
	 * @param dedication the dedication to set
	 */
	public void setDedication(String dedication) {
		this.dedication = dedication;
	}

}
