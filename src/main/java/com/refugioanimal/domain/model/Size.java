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
@Table(name = "TAMANIO")
public class Size {

	@Id
	@Column(name = "idTamanio", unique = true, nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(name = "descripcion", nullable = false, length = 300)
	private String description;

	/**
	 * default constructor for class.
	 */
	public Size() {
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
