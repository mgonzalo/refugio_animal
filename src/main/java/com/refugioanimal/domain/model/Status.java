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
@Table(name = "ESTADO")
public class Status {

	@Id
	@Column(name = "idEstado", nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(name = "descripcion", nullable = true, length = 150)
	private String description;

	/**
	 * default constructor for class.
	 */
	public Status() {
		super();
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

}
