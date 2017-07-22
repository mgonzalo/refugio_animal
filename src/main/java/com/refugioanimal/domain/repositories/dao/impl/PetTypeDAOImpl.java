/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import static org.hibernate.criterion.Restrictions.eq;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.exceptions.PetTypeException;
import com.refugioanimal.domain.model.PetType;
import com.refugioanimal.domain.repositories.dao.PetTypeDAO;

/**
 * @author Administrator
 */
@Repository
public class PetTypeDAOImpl implements PetTypeDAO {

	private static final Logger logger = LoggerFactory.getLogger(PetTypeDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.PetTypeDAO#getPetTypeById(java.lang.Long)
	 */
	@Override
	public PetType getPetTypeById(Long petType) throws PetTypeException {
		try {
			Criteria criteria = sessionFactory.openSession().createCriteria(PetType.class);
			criteria.add(eq("id", petType));
			PetType type = (PetType) criteria.uniqueResult();
			logger.info("pet type found" + type);
			return type;
		} catch (HibernateException he) {
			logger.error("Ocurrio un error al intentar obtener el tipo de la mascota con el id de tipo " + petType + " error: " + he.getMessage());
			throw new PetTypeException("Ocurrio un error al intentar obtener el tipo de la mascota con el id de tipo " + petType + " error: " + he.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.PetTypeDAO#getPetTypeBySpecieId(java.lang.Long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PetType> getPetTypeBySpecieId(Long specieTypeId) {
		Criteria criteria = sessionFactory.openSession().createCriteria(PetType.class);
		criteria.add(eq("species.id", specieTypeId));
		criteria.addOrder(Order.asc("description"));
		List<PetType> petTypes = criteria.list();
		return petTypes;
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.PetTypeDAO#getAllPetTypes()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<PetType> getAllPetTypes() {
		Criteria criteria = sessionFactory.openSession().createCriteria(PetType.class);
		criteria.addOrder(Order.asc("description"));
		List<PetType> petTypes = (List<PetType>) criteria.list();
		logger.info("PetTypes found :" + petTypes);
		return petTypes;
	}

}
