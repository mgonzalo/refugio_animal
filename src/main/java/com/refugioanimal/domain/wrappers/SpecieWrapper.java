/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.refugioanimal.domain.model.Species;
import com.refugioanimal.domain.services.dto.SpecieTypeDTO;

/**
 * @author Administrator
 */
public class SpecieWrapper {

	/**
	 * @param species
	 * @return
	 */
	public static List<SpecieTypeDTO> toSpecieTypeDTO(List<Species> species) {
		List<SpecieTypeDTO> specieTypeDTOs = new ArrayList<SpecieTypeDTO>();
		for (Species specie : species) {
			specieTypeDTOs.add(new SpecieTypeDTO(specie.getId(), specie.getDescription()));
		}
		return specieTypeDTOs;
	}

}
