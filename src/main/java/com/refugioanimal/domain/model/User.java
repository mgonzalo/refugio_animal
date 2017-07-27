/**
 * 
 */
package com.refugioanimal.domain.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Administrator
 */
@Entity
@Table(name = "USUARIO")
public class User {

	@Id
	@Column(name = "idUsuario", unique = true, nullable = false)
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
	@Column(name = "telefono", nullable = false, length = 80)
	private String phone;
	@Column(name = "movil", nullable = true, length = 80)
	private String mobilePhone;
	@Column(name = "idPais", nullable = false)
	private Long countryId;
	@OneToOne(cascade = ALL)
	@JoinColumn(name = "idProvincia", nullable = false)
	private Province province;
	@OneToOne(cascade = ALL)
	@JoinColumn(name = "idLocalidad", nullable = false)
	private Location location;
	@Column(name = "direccion", nullable = true, length = 250)
	private String direction;
	@Column(name = "idTipoEntidad", nullable = true)
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
	 * default constructor for class.
	 */
	public User() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param name
	 * @param lastname
	 * @param dni
	 * @param email
	 * @param phone
	 * @param mobilePhone
	 * @param countryId
	 * @param province
	 * @param location
	 * @param direction
	 * @param entityTypeId
	 * @param businessName
	 * @param workingHours
	 * @param availableTime
	 * @param dedication
	 */
	public User(String name, String lastname, String dni, String email, String phone, String mobilePhone, Long countryId, Province province, Location location, String direction, Long entityTypeId, String businessName, String workingHours,
			String availableTime, String dedication) {
		super();
		this.name = name;
		this.lastname = lastname;
		this.dni = dni;
		this.email = email;
		this.phone = phone;
		this.mobilePhone = mobilePhone;
		this.countryId = countryId;
		this.province = province;
		this.location = location;
		this.direction = direction;
		this.entityTypeId = entityTypeId;
		this.businessName = businessName;
		this.workingHours = workingHours;
		this.availableTime = availableTime;
		this.dedication = dedication;
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
	 * @return the province
	 */
	public Province getProvince() {
		return province;
	}

	/**
	 * @param province the province to set
	 */
	public void setProvince(Province province) {
		this.province = province;
	}

	/**
	 * @return the location
	 */
	public Location getLocation() {
		return location;
	}

	/**
	 * @param location the location to set
	 */
	public void setLocation(Location location) {
		this.location = location;
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
