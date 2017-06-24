/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;

/**
 * @author Administrator
 */
public class AboutUsDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1520343367683816422L;
	private String aboutUsDescription;

	/**
	 * defualt constructo for class.
	 */
	public AboutUsDataDTO() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param aboutUsDescription
	 */
	public AboutUsDataDTO(String aboutUsDescription) {
		this.aboutUsDescription = aboutUsDescription;
	}

	/**
	 * @return the aboutUsDescription
	 */
	public String getAboutUsDescription() {
		return aboutUsDescription;
	}

}
