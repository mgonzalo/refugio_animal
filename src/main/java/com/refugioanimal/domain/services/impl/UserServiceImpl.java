/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import static com.refugioanimal.domain.enums.CountryEnum.ARGENTINA;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refugioanimal.domain.model.Province;
import com.refugioanimal.domain.repositories.dao.LocationDAO;
import com.refugioanimal.domain.repositories.dao.ProvinceDAO;
import com.refugioanimal.domain.services.UserService;
import com.refugioanimal.domain.services.dto.LocationDTO;
import com.refugioanimal.domain.services.dto.ProvinceDTO;
import com.refugioanimal.domain.wrappers.UserWrapper;

/**
 * @author Administrator
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	ProvinceDAO provinceDao;
	
	@Autowired
	LocationDAO locationDao;
	
	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.services.UserService#getAllProvincesByCountry()
	 */
	@Override
	public List<ProvinceDTO> getAllProvincesByCountry() {
		List<Province> provinces = provinceDao.getAllProvincesByCountry(ARGENTINA);
		return UserWrapper.toProvincesDTO(provinces);
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
