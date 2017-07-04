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

import com.refugioanimal.domain.exceptions.UserException;
import com.refugioanimal.domain.model.User;
import com.refugioanimal.domain.repositories.dao.UserDAO;

/**
 * @author Administrator
 *
 */
@Repository
public class UserDAOImpl implements UserDAO {

	private static final Logger logger = LoggerFactory.getLogger(UserDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;
	
	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.UserDAO#saveUser(com.refugioanimal.domain.model.User)
	 */
	@Override
	public Long saveUser(User user) throws UserException {
		try {
			Long userId = (Long) sessionFactory.openSession().save(user);
			logger.info("usuario creado exitosamente, id usuario :" + userId);
			return userId;
		} catch (HibernateException he) {
			logger.error("Ocurrio un error al intentar crear el dueño de la mascota. error: " + he.getMessage());
			throw new UserException("Ocurrio un error al intentar crear el dueño de la mascota. error: " + he.getMessage());
		}
	}

}
