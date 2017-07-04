/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.model.PetType;
import com.refugioanimal.domain.model.Size;
import com.refugioanimal.domain.services.dto.PetDTO;
import com.refugioanimal.domain.services.dto.UserDTO;

/**
 * @author Administrator
 */
public class PetWrapper {

	/**
	 * Create Pet object with PetDTO object.
	 * 
	 * @param petDTO
	 * @param petType
	 * @param size
	 * @return Pet
	 */
	public static Pet toPet(PetDTO petDTO, Size size, PetType petType) {
		return new Pet(petType, petDTO.getName(), size, petDTO.getAge(), petDTO.getSex().toUpperCase().charAt(0), petDTO.getBreed(), petDTO.getCastrated(), petDTO.getVaccinate(), petDTO.getCompatibilityWithOtherAnimals(), petDTO.getSpecialCare(),
				petDTO.getDescription());
	}

	/**
	 * Create PetDTO object from Pet object
	 * 
	 * @param pet
	 * @return PetDTO
	 */
	public static PetDTO toPetDTO(Pet pet) {
		UserDTO user = new UserDTO();
		return new PetDTO(pet.getId(), pet.getPetType().getId(), pet.getPetType().getSpecies().getId(), pet.getPetName(), pet.getSex().toString(), pet.getBreed(), pet.getSize().getId(), pet.getAge(), pet.getCastrated(), pet.getVaccinated(),
				pet.getCompatibility(), pet.getSpecialCare(), pet.getDescription(), user);
	}

	/**
	 * Create List<PetDTO> object from List<Pet> object
	 * 
	 * @param pets
	 * @return List<PetDTO>
	 */
	public static List<PetDTO> toPetDTO(List<Pet> pets) {
		List<PetDTO> petDTOs = new ArrayList<PetDTO>();
		for (Pet pet : pets) {
			petDTOs.add(toPetDTO(pet));
		}
		return petDTOs;
	}

}
