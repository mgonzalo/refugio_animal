/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refugioanimal.domain.exceptions.MascotaException;
import com.refugioanimal.domain.exceptions.PetTypeException;
import com.refugioanimal.domain.exceptions.PublicationException;
import com.refugioanimal.domain.exceptions.SizeException;
import com.refugioanimal.domain.exceptions.UserException;
import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.model.PetType;
import com.refugioanimal.domain.model.Size;
import com.refugioanimal.domain.model.Species;
import com.refugioanimal.domain.model.User;
import com.refugioanimal.domain.repositories.dao.PetDAO;
import com.refugioanimal.domain.repositories.dao.PetTypeDAO;
import com.refugioanimal.domain.repositories.dao.PublicationDAO;
import com.refugioanimal.domain.repositories.dao.SizeDAO;
import com.refugioanimal.domain.repositories.dao.SpeciesDAO;
import com.refugioanimal.domain.repositories.dao.UserDAO;
import com.refugioanimal.domain.services.PetService;
import com.refugioanimal.domain.services.dto.LastPetPublishDTO;
import com.refugioanimal.domain.services.dto.PetDTO;
import com.refugioanimal.domain.services.dto.SizeTypeDTO;
import com.refugioanimal.domain.services.dto.SpecieTypeDTO;
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
	 * @see com.refugioanimal.domain.services.PetService#getLastPublishPets(java.util.Date)
	 */
	@Override
	public List<LastPetPublishDTO> getLastPublishPets(Date today) {
		List<Pet> pets = petDao.getLastPublishPets();
		List<LastPetPublishDTO> lastPetPublishDTOs = new ArrayList<LastPetPublishDTO>();
		for (Pet pet : pets) {
			lastPetPublishDTOs.add(new LastPetPublishDTO(pet.getId(), pet.getPetType().getId(), pet.getPetType().getSpecies().getId(), pet.getPetName()));
		}
		return lastPetPublishDTOs;
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
		Long petIdCreated = petDao.savePet(PetWrapper.toPet(petDTO, size, petType));
		User userToCreate = UserWrapper.toUser(petDTO.getUserDTO());
		Long userIdCreated = userDao.saveUser(userToCreate);
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

}
