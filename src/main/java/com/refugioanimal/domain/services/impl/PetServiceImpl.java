/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import static com.refugioanimal.domain.enums.PetTypeEnum.CAT;
import static com.refugioanimal.domain.enums.PetTypeEnum.DOG;
import static com.refugioanimal.domain.enums.UserTypeEnum.NORMAL_USER;
import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refugioanimal.domain.exceptions.MascotaException;
import com.refugioanimal.domain.exceptions.PetTypeException;
import com.refugioanimal.domain.exceptions.PublicationException;
import com.refugioanimal.domain.exceptions.SizeException;
import com.refugioanimal.domain.exceptions.UserException;
import com.refugioanimal.domain.model.Location;
import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.model.PetType;
import com.refugioanimal.domain.model.Province;
import com.refugioanimal.domain.model.Publication;
import com.refugioanimal.domain.model.Size;
import com.refugioanimal.domain.model.Species;
import com.refugioanimal.domain.model.User;
import com.refugioanimal.domain.repositories.dao.LocationDAO;
import com.refugioanimal.domain.repositories.dao.PetDAO;
import com.refugioanimal.domain.repositories.dao.PetTypeDAO;
import com.refugioanimal.domain.repositories.dao.ProvinceDAO;
import com.refugioanimal.domain.repositories.dao.PublicationDAO;
import com.refugioanimal.domain.repositories.dao.SizeDAO;
import com.refugioanimal.domain.repositories.dao.SpeciesDAO;
import com.refugioanimal.domain.repositories.dao.UserDAO;
import com.refugioanimal.domain.services.PetService;
import com.refugioanimal.domain.services.dto.LastPetPublishDTO;
import com.refugioanimal.domain.services.dto.PetDTO;
import com.refugioanimal.domain.services.dto.PetTypeDTO;
import com.refugioanimal.domain.services.dto.ResultLastPetsPublishDTO;
import com.refugioanimal.domain.services.dto.SizeTypeDTO;
import com.refugioanimal.domain.services.dto.SpecieTypeDTO;
import com.refugioanimal.domain.wrappers.PetTypeWrapper;
import com.refugioanimal.domain.wrappers.PetWrapper;
import com.refugioanimal.domain.wrappers.PublicationWrapper;
import com.refugioanimal.domain.wrappers.SizeWrapper;
import com.refugioanimal.domain.wrappers.SpecieWrapper;
import com.refugioanimal.domain.wrappers.UserWrapper;

/**
 * @author Administrator
 */
@Service
public class PetServiceImpl implements PetService {

	@Autowired
	private PetDAO petDao;
	@Autowired
	private SizeDAO sizeDao;
	@Autowired
	private PetTypeDAO petTypeDao;
	@Autowired
	private UserDAO userDao;
	@Autowired
	private PublicationDAO publicationDao;
	@Autowired
	private SpeciesDAO speciesDao;
	@Autowired
	ProvinceDAO provinceDao;
	@Autowired
	LocationDAO locationDao;

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.services.PetService#getPet(java.lang.Long)
	 */
	@Override
	public PetDTO getPet(Long petID) throws MascotaException {
		return PetWrapper.toPetDTO(petDao.getPet(petID));
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.services.PetService#getLastPublishPets()
	 */
	@Override
	public ResultLastPetsPublishDTO getLastPublishPets() {
		List<Publication> publications = publicationDao.getLastPublications();
		List<LastPetPublishDTO> lastPetPublishDTOs = new ArrayList<LastPetPublishDTO>();
		Boolean hasDogTypePet, hasCatTypePet, hasOtherTypesPet;
		hasDogTypePet = hasCatTypePet = hasOtherTypesPet = FALSE;

		for (Publication publication : publications) {
			if (publication.getPet().getPetType().getId().equals(Long.valueOf(DOG.ordinal()))) {
				hasDogTypePet = TRUE;
			} else if (publication.getPet().getPetType().getId().equals(Long.valueOf(CAT.ordinal()))) {
				hasCatTypePet = TRUE;
			} else {
				hasOtherTypesPet = TRUE;
			}

			lastPetPublishDTOs.add(new LastPetPublishDTO(publication.getId(), publication.getPet().getId(), publication.getPet().getPetType().getId(), publication.getPet().getPetType().getSpecies().getId(), publication.getPet().getPetName()));
		}

		return new ResultLastPetsPublishDTO(lastPetPublishDTOs, hasDogTypePet, hasCatTypePet, hasOtherTypesPet);
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.services.PetService#createPet(com.refugioanimal.domain.services.dto.
	 * PetDTO)
	 */
	@Override
	@Transactional
	public void createPublication(PetDTO petDTO) throws MascotaException, SizeException, PetTypeException, UserException, PublicationException {
		Size size = sizeDao.getSizeById(petDTO.getSizeType());
		PetType petType = petTypeDao.getPetTypeById(petDTO.getPetType());

		Pet petToCreate = PetWrapper.toPet(petDTO, size, petType);
		petDao.savePet(PetWrapper.toPet(petDTO, size, petType));

		Province province = provinceDao.getProvinceByProvinceId(petDTO.getUserDTO().getProvinceId());
		Location location = locationDao.getLocationByLocationId(petDTO.getUserDTO().getLocationId());

		User userToCreate = UserWrapper.toUser(petDTO.getUserDTO(), NORMAL_USER, province, location);
		userDao.saveUser(userToCreate);
		publicationDao.createPublication(PublicationWrapper.toPublication(petToCreate, userToCreate));
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.services.PetService#getSpecieTypes()
	 */
	@Override
	public List<SpecieTypeDTO> getSpecieTypes() {
		List<Species> species = speciesDao.getAllSpecies();
		return SpecieWrapper.toSpecieTypeDTO(species);
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.services.PetService#getSizeTypes()
	 */
	@Override
	public List<SizeTypeDTO> getSizeTypes() {
		List<Size> sizes = sizeDao.getAllSizes();
		return SizeWrapper.toSizeTypDTO(sizes);
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.services.PetService#getPetTypesBySpecieId(java.lang.Long)
	 */
	@Override
	public List<PetTypeDTO> getPetTypesBySpecieId(Long specieId) {
		List<PetType> petTypes = petTypeDao.getPetTypeBySpecieId(specieId);
		return PetTypeWrapper.toPetTypeDTO(petTypes);
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.services.PetService#getPetTypes()
	 */
	@Override
	public List<PetTypeDTO> getPetTypes() {
		List<PetType> petTypes = petTypeDao.getAllPetTypes();
		return PetTypeWrapper.toPetTypeDTO(petTypes);
	}

}
