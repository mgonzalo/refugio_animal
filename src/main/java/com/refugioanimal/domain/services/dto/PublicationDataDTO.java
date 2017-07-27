/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class PublicationDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3570558108905809455L;
	/* datos dueño */
	private String ownerName;
	private String ownerEmail;
	private String ownerPhone;
	private String ownerProvince;
	private String ownerCity;
	private String ownerStreet;
	/* datos dueño */

	/* datos mascota */
	private String petPetType;
	private String petName;
	private String petAge;
	private String petSex;
	private String petSize;
	private String petBreed;
	private Boolean petCastrated;
	private Boolean petVaccinate;
	private Boolean petCompatibilityWithOtherAnimals;
	private Boolean petSpecialCare;
	private String petDescription;
	/* datos mascota */

	/**
	 * constructor for class.
	 */
	public PublicationDataDTO() {
		super();
	}

	/**
	 * @param ownerName
	 * @param ownerEmail
	 * @param ownerPhone
	 * @param ownerProvince
	 * @param ownerCity
	 * @param ownerStreet
	 * @param petPetType
	 * @param petName
	 * @param petAge
	 * @param petSex
	 * @param petSize
	 * @param petBreed
	 * @param petCastrated
	 * @param petVaccinate
	 * @param petCompatibilityWithOtherAnimals
	 * @param petSpecialCare
	 * @param petDescription
	 */
	public PublicationDataDTO(String ownerName, String ownerEmail, String ownerPhone, String ownerProvince, String ownerCity, String ownerStreet, String petPetType, String petName, String petAge, String petSex, String petSize, String petBreed,
			Boolean petCastrated, Boolean petVaccinate, Boolean petCompatibilityWithOtherAnimals, Boolean petSpecialCare, String petDescription) {
		super();
		this.ownerName = ownerName;
		this.ownerEmail = ownerEmail;
		this.ownerPhone = ownerPhone;
		this.ownerProvince = ownerProvince;
		this.ownerCity = ownerCity;
		this.ownerStreet = ownerStreet;
		this.petPetType = petPetType;
		this.petName = petName;
		this.petAge = petAge;
		this.petSex = petSex;
		this.petSize = petSize;
		this.petBreed = petBreed;
		this.petCastrated = petCastrated;
		this.petVaccinate = petVaccinate;
		this.petCompatibilityWithOtherAnimals = petCompatibilityWithOtherAnimals;
		this.petSpecialCare = petSpecialCare;
		this.petDescription = petDescription;
	}

	/**
	 * @return the ownerName
	 */
	public String getOwnerName() {
		return ownerName;
	}

	/**
	 * @param ownerName the ownerName to set
	 */
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	/**
	 * @return the ownerEmail
	 */
	public String getOwnerEmail() {
		return ownerEmail;
	}

	/**
	 * @param ownerEmail the ownerEmail to set
	 */
	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	/**
	 * @return the ownerPhone
	 */
	public String getOwnerPhone() {
		return ownerPhone;
	}

	/**
	 * @param ownerPhone the ownerPhone to set
	 */
	public void setOwnerPhone(String ownerPhone) {
		this.ownerPhone = ownerPhone;
	}

	/**
	 * @return the ownerProvince
	 */
	public String getOwnerProvince() {
		return ownerProvince;
	}

	/**
	 * @param ownerProvince the ownerProvince to set
	 */
	public void setOwnerProvince(String ownerProvince) {
		this.ownerProvince = ownerProvince;
	}

	/**
	 * @return the ownerCity
	 */
	public String getOwnerCity() {
		return ownerCity;
	}

	/**
	 * @param ownerCity the ownerCity to set
	 */
	public void setOwnerCity(String ownerCity) {
		this.ownerCity = ownerCity;
	}

	/**
	 * @return the ownerStreet
	 */
	public String getOwnerStreet() {
		return ownerStreet;
	}

	/**
	 * @param ownerStreet the ownerStreet to set
	 */
	public void setOwnerStreet(String ownerStreet) {
		this.ownerStreet = ownerStreet;
	}

	/**
	 * @return the petPetType
	 */
	public String getPetPetType() {
		return petPetType;
	}

	/**
	 * @param petPetType the petPetType to set
	 */
	public void setPetPetType(String petPetType) {
		this.petPetType = petPetType;
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
	 * @return the petCastrated
	 */
	public Boolean getPetCastrated() {
		return petCastrated;
	}

	/**
	 * @param petCastrated the petCastrated to set
	 */
	public void setPetCastrated(Boolean petCastrated) {
		this.petCastrated = petCastrated;
	}

	/**
	 * @return the petVaccinate
	 */
	public Boolean getPetVaccinate() {
		return petVaccinate;
	}

	/**
	 * @param petVaccinate the petVaccinate to set
	 */
	public void setPetVaccinate(Boolean petVaccinate) {
		this.petVaccinate = petVaccinate;
	}

	/**
	 * @return the petCompatibilityWithOtherAnimals
	 */
	public Boolean getPetCompatibilityWithOtherAnimals() {
		return petCompatibilityWithOtherAnimals;
	}

	/**
	 * @param petCompatibilityWithOtherAnimals the petCompatibilityWithOtherAnimals to set
	 */
	public void setPetCompatibilityWithOtherAnimals(Boolean petCompatibilityWithOtherAnimals) {
		this.petCompatibilityWithOtherAnimals = petCompatibilityWithOtherAnimals;
	}

	/**
	 * @return the petSpecialCare
	 */
	public Boolean getPetSpecialCare() {
		return petSpecialCare;
	}

	/**
	 * @param petSpecialCare the petSpecialCare to set
	 */
	public void setPetSpecialCare(Boolean petSpecialCare) {
		this.petSpecialCare = petSpecialCare;
	}

	/**
	 * @return the petDescription
	 */
	public String getPetDescription() {
		return petDescription;
	}

	/**
	 * @param petDescription the petDescription to set
	 */
	public void setPetDescription(String petDescription) {
		this.petDescription = petDescription;
	}

}
