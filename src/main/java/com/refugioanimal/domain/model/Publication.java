/**
 * 
 */
package com.refugioanimal.domain.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

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
@Table(name = "PUBLICACION")
public class Publication {

	@Id
	@Column(name = "idPublicacion", unique = true, nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@OneToOne(cascade = ALL)
	@JoinColumn(name = "idUsuario", nullable = false)
	private User user;

	@OneToOne(cascade = ALL)
	@JoinColumn(name = "idMascota", unique = true, nullable = false)
	private Pet pet;

	@Column(name = "fechaInicio", nullable = false)
	private Date startDate;

	@Column(name = "fechaFin", nullable = true)
	private Date endDate;

	@Column(name = "activo", nullable = true)
	private Boolean active;

	/**
	 * default constructor for class.
	 */
	public Publication() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param user
	 * @param pet
	 * @param startDate
	 * @param endDate
	 * @param active
	 */
	public Publication(User user, Pet pet, Date startDate, Date endDate, Boolean active) {
		super();
		this.user = user;
		this.pet = pet;
		this.startDate = startDate;
		this.endDate = endDate;
		this.active = active;
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
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the pet
	 */
	public Pet getPet() {
		return pet;
	}

	/**
	 * @param pet the pet to set
	 */
	public void setPet(Pet pet) {
		this.pet = pet;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the active
	 */
	public Boolean getActive() {
		return active;
	}

	/**
	 * @param active the active to set
	 */
	public void setActive(Boolean active) {
		this.active = active;
	}

}
