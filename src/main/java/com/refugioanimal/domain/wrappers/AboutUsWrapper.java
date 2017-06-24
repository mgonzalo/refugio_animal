/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import static org.apache.commons.lang3.StringUtils.EMPTY;

import com.refugioanimal.domain.model.AboutUs;
import com.refugioanimal.domain.services.dto.AboutUsDataDTO;

/**
 * @author Administrator
 *
 */
public class AboutUsWrapper {

	/**
	 * Create aboutUsDataDTO object with AboutUs object.
	 * 
	 * @param aboutUs
	 * @return AboutUsDataDTO
	 */
	public static AboutUsDataDTO toAboutUsDTO(AboutUs aboutUs) {
		String aboutUsDescription = aboutUs != null? aboutUs.getDescription() : EMPTY;
		return new AboutUsDataDTO(aboutUsDescription);
	}

}
