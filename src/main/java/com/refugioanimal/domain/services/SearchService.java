/**
 * 
 */
package com.refugioanimal.domain.services;

import java.util.List;

import com.refugioanimal.domain.services.dto.PublicationDTO;
import com.refugioanimal.domain.services.dto.SearchDTO;

/**
 * @author Administrator
 */
public interface SearchService {

	/**
	 * Search publications by SearchDTO.
	 * 
	 * @param searchDTO
	 * @return List<PublicationDTO>
	 */
	List<PublicationDTO> searchPublications(SearchDTO searchDTO);

}
