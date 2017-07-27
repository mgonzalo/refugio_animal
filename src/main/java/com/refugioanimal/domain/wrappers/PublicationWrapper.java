/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import static java.lang.Boolean.TRUE;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.model.Publication;
import com.refugioanimal.domain.model.User;
import com.refugioanimal.domain.services.dto.PublicationDTO;
import com.refugioanimal.domain.services.dto.PublicationDataDTO;

/**
 * @author Administrator
 */
public class PublicationWrapper {

	/**
	 * Create Publication object.
	 * 
	 * @param pet
	 * @param user
	 * @return Publication
	 */
	public static Publication toPublication(Pet pet, User user) {
		return new Publication(user, pet, new Date(), null, TRUE);
	}

	/**
	 * Convert from List<Publication> object to List<PublicationDTO> object.
	 * 
	 * @param publications
	 * @return List<PublicationDTO>
	 */
	public static List<PublicationDTO> toPublicationsDTO(List<Publication> publications) {
		List<PublicationDTO> publicationDTOs = new ArrayList<PublicationDTO>();
		for (Publication publication : publications) {
			String petAge = publication.getPet().getAge() < 1 ? publication.getPet().getAge().toString() + " Meses" : publication.getPet().getAge().toString() + " Años";
			String petSex = publication.getPet().getSex().equals("H") ? "Hembra" : "Macho";
			String ubicacion = publication.getUser().getProvince().getProvinceName() + " - " + publication.getUser().getLocation().getLocationName();
			publicationDTOs.add(new PublicationDTO(publication.getId(), publication.getPet().getId(), publication.getPet().getPetName(), petAge, petSex, publication.getPet().getBreed(), ubicacion));
		}
		return publicationDTOs;
	}

	/**
	 * Convert from List<Publication> object to List<PublicationDataDTO> object.
	 * 
	 * @param publication
	 * @return PublicationDataDTO
	 */
	public static PublicationDataDTO toPublicationDataDTO(Publication publication) {

		String ownerNameLastname = publication.getUser().getName() + " " + publication.getUser().getLastname();
		String ownerEmail = publication.getUser().getEmail();
		String ownerPhone = publication.getUser().getPhone();
		String ownerProvince = publication.getUser().getProvince().getProvinceName();
		String ownerCity = publication.getUser().getLocation().getLocationName();
		String ownerStreet = publication.getUser().getDirection();
		String petPetType = publication.getPet().getPetType().getDescription();
		String petName = publication.getPet().getPetName();
		String petAge = publication.getPet().getAge() < 1 ? publication.getPet().getAge().toString() + " Meses" : publication.getPet().getAge().toString() + " Años";
		String petSex = publication.getPet().getSex().equals("H") ? "Hembra" : "Macho";
		String petSize = publication.getPet().getSize().getDescription();
		String petBreed = publication.getPet().getBreed();
		Boolean petCastrated = publication.getPet().getCastrated();
		Boolean petVaccinate = publication.getPet().getVaccinated();
		Boolean petCompatibilityWithOtherAnimals = publication.getPet().getCompatibility();
		Boolean petSpecialCare = publication.getPet().getSpecialCare();
		String petDescription = publication.getPet().getDescription();
		
		return new PublicationDataDTO(ownerNameLastname, ownerEmail, ownerPhone, ownerProvince, ownerCity, ownerStreet, petPetType, petName, petAge, petSex, petSize, petBreed, petCastrated, petVaccinate, petCompatibilityWithOtherAnimals,
				petSpecialCare, petDescription);
	}

}
