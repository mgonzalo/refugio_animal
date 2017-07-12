/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.repositories.dao.LocationDAO;

/**
 * @author Administrator
 *
 */
@Repository
public class LocationDAOImpl implements LocationDAO {

	private static final Logger logger = LoggerFactory.getLogger(LocationDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

}
