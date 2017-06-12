/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import com.refugioanimal.domain.model.Pet;

/**
 * @author Administrator
 *
 */
public interface PetDAO {

	/**
	 * Get an existing pet by petID.
	 * 
	 * @param petID
	 * @return Pet
	 */
	Pet getPet(Long petID);
	
	/**
	 * Create a pet.
	 * 
	 * @param pet
	 */
	void addPet(Pet pet);
	
}
