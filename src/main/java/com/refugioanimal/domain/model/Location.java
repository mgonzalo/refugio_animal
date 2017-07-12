/**
 * 
 */
package com.refugioanimal.domain.model;

import static javax.persistence.FetchType.LAZY;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * @author Administrator
 */
@Entity
@Table(name = "LOCALIDAD")
public class Location {

	@Id
	@Column(name = "idLocalidad", unique = true, nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@ManyToOne(fetch = LAZY)
	@JoinColumn(name = "idProvincia", unique = false, nullable = false)
	private Province province;

	@Column(name = "Nombre", unique = true, nullable = false)
	private String locationName;

	/**
	 * defualt constructor for class.
	 */
	public Location() {
		super();
	}

	/**
	 * @param id
	 * @param province
	 * @param locationName
	 */
	public Location(Long id, Province province, String locationName) {
		super();
		this.id = id;
		this.province = province;
		this.locationName = locationName;
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
	 * @return the locationName
	 */
	public String getLocationName() {
		return locationName;
	}

	/**
	 * @param locationName the locationName to set
	 */
	public void setLocationName(String locationName) {
		this.locationName = locationName;
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

}
