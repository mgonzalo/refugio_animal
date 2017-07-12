/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.refugioanimal.domain.model.PetType;
import com.refugioanimal.domain.services.dto.PetTypeDTO;

/**
 * @author Administrator
 */
public class PetTypeWrapper {

	/**
	 * Create List<PetTypeDTO> object from List<PetType>.
	 * 
	 * @param petTypes
	 * @return List<PetTypeDTO>
	 */
	public static List<PetTypeDTO> toPetTypeDTO(List<PetType> petTypes) {
		List<PetTypeDTO> petTypeDTOs = new ArrayList<PetTypeDTO>();
		for (PetType petType : petTypes) {
			petTypeDTOs.add(new PetTypeDTO(petType.getId(), petType.getDescription()));
		}
		return petTypeDTOs;
	}

}
