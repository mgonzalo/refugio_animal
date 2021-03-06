 /**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class LastPetPublishDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4050009125367886056L;

	private Long petID;
	// like, cat,dog, rabbit, hamster. etc.
	private Long petType;
	// like mammal, reptile, fish. etc.
	private Long specieType;
	private String name;

	/**
	 * defualt constructor for class.
	 */
	public LastPetPublishDTO() {
		super();
	}

	/**
	 * constructor for class.
	 * 
	 * @param petID
	 * @param petType
	 * @param specieType
	 * @param name
	 */
	public LastPetPublishDTO(Long petID, Long petType, Long specieType, String name) {
		super();
		this.petID = petID;
		this.petType = petType;
		this.specieType = specieType;
		this.name = name;
	}

	/**
	 * @return the petID
	 */
	public Long getPetID() {
		return petID;
	}

	/**
	 * @return the petType
	 */
	public Long getPetType() {
		return petType;
	}

	/**
	 * @return the specieType
	 */
	public Long getSpecieType() {
		return specieType;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

}
