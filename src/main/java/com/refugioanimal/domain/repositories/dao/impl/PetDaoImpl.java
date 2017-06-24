/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.repositories.dao.PetDAO;

/**
 * @author Administrator
 *
 */
@Repository
public class PetDaoImpl implements PetDAO {
	
	private static final Logger logger = LoggerFactory.getLogger(PetDaoImpl.class);
	
//	@Autowired
//	private SessionFactory sessionFactory;

	/**
	 * 
	 */
	public PetDaoImpl() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.PetDAO#getPet(java.lang.Long)
	 */
	@Override
	public Pet getPet(Long petID) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.PetDAO#addPet(com.refugioanimal.domain.model.Pet)
	 */
	@Override
	public void addPet(Pet pet) {
		// TODO Auto-generated method stub

	}

}
