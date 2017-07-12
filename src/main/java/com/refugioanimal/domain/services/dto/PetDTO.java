/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

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
	@NotNull(message = "Debe seleccionar algun tipo de mascota.")
	private Long petType;
	// like mammal, reptile, fish. etc.
	@NotNull(message = "Debe seleccionar un tipo de especie.")
	private Long specieType;
	@NotBlank(message = "Ingrese el nombre de la mascota.")
	@Size(min = 1, max = 149)
	private String name;
	@NotNull(message = "Debe seleccionar una edad.")
	private Float age;
	@NotNull(message = "Debe especificar el sexo de la mascota.")
	private String sex;
	@Size(max = 150)
	private String breed;// raza
	@NotNull(message = "Debe seleccionar el tamaño de la mascota.")
	private Long sizeType;
	private Boolean castrated;
	private Boolean vaccinate;
	private Boolean compatibilityWithOtherAnimals;
	private Boolean specialCare;
	@Size(max = 950)
	private String description;
	@NotNull(message = "Ingrese los datos del dueño.")
	private UserDTO userDTO;

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
	 * @param sizeType
	 * @param age
	 * @param castrated
	 * @param vaccinate
	 * @param compatibilityWithOtherAnimals
	 * @param specialCare
	 * @param description
	 * @param user
	 */
	public PetDTO(Long petID, Long petType, Long specieType, String name, String sex, String breed, Long sizeType, Float age, Boolean castrated, Boolean vaccinate, Boolean compatibilityWithOtherAnimals, Boolean specialCare, String description,
			UserDTO user) {
		super();
		this.petID = petID;
		this.petType = petType;
		this.specieType = specieType;
		this.name = name;
		this.sex = sex;
		this.breed = breed;
		this.sizeType = sizeType;
		this.age = age;
		this.castrated = castrated;
		this.vaccinate = vaccinate;
		this.compatibilityWithOtherAnimals = compatibilityWithOtherAnimals;
		this.specialCare = specialCare;
		this.description = description;
		this.userDTO = user;
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
	 * @return the sizeType
	 */
	public Long getSizeType() {
		return sizeType;
	}

	/**
	 * @return the age
	 */
	public Float getAge() {
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

	/**
	 * @return the userDTO
	 */
	public UserDTO getUserDTO() {
		return userDTO;
	}

	/**
	 * @param petID the petID to set
	 */
	public void setPetID(Long petID) {
		this.petID = petID;
	}

	/**
	 * @param petType the petType to set
	 */
	public void setPetType(Long petType) {
		this.petType = petType;
	}

	/**
	 * @param specieType the specieType to set
	 */
	public void setSpecieType(Long specieType) {
		this.specieType = specieType;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Float age) {
		this.age = age;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
		this.sex = sex;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @param size the sizeType to set
	 */
	public void setsizeType(Long size) {
		this.sizeType = size;
	}

	/**
	 * @param castrated the castrated to set
	 */
	public void setCastrated(Boolean castrated) {
		this.castrated = castrated;
	}

	/**
	 * @param vaccinate the vaccinate to set
	 */
	public void setVaccinate(Boolean vaccinate) {
		this.vaccinate = vaccinate;
	}

	/**
	 * @param compatibilityWithOtherAnimals the compatibilityWithOtherAnimals to set
	 */
	public void setCompatibilityWithOtherAnimals(Boolean compatibilityWithOtherAnimals) {
		this.compatibilityWithOtherAnimals = compatibilityWithOtherAnimals;
	}

	/**
	 * @param specialCare the specialCare to set
	 */
	public void setSpecialCare(Boolean specialCare) {
		this.specialCare = specialCare;
	}

	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @param userDTO the userDTO to set
	 */
	public void setUserDTO(UserDTO userDTO) {
		this.userDTO = userDTO;
	}

}
