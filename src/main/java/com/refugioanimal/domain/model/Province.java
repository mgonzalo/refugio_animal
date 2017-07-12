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
@Table(name = "PROVINCIA")
public class Province {

	@Id
	@Column(name = "idProvincia", unique = true, nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(name = "idPais", unique = false, nullable = false)
	private Long idCountry;

	@Column(name = "Nombre", unique = true, nullable = false)
	private String provinceName;

	/**
	 * defualt constructor for class.
	 */
	public Province() {
		super();
	}

	/**
	 * constructor for class.
	 * 
	 * @param id
	 * @param idCountry
	 * @param provinceName
	 * @param location
	 */
	public Province(Long id, Long idCountry, String provinceName) {
		super();
		this.id = id;
		this.idCountry = idCountry;
		this.provinceName = provinceName;
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
	 * @return the idCountry
	 */
	public Long getIdCountry() {
		return idCountry;
	}

	/**
	 * @param idCountry the idCountry to set
	 */
	public void setIdCountry(Long idCountry) {
		this.idCountry = idCountry;
	}

	/**
	 * @return the provinceName
	 */
	public String getProvinceName() {
		return provinceName;
	}

	/**
	 * @param provinceName the provinceName to set
	 */
	public void setProvinceName(String provinceName) {
		this.provinceName = provinceName;
	}

}
