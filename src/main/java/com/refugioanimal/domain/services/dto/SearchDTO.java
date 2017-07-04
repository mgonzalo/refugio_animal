/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class SearchDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3777551200822681889L;

	private Long petType;
	private Long sizeType;
	private Long age;
	private String sex;
	private String breed;// raza
	private Boolean castrated;
	private Boolean vaccinate;
	private Long provinceId;
	private Long locationId;

	/**
	 * default constructor for class.
	 */
	public SearchDTO() {
		super();
	}

	/**
	 * constructor for class.
	 * 
	 * @param petType
	 * @param sizeType
	 * @param age
	 * @param sex
	 * @param breed
	 * @param castrated
	 * @param vaccinate
	 * @param provinceId
	 * @param locationId
	 */
	public SearchDTO(Long petType, Long sizeType, Long age, String sex, String breed, Boolean castrated, Boolean vaccinate, Long provinceId, Long locationId) {
		super();
		this.petType = petType;
		this.sizeType = sizeType;
		this.age = age;
		this.sex = sex;
		this.breed = breed;
		this.castrated = castrated;
		this.vaccinate = vaccinate;
		this.provinceId = provinceId;
		this.locationId = locationId;
	}

	/**
	 * @return the petType
	 */
	public Long getPetType() {
		return petType;
	}

	/**
	 * @param petType the petType to set
	 */
	public void setPetType(Long petType) {
		this.petType = petType;
	}

	/**
	 * @return the sizeType
	 */
	public Long getSizeType() {
		return sizeType;
	}

	/**
	 * @param sizeType the sizeType to set
	 */
	public void setSizeType(Long sizeType) {
		this.sizeType = sizeType;
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
	public String getSex() {
		return sex;
	}

	/**
	 * @param sex the sex to set
	 */
	public void setSex(String sex) {
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
	 * @return the vaccinate
	 */
	public Boolean getVaccinate() {
		return vaccinate;
	}

	/**
	 * @param vaccinate the vaccinate to set
	 */
	public void setVaccinate(Boolean vaccinate) {
		this.vaccinate = vaccinate;
	}

	/**
	 * @return the provinceId
	 */
	public Long getProvinceId() {
		return provinceId;
	}

	/**
	 * @param provinceId the provinceId to set
	 */
	public void setProvinceId(Long provinceId) {
		this.provinceId = provinceId;
	}

	/**
	 * @return the locationId
	 */
	public Long getLocationId() {
		return locationId;
	}

	/**
	 * @param locationId the locationId to set
	 */
	public void setLocationId(Long locationId) {
		this.locationId = locationId;
	}

}
