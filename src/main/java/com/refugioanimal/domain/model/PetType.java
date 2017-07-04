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
@Table(name = "TIPOMASCOTA")
public class PetType {

	@Id
	@Column(name = "idTipoMascota", unique = true, nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@OneToOne(cascade = ALL)
	@JoinColumn(name = "idEspecie")
	private Species species;

	@Column(name = "descripcion", unique = true, nullable = false, length = 500)
	private String description;

	/**
	 * default constructor for class.
	 */
	public PetType() {
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
	 * @return the species
	 */
	public Species getSpecies() {
		return species;
	}

	/**
	 * @param species the species to set
	 */
	public void setSpecies(Species species) {
		this.species = species;
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
