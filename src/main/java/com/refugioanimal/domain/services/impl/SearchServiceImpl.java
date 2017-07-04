/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.repositories.dao.PetDAO;
import com.refugioanimal.domain.services.SearchService;
import com.refugioanimal.domain.services.dto.PetDTO;
import com.refugioanimal.domain.services.dto.SearchDTO;
import com.refugioanimal.domain.wrappers.PetWrapper;

/**
 * @author Administrator
 */
@Service
public class SearchServiceImpl implements SearchService {

	@Autowired
	private PetDAO petDao;

	// private PublicationDAO publicationDao;

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.services.SearchService#searchPets(com.refugioanimal.domain.services.
	 * dto.SearchDTO)
	 */
	@Override
	public List<PetDTO> searchPets(SearchDTO searchDTO) {
		List<Pet> pets = petDao.searchPets(searchDTO);
		return PetWrapper.toPetDTO(pets);
	}

}
