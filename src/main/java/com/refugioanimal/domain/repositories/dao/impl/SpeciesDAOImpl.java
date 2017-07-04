/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.model.Species;
import com.refugioanimal.domain.repositories.dao.SpeciesDAO;

/**
 * @author Administrator
 */
@Repository
public class SpeciesDAOImpl implements SpeciesDAO {

	private static final Logger logger = LoggerFactory.getLogger(SpeciesDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.SpeciesDAO#getAllSpecies()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Species> getAllSpecies() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Species.class);
		List<Species> species = (List<Species>) criteria.list();
		logger.info("Species found :" + species);
		return species;
	}

}
