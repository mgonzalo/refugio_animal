/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import static org.hibernate.criterion.Restrictions.eq;

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

/**
 * @author Administrator
 */
@Repository
public class PetDaoImpl implements PetDAO {

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

}
