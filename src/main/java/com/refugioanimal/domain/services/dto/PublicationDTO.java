/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class PublicationDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5645285509642629201L;
	private Long publicationId;
	private Long petId;
	private String petName;
	private String petAge;
	private String petSex;
	private String petSize;
	private String petBreed;
	private String ubicacion;

	/**
	 * default constructor for class.
	 */
	public PublicationDTO() {
		super();
	}

	/**
	 * constructor for class.
	 * 
	 * @param publicationId
	 * @param petId
	 * @param petName
	 * @param petAge
	 * @param petSex
	 * @param petSize
	 * @param petBreed
	 * @param ubicacion
	 */
	public PublicationDTO(Long publicationId, Long petId, String petName, String petAge, String petSex, String petSize, String petBreed, String ubicacion) {
		super();
		this.publicationId = publicationId;
		this.petId = petId;
		this.petName = petName;
		this.petAge = petAge;
		this.petSex = petSex;
		this.petSize = petSize;
		this.petBreed = petBreed;
		this.ubicacion = ubicacion;
	}

	/**
	 * @return the publicationId
	 */
	public Long getPublicationId() {
		return publicationId;
	}

	/**
	 * @param publicationId the publicationId to set
	 */
	public void setPublicationId(Long publicationId) {
		this.publicationId = publicationId;
	}

	/**
	 * @return the petId
	 */
	public Long getPetId() {
		return petId;
	}

	/**
	 * @param petId the petId to set
	 */
	public void setPetId(Long petId) {
		this.petId = petId;
	}

	/**
	 * @return the petName
	 */
	public String getPetName() {
		return petName;
	}

	/**
	 * @param petName the petName to set
	 */
	public void setPetName(String petName) {
		this.petName = petName;
	}

	/**
	 * @return the petAge
	 */
	public String getPetAge() {
		return petAge;
	}

	/**
	 * @param petAge the petAge to set
	 */
	public void setPetAge(String petAge) {
		this.petAge = petAge;
	}

	/**
	 * @return the petSex
	 */
	public String getPetSex() {
		return petSex;
	}

	/**
	 * @param petSex the petSex to set
	 */
	public void setPetSex(String petSex) {
		this.petSex = petSex;
	}

	/**
	 * @return the petBreed
	 */
	public String getPetBreed() {
		return petBreed;
	}

	/**
	 * @param petBreed the petBreed to set
	 */
	public void setPetBreed(String petBreed) {
		this.petBreed = petBreed;
	}

	/**
	 * @return the ubicacion
	 */
	public String getUbicacion() {
		return ubicacion;
	}

	/**
	 * @param ubicacion the ubicacion to set
	 */
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	/**
	 * @return the petSize
	 */
	public String getPetSize() {
		return petSize;
	}

	/**
	 * @param petSize the petSize to set
	 */
	public void setPetSize(String petSize) {
		this.petSize = petSize;
	}

}
