/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import static org.slf4j.LoggerFactory.getLogger;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.model.Contact;
import com.refugioanimal.domain.repositories.dao.ContactDAO;

/**
 * @author Administrator
 */
@Repository
public class ContactDAOImpl implements ContactDAO {

	private static final Logger logger = getLogger(AboutUsDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.ContactDAO#createContact(com.refugioanimal.domain.
	 * model.Contact)
	 */
	@Override
	public void createContact(Contact contactToCreate) {
		try {
			Long contactIdCreated = (Long) sessionFactory.openSession().save(contactToCreate);
			logger.info("contacto creado exitosamente, id contacto :" + contactIdCreated);
		} catch (HibernateException he) {
			logger.error("Ocurrio un error al intentar crear el contacto. error: " + he.getMessage());
		}
	}

}
