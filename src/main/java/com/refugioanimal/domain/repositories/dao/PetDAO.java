/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import java.util.List;

import com.refugioanimal.domain.exceptions.MascotaException;
import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.services.dto.SearchDTO;

/**
 * @author Administrator
 */
public interface PetDAO {

	/**
	 * Get an existing pet by petID.
	 * 
	 * @param petID
	 * @return Pet
	 * @throws MascotaException
	 */
	Pet getPet(Long petID) throws MascotaException;

	/**
	 * Create a pet.
	 * 
	 * @param pet
	 * @return id Mascota
	 * @throws MascotaException
	 */
	Long savePet(Pet pet) throws MascotaException;

	/**
	 * Search pets by filters.
	 * 
	 * @param searchDTO
	 * @return List<Pet>
	 */
	List<Pet> searchPets(SearchDTO searchDTO);

	/**
	 * Get last publish pets.
	 * 
	 * @return List<Pet>
	 */
	List<Pet> getLastPublishPets();
	
	

}
