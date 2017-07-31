/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import static org.apache.commons.lang3.StringUtils.EMPTY;

import java.util.ArrayList;
import java.util.List;

import com.refugioanimal.domain.enums.UserTypeEnum;
import com.refugioanimal.domain.model.Location;
import com.refugioanimal.domain.model.Province;
import com.refugioanimal.domain.model.User;
import com.refugioanimal.domain.services.dto.LocationDTO;
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
	public static User toUser(UserDTO userDTO, UserTypeEnum userTypeEnum, Province province, Location location) {
		String[] arrName = userDTO.getName().split(" ");
		String userName = arrName[0];
		String userLastName = arrName.length > 1? arrName[1] : EMPTY;
		return new User(userName, userLastName, userDTO.getDocNumber().toString(), userDTO.getEmail(), userDTO.getPhone(), EMPTY, COUNTRY_ID_AR, province, location, userDTO.getStreet(), Long.valueOf(userTypeEnum.ordinal()), EMPTY, EMPTY, EMPTY,
				EMPTY);
	}

	/**
	 * Create List<ProvinceDTO> object from List<Province> object
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

	/**
	 * Create List<LocationDTO> object from List<Location> object
	 * 
	 * @param locations
	 * @return
	 */
	public static List<LocationDTO> toLocationsDTO(List<Location> locations) {
		List<LocationDTO> locationDTOs = new ArrayList<LocationDTO>();
		for (Location location : locations) {
			locationDTOs.add(new LocationDTO(location.getId(), location.getLocationName()));
		}
		return locationDTOs;
	}

}
