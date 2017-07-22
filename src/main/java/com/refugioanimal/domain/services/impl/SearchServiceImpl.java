/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refugioanimal.domain.model.Publication;
import com.refugioanimal.domain.repositories.dao.PublicationDAO;
import com.refugioanimal.domain.services.SearchService;
import com.refugioanimal.domain.services.dto.PublicationDTO;
import com.refugioanimal.domain.services.dto.SearchDTO;
import com.refugioanimal.domain.wrappers.PublicationWrapper;

/**
 * @author Administrator
 */
@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private PublicationDAO publicationDao;

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.services.SearchService#searchPublications(com.refugioanimal.domain.
	 * services.dto.SearchDTO)
	 */
	@Override
	public List<PublicationDTO> searchPublications(SearchDTO searchDTO) {
		List<Publication> publications = publicationDao.searchPublications(searchDTO);
		return PublicationWrapper.toPublicationsDTO(publications);
	}

}
