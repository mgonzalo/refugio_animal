/**
 * 
 */
package com.refugioanimal.web.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.refugioanimal.domain.services.UserService;
import com.refugioanimal.domain.services.dto.LocationDTO;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("users")
public class UserController {

	@Autowired
	UserService userservice;
	
	/**
	 * Get all petTypes by SpecieType selected.
	 * 
	 * @param specieType
	 * @return PetTypeDTO
	 */
	@RequestMapping(value = "/locations", method = GET, produces = "application/json")
	@ResponseBody
	public List<LocationDTO> getLocationsByProvinceId(@RequestParam(name = "provinceId", required = true) Long provinceId) {
		return userservice.getAllLocationsByProvinceId(provinceId);
	}

}
