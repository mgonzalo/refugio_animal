/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import java.util.List;

import com.refugioanimal.domain.enums.CountryEnum;
import com.refugioanimal.domain.model.Province;

/**
 * @author Administrator
 */
public interface ProvinceDAO {

	/**
	 * Get all province ny country
	 * 
	 * @param argentina
	 * @return List<Province>
	 */
	List<Province> getAllProvincesByCountry(CountryEnum argentina);

}
