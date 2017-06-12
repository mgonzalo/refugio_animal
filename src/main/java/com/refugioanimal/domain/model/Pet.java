/**
 * 
 */
package com.refugioanimal.domain.model;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Administrator
 */
@Entity
@Table(name = "MASCOTA")
public class Pet {

	@Id
	@Column(name = "idMascota")
	@GeneratedValue(strategy = IDENTITY)
	private Long id;

	@Column(name = "idTipoMascota")
	private Long petTypeId;

	@Column(name = "Nombre")
	private String petName;

	@Column(name = "idTamanio")
	private Long sizeId;

	@Column(name = "Edad")
	private Long age;

	@Column(name = "Sexo")
	private Boolean sex;

	@Column(name = "Raza")
	private String breed;

	@Column(name = "Castrado")
	private Boolean castrated;

	@Column(name = "Vacunado")
	private Boolean vaccinated;

	@Column(name = "Compatibilidad")
	private Boolean compatibility;

	@Column(name = "CuidadoEspecial")
	private Boolean specialCare;

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
	 * @return the petTypeId
	 */
	public Long getPetTypeId() {
		return petTypeId;
	}

	/**
	 * @param petTypeId the petTypeId to set
	 */
	public void setPetTypeId(Long petTypeId) {
		this.petTypeId = petTypeId;
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
	 * @return the sizeId
	 */
	public Long getSizeId() {
		return sizeId;
	}

	/**
	 * @param sizeId the sizeId to set
	 */
	public void setSizeId(Long sizeId) {
		this.sizeId = sizeId;
	}

	/**
	 * @return the age
	 */
	public Long getAge() {
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(Long age) {
		this.age = age;
	}

	/**
	 * @return the sex
	 */
	public Boolean getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(Boolean sex) {
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

}
