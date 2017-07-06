/**
 * 
 */
package com.refugioanimal.domain.services;

import java.util.Date;
import java.util.List;

import com.refugioanimal.domain.exceptions.MascotaException;
import com.refugioanimal.domain.exceptions.PetTypeException;
import com.refugioanimal.domain.exceptions.PublicationException;
import com.refugioanimal.domain.exceptions.SizeException;
import com.refugioanimal.domain.exceptions.UserException;
import com.refugioanimal.domain.services.dto.LastPetPublishDTO;
import com.refugioanimal.domain.services.dto.PetDTO;
import com.refugioanimal.domain.services.dto.SizeTypeDTO;
import com.refugioanimal.domain.services.dto.SpecieTypeDTO;

/**
 * @author Administrator
 */
public interface PetService {

	/**
	 * Get the pet information.
	 * 
	 * @param petID
	 * @return PetDTO
	 * @throws MascotaException
	 */
	PetDTO getPet(Long petID) throws MascotaException;

	/**
	 * Get all pets (dogs, cats, others) from the last month until the day of the date.
	 * 
	 * @param today
	 * @return getLastPublishPets
	 */
	List<LastPetPublishDTO> getLastPublishPets(Date today);

	/**
	 * Create the pet, the user and the publication objets.
	 * 
	 * @param pet
	 * @throws MascotaException
	 * @throws SizeException
	 * @throws PetTypeException
	 * @throws UserException
	 * @throws PublicationException
	 */
	void createPublication(PetDTO pet) throws MascotaException, SizeException, PetTypeException, UserException, PublicationException;

	/**
	 * Get all SpeciesTypeDTO.
	 * 
	 * @return List<SpecieTypeDTO>
	 */
	List<SpecieTypeDTO> getSpecieTypes();

	/**
	 * Get all SizeTypesDTO.
	 * 
	 * @return List<SizeTypeDTO>
	 */
	List<SizeTypeDTO> getSizeTypes();

}
