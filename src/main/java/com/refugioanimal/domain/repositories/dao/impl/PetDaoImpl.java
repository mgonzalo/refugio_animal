/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.hibernate.criterion.Restrictions.eq;
import static org.hibernate.criterion.Restrictions.le;
import static org.hibernate.criterion.Restrictions.like;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.exceptions.MascotaException;
import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.repositories.dao.PetDAO;
import com.refugioanimal.domain.services.dto.SearchDTO;

/**
 * @author Administrator
 */
@Repository
public class PetDaoImpl implements PetDAO {

	private static final int ALL_DEFAULT_VALUE_COMBO_BOX = 0;

	private static final Logger logger = LoggerFactory.getLogger(PetDaoImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.PetDAO#getPet(java.lang.Long)
	 */
	@Override
	public Pet getPet(Long petID) throws MascotaException {
		try {
			Criteria criteria = sessionFactory.openSession().createCriteria(Pet.class);
			criteria.add(eq("id", petID));
			Pet pet = (Pet) criteria.uniqueResult();
			logger.info("Pet found : " + pet);
			return pet;
		} catch (HibernateException he) {
			logger.error("Ocurrio un error al intentar obtener la mascota con el id " + petID + " error: " + he.getMessage());
			throw new MascotaException("Ocurrio un error al intentar obtener la mascota con el id " + petID + " error: " + he.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.PetDAO#savePet(com.refugioanimal.domain.model.Pet)
	 */
	@Override
	public Long savePet(Pet pet) throws MascotaException {
		try {
			Long petId = (Long) sessionFactory.openSession().save(pet);
			logger.info("mascota creada exitosamente, id mascota :" + petId);
			return petId;
		} catch (HibernateException he) {
			logger.error("Ocurrio un error al intentar crear la mascota. error: " + he.getMessage());
			throw new MascotaException("Ocurrio un error al intentar crear la mascota. error: " + he.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.PetDAO#searchPets(com.refugioanimal.domain.services
	 * .dto.SearchDTO)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Pet> searchPets(SearchDTO searchDTO) {

		Criteria criteria = sessionFactory.openSession().createCriteria(Pet.class);

		if (searchDTO.getPetType() != null && searchDTO.getPetType() > ALL_DEFAULT_VALUE_COMBO_BOX) {
			criteria.add(eq("petType.id", searchDTO.getPetType()));
		}
		if (searchDTO.getSizeType() != null && searchDTO.getSizeType() > ALL_DEFAULT_VALUE_COMBO_BOX) {
			criteria.add(eq("size.id", searchDTO.getSizeType()));
		}
		if (isNotBlank(searchDTO.getBreed().trim())) {
			criteria.add(like("breed", searchDTO.getBreed().trim()));
		}
		if (searchDTO.getAge() != null) {
			criteria.add(le("age", searchDTO.getAge()));
		}
		if (isNotBlank(searchDTO.getSex().trim())) {
			criteria.add(eq("sex", searchDTO.getSex().trim().toUpperCase()));
		}
		if (searchDTO.getCastrated()) {
			criteria.add(eq("castrated", searchDTO.getCastrated()));
		}
		if (searchDTO.getVaccinate()) {
			criteria.add(eq("vaccinated", searchDTO.getVaccinate()));
		}
		if (searchDTO.getProvinceId() != null && searchDTO.getProvinceId() > ALL_DEFAULT_VALUE_COMBO_BOX) {
			criteria.add(eq("owner.provinceId", searchDTO.getProvinceId()));
			if (searchDTO.getLocationId() != null && searchDTO.getLocationId() > ALL_DEFAULT_VALUE_COMBO_BOX) {
				criteria.add(eq("owner.locationId", searchDTO.getLocationId()));
			}
		}
		// TODO: arreglar esto.
		// criteria.add(Restrictions.eq("publication.active", TRUE));
		List<Pet> pets = criteria.list();
		return pets;
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.PetDAO#getLastPublishPets()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Pet> getLastPublishPets() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Pet.class);
		criteria.setMaxResults(9);
		List<Pet> pets = criteria.list();
		return pets;
	}

}
