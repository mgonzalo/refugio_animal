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
			String ubicacion = publication.getUser().getProvinceId().toString() + " - " + publication.getUser().getLocationId().toString();
			publicationDTOs.add(new PublicationDTO(publication.getId(), publication.getPet().getId(), publication.getPet().getPetName(), petAge, petSex, publication.getPet().getBreed(), ubicacion));
		}
		return publicationDTOs;
	}

}
