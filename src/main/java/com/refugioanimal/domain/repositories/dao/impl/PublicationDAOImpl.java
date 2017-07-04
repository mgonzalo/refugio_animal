/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.exceptions.PublicationException;
import com.refugioanimal.domain.model.Publication;
import com.refugioanimal.domain.repositories.dao.PublicationDAO;

/**
 * @author Administrator
 *
 */
@Repository
public class PublicationDAOImpl implements PublicationDAO {

	private static final Logger logger = LoggerFactory.getLogger(PublicationDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.PublicationDAO#createPublication(java.lang.Long, java.lang.Long)
	 */
	@Override
	public Long createPublication(Publication publication) throws PublicationException {
		try {
			Long publicationId = (Long) sessionFactory.openSession().save(publication);
			logger.info("publicacion creada exitosamente, id publicacion :" + publicationId);
			return publicationId;
		} catch (HibernateException he) {
			logger.error("Ocurrio un error al intentar crear la publicacion de la mascota. error: " + he.getMessage());
			throw new PublicationException("Ocurrio un error al intentar crear la publicacion de la mascota. error: " + he.getMessage());
		}
	}

}
