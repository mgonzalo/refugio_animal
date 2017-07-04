/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.refugioanimal.domain.services.UserService;
import com.refugioanimal.domain.services.dto.LocationDTO;
import com.refugioanimal.domain.services.dto.ProvinceDTO;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {


	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.services.UserService#getAllProvincesByCountry()
	 */
	@Override
	public List<ProvinceDTO> getAllProvincesByCountry() {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.services.UserService#getAllLocationsByProvinceId(java.lang.Long)
	 */
	@Override
	public List<LocationDTO> getAllLocationsByProvinceId(Long provinceId) {
		// TODO Auto-generated method stub
		return null;
	}

}
