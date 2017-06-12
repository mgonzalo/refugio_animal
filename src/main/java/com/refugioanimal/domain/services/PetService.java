/**
 * 
 */
package com.refugioanimal.domain.services;

import java.util.Date;

import com.refugioanimal.domain.services.dto.LastPetPublishDTO;
import com.refugioanimal.domain.services.dto.PetDTO;

/**
 * @author Administrator
 */
public interface PetService {

	/**
	 * Get the pet information.
	 * 
	 * @param petID
	 * @return PetDTO
	 */
	PetDTO getPet(Long petID);

	/**
	 * Get all pets (dogs, cats, others) from the last month until the day of the date.
	 * 
	 * @param today
	 * @return getLastPublishPets
	 */
	LastPetPublishDTO getLastPublishPets(Date today);

}
