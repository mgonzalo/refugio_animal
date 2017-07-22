/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import com.refugioanimal.domain.exceptions.MascotaException;
import com.refugioanimal.domain.model.Pet;

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

}
