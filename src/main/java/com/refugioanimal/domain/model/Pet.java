/**
 * 
 */
package com.refugioanimal.domain.model;

import static javax.persistence.CascadeType.ALL;
import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * @author Administrator
 */
@Entity
@Table(name = "MASCOTA")
public class Pet {

	@Id
	@Column(name = "idMascota", unique = true, nullable = false)
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@OneToOne(cascade = ALL)
	@JoinColumn(name = "idTipoMascota", nullable = false)
	private PetType petType;

	@Column(name = "nombre", nullable = false, length = 150)
	private String petName;

	@OneToOne(cascade = ALL)
	@JoinColumn(name = "idTamanio", nullable = false)
	private Size size;

	@Column(name = "edad", nullable = false)
	private Float age;

	@Column(name = "sexo", nullable = false, length = 2)
	private Character sex;

	@Column(name = "raza", nullable = true, length = 150)
	private String breed;

	@Column(name = "castrado", nullable = false)
	private Boolean castrated;

	@Column(name = "vacunado", nullable = false)
	private Boolean vaccinated;

	@Column(name = "compatibilidad", nullable = false)
	private Boolean compatibility;

	@Column(name = "cuidado_especial", nullable = false)
	private Boolean specialCare;

	@Column(name = "descripcion", nullable = true, length = 1000)
	private String description;

	/**
	 * default constructor for class.
	 */
	public Pet() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param id
	 * @param petType
	 * @param petName
	 * @param size
	 * @param age
	 * @param sex
	 * @param breed
	 * @param castrated
	 * @param vaccinated
	 * @param compatibility
	 * @param specialCare
	 * @param description
	 */
	public Pet(Long id, PetType petType, String petName, Size size, Float age, Character sex, String breed, Boolean castrated, Boolean vaccinated, Boolean compatibility, Boolean specialCare, String description) {
		super();
		this.id = id;
		this.petType = petType;
		this.petName = petName;
		this.size = size;
		this.age = age;
		this.sex = sex;
		this.breed = breed;
		this.castrated = castrated;
		this.vaccinated = vaccinated;
		this.compatibility = compatibility;
		this.specialCare = specialCare;
		this.description = description;
	}

	/**
	 * Constructor for class.
	 * 
	 * @param petType
	 * @param petName
	 * @param size
	 * @param age
	 * @param sex
	 * @param breed
	 * @param castrated
	 * @param vaccinated
	 * @param compatibility
	 * @param specialCare
	 * @param description
	 */
	public Pet(PetType petType, String petName, Size size, Float age, Character sex, String breed, Boolean castrated, Boolean vaccinated, Boolean compatibility, Boolean specialCare, String description) {
		super();
		this.petType = petType;
		this.petName = petName;
		this.size = size;
		this.age = age;
		this.sex = sex;
		this.breed = breed;
		this.castrated = castrated;
		this.vaccinated = vaccinated;
		this.compatibility = compatibility;
		this.specialCare = specialCare;
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
	 * @return the petType
	 */
	public PetType getPetType() {
		return petType;
	}

	/**
	 * @param petType the petType to set
	 */
	public void setPetType(PetType petType) {
		this.petType = petType;
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
	 * @return the size
	 */
	public Size getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(Size size) {
		this.size = size;
	}

	/**
	 * @return the age
	 */
	public Float getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Float age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public Character getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(Character sex) {
		this.sex = sex;
	}

	/**
	 * @return the breed
	 */
	public String getBreed() {
		return breed;
	}

	/**
	 * @param breed the breed to set
	 */
	public void setBreed(String breed) {
		this.breed = breed;
	}

	/**
	 * @return the castrated
	 */
	public Boolean getCastrated() {
		return castrated;
	}

	/**
	 * @param castrated the castrated to set
	 */
	public void setCastrated(Boolean castrated) {
		this.castrated = castrated;
	}

	/**
	 * @return the vaccinated
	 */
	public Boolean getVaccinated() {
		return vaccinated;
	}

	/**
	 * @param vaccinated the vaccinated to set
	 */
	public void setVaccinated(Boolean vaccinated) {
		this.vaccinated = vaccinated;
	}

	/**
	 * @return the compatibility
	 */
	public Boolean getCompatibility() {
		return compatibility;
	}

	/**
	 * @param compatibility the compatibility to set
	 */
	public void setCompatibility(Boolean compatibility) {
		this.compatibility = compatibility;
	}

	/**
	 * @return the specialCare
	 */
	public Boolean getSpecialCare() {
		return specialCare;
	}

	/**
	 * @param specialCare the specialCare to set
	 */
	public void setSpecialCare(Boolean specialCare) {
		this.specialCare = specialCare;
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
