/**
 * 
 */
package com.refugioanimal.domain.services;

import com.refugioanimal.domain.services.dto.CommonDataDTO;

/**
 * @author Administrator
 */
public interface CommonService {

	/**
	 * Get CommonData to show in the home like about us data, and events.
	 * 
	 * @return CommonDataDTO
	 */
	CommonDataDTO getCommonData();

}
