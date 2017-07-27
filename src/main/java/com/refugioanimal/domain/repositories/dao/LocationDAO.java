/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import java.util.List;

import com.refugioanimal.domain.model.Location;

/**
 * @author Administrator
 *
 */
public interface LocationDAO {

	/**
	 * Get all locations by provinceId.
	 * 
	 * @param provinceId
	 * @return List<Location>
	 */
	List<Location> getAllLocationsByProvince(Long provinceId);
	
	/**
	 * Get location by locationId
	 * 
	 * @param locationId
	 * @return Location
	 */
	Location getLocationByLocationId(Long locationId);

}
