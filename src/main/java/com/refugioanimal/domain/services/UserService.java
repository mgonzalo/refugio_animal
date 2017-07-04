/**
 * 
 */
package com.refugioanimal.domain.services;

import java.util.List;

import com.refugioanimal.domain.services.dto.LocationDTO;
import com.refugioanimal.domain.services.dto.ProvinceDTO;

/**
 * @author Administrator
 */
public interface UserService {

	/**
	 * Get all Provinces by country
	 * 
	 * @return List<ProvinceDTO>
	 */
	List<ProvinceDTO> getAllProvincesByCountry();

	/**
	 * Get all locations by province id.
	 * 
	 * @param provinceId
	 * @return List<LocationDTO>
	 */
	List<LocationDTO> getAllLocationsByProvinceId(Long provinceId);

}
