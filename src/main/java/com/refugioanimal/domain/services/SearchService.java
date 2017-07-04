/**
 * 
 */
package com.refugioanimal.domain.services;

import java.util.List;

import com.refugioanimal.domain.services.dto.PetDTO;
import com.refugioanimal.domain.services.dto.SearchDTO;

/**
 * @author Administrator
 *
 */
public interface SearchService {

	/**
	 * Search pets by PetDTO.
	 * 
	 * @param searchDTO
	 * @return List<PetDTO>
	 */
	List<PetDTO> searchPets(SearchDTO searchDTO);

}
