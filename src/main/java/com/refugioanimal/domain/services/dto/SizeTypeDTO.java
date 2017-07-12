/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class SizeTypeDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6218812172115337358L;

	private Long id;
	private String description;

	/**
	 * defualt constructor for class.
	 */
	public SizeTypeDTO() {
		super();
	}

	/**
	 * @param id
	 * @param description
	 */
	public SizeTypeDTO(Long id, String description) {
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

	/*
	 * (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "SizeTypeDTO [id=" + id + ", description=" + description + "]";
	}

}
