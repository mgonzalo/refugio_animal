/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class LocationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4220299447468232556L;
	private Long id;
	private String locationName;

	/**
	 * defualt construcor for class.
	 */
	public LocationDTO() {
		super();
	}

	/**
	 * @param id
	 * @param locationName
	 */
	public LocationDTO(Long id, String locationName) {
		super();
		this.id = id;
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

}
