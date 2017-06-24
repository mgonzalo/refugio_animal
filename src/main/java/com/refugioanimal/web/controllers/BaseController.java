/**
 * 
 */
package com.refugioanimal.web.controllers;

import org.springframework.beans.factory.annotation.Autowired;

import com.refugioanimal.domain.services.CommonService;
import com.refugioanimal.domain.services.dto.CommonDataDTO;

/**
 * @author Administrator
 *
 */
public abstract class BaseController {

	@Autowired
	CommonService commonService;
	
	/**
	 * Get common data.
	 * 
	 * @return CommonDataDTO
	 */
	public CommonDataDTO getCommonData(){
		return commonService.getCommonData();
	}

}
