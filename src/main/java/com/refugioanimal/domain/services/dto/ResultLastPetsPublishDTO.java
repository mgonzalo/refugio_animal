/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 */
public class ResultLastPetsPublishDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6839324843563243343L;

	private List<LastPetPublishDTO> lastPetPublishDTOs;
	private Boolean hasDogTypePet;
	private Boolean hasCatTypePet;
	private Boolean hasOtherTypesPet;

	/**
	 * default constructor for class.
	 */
	public ResultLastPetsPublishDTO() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param lastPetPublishDTOs
	 * @param hasDogTypePet
	 * @param hasCatTypePet
	 * @param hasOtherTypesPet
	 */
	public ResultLastPetsPublishDTO(List<LastPetPublishDTO> lastPetPublishDTOs, Boolean hasDogTypePet, Boolean hasCatTypePet, Boolean hasOtherTypesPet) {
		super();
		this.lastPetPublishDTOs = lastPetPublishDTOs;
		this.hasDogTypePet = hasDogTypePet;
		this.hasCatTypePet = hasCatTypePet;
		this.hasOtherTypesPet = hasOtherTypesPet;
	}

	/**
	 * @return the lastPetPublishDTOs
	 */
	public List<LastPetPublishDTO> getLastPetPublishDTOs() {
		return lastPetPublishDTOs;
	}

	/**
	 * @param lastPetPublishDTOs the lastPetPublishDTOs to set
	 */
	public void setLastPetPublishDTOs(List<LastPetPublishDTO> lastPetPublishDTOs) {
		this.lastPetPublishDTOs = lastPetPublishDTOs;
	}

	/**
	 * @return the hasDogTypePet
	 */
	public Boolean getHasDogTypePet() {
		return hasDogTypePet;
	}

	/**
	 * @param hasDogTypePet the hasDogTypePet to set
	 */
	public void setHasDogTypePet(Boolean hasDogTypePet) {
		this.hasDogTypePet = hasDogTypePet;
	}

	/**
	 * @return the hasCatTypePet
	 */
	public Boolean getHasCatTypePet() {
		return hasCatTypePet;
	}

	/**
	 * @param hasCatTypePet the hasCatTypePet to set
	 */
	public void setHasCatTypePet(Boolean hasCatTypePet) {
		this.hasCatTypePet = hasCatTypePet;
	}

	/**
	 * @return the hasOtherTypesPet
	 */
	public Boolean getHasOtherTypesPet() {
		return hasOtherTypesPet;
	}

	/**
	 * @param hasOtherTypesPet the hasOtherTypesPet to set
	 */
	public void setHasOtherTypesPet(Boolean hasOtherTypesPet) {
		this.hasOtherTypesPet = hasOtherTypesPet;
	}

}
