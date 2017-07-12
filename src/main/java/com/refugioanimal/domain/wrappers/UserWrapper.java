/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import static org.apache.commons.lang3.StringUtils.EMPTY;

import java.util.ArrayList;
import java.util.List;

import com.refugioanimal.domain.model.Province;
import com.refugioanimal.domain.model.User;
import com.refugioanimal.domain.services.dto.ProvinceDTO;
import com.refugioanimal.domain.services.dto.UserDTO;

/**
 * @author Administrator
 */
public class UserWrapper {

	private static final Long COUNTRY_ID_AR = 1L;

	/**
	 * Create User object from UserDTO object
	 * 
	 * @param userDTO
	 * @return User
	 */
	public static User toUser(UserDTO userDTO) {
		String[] arrName = userDTO.getName().split(" ");
		return new User(arrName[0], arrName[1], userDTO.getDocNumber().toString(), userDTO.getEmail(), userDTO.getPhone(), EMPTY, COUNTRY_ID_AR, userDTO.getProvinceId(), userDTO.getLocationId(), userDTO.getStreet(), null, EMPTY, EMPTY, EMPTY, EMPTY);
	}

	/**
	 * Get all province by countryId.
	 * 
	 * @param provinces
	 * @return List<ProvinceDTO>
	 */
	public static List<ProvinceDTO> toProvincesDTO(List<Province> provinces) {
		List<ProvinceDTO> provinceDTOs = new ArrayList<ProvinceDTO>();
		for (Province province : provinces) {
			provinceDTOs.add(new ProvinceDTO(province.getId(), province.getProvinceName()));
		}
		return provinceDTOs;
	}

}
