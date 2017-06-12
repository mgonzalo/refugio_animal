/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class PetDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8886856447308376670L;

	private Long petID;
	// like, cat,dog, rabbit, hamster. etc.
	private Long petType;
	// like mammal, reptile, fish. etc.
	private Long specieType;
	private String name;
	private String sex;
	private String breed;// raza
	private Long size;
	private Long age;
	private Boolean castrated;
	private Boolean vaccinate;
	private Boolean compatibilityWithOtherAnimals;
	private Boolean specialCare;
	private String description;

	/**
	 * default constructor for class.
	 */
	public PetDTO() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param petID
	 * @param petType
	 * @param specieType
	 * @param name
	 * @param sex
	 * @param breed
	 * @param size
	 * @param age
	 * @param castrated
	 * @param vaccinate
	 * @param compatibilityWithOtherAnimals
	 * @param specialCare
	 * @param description
	 */
	public PetDTO(Long petID, Long petType, Long specieType, String name, String sex, String breed, Long size, Long age, Boolean castrated, Boolean vaccinate, Boolean compatibilityWithOtherAnimals, Boolean specialCare, String description) {
		super();
		this.petID = petID;
		this.petType = petType;
		this.specieType = specieType;
		this.name = name;
		this.sex = sex;
		this.breed = breed;
		this.size = size;
		this.age = age;
		this.castrated = castrated;
		this.vaccinate = vaccinate;
		this.compatibilityWithOtherAnimals = compatibilityWithOtherAnimals;
		this.specialCare = specialCare;
		this.description = description;
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

	/**
	 * @return the sex
	 */
	public String getSex() {
		return sex;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @return the size
	 */
	public Long getSize() {
		return size;
	}

	/**
	 * @return the age
	 */
	public Long getAge() {
		return age;
	}

	/**
	 * @return the castrated
	 */
	public Boolean getCastrated() {
		return castrated;
	}

	/**
	 * @return the vaccinate
	 */
	public Boolean getVaccinate() {
		return vaccinate;
	}

	/**
	 * @return the compatibilityWithOtherAnimals
	 */
	public Boolean getCompatibilityWithOtherAnimals() {
		return compatibilityWithOtherAnimals;
	}

	/**
	 * @return the specialCare
	 */
	public Boolean getSpecialCare() {
		return specialCare;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

}
