/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class SpecieTypeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -397582809710300018L;
	private Long id;
	private String description;

	/**
	 * defualt constructor for class.
	 */
	public SpecieTypeDTO() {
		super();
	}

	/**
	 * @param id
	 * @param description
	 */
	public SpecieTypeDTO(Long id, String description) {
		super();
		this.id = id;
		this.description = description;
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
