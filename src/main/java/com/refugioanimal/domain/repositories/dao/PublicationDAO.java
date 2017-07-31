/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import java.util.List;

import com.refugioanimal.domain.exceptions.PublicationException;
import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.model.Publication;
import com.refugioanimal.domain.model.User;
import com.refugioanimal.domain.services.dto.SearchDTO;

/**
 * @author Administrator
 */
public interface PublicationDAO {

	/**
	 * Create Publication object with petId and userId
	 * 
	 * @param publication
	 * @return publication id
	 * @throws PublicationException
	 */
	Long createPublication(Publication publication) throws PublicationException;

	/**
	 * Search publications by searchDTO.
	 * 
	 * @param searchDTO
	 * @return List<Publication>
	 */
	List<Publication> searchPublications(SearchDTO searchDTO);

	/**
	 * Get last publications.
	 * 
	 * @return
	 */
	List<Publication> getLastPublications();

	/**
	 * Find publication by publicationId.
	 * 
	 * @param publicationId
	 * @return Publication
	 */
	Publication getPublicationById(Long publicationId);

}
