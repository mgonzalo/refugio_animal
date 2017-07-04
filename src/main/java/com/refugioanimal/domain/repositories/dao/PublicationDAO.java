/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import com.refugioanimal.domain.exceptions.PublicationException;
import com.refugioanimal.domain.model.Publication;

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

}
