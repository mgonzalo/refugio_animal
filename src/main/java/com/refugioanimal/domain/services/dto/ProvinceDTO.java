/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class ProvinceDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8818042037507327627L;

	private Long id;
	private String name;

	/**
	 * defualt construcor for class.
	 */
	public ProvinceDTO() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param id
	 * @param name
	 */
	public ProvinceDTO(Long id, String name) {
		super();
		this.id = id;
		this.name = name;
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

}
