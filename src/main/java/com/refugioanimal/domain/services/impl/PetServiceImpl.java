/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import java.util.Date;

import org.springframework.stereotype.Service;

import com.refugioanimal.domain.services.PetService;
import com.refugioanimal.domain.services.dto.LastPetPublishDTO;
import com.refugioanimal.domain.services.dto.PetDTO;

/**
 * @author Administrator
 */
@Service
public class PetServiceImpl implements PetService {

//	private PetDAO petDao;

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.services.PetService#getPet(java.lang.Long)
	 */
	@Override
	public PetDTO getPet(Long petID) {
		return new PetDTO();
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.services.PetService#getLastPublishPets(java.util.Date)
	 */
	@Override
	public LastPetPublishDTO getLastPublishPets(Date today) {
		return new LastPetPublishDTO();
	}

}
