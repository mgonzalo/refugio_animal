/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import java.util.List;

import com.refugioanimal.domain.exceptions.PetTypeException;
import com.refugioanimal.domain.model.PetType;

/**
 * @author Administrator
 */
public interface PetTypeDAO {

	/**
	 * Gets PetType by id
	 * 
	 * @param petType
	 * @return PetType
	 * @throws PetTypeException
	 */
	PetType getPetTypeById(Long petType) throws PetTypeException;

	/**
	 * Get pet types by specie id.
	 *
	 * @param specieTypeId
	 * @return List<PetType>
	 */
	List<PetType> getPetTypeBySpecieId(Long specieTypeId);

	/**
	 * Gets all PetTypes.
	 * 
	 * @return List<PetType>
	 */
	List<PetType> getAllPetTypes();
}
