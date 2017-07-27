/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import static org.hibernate.criterion.Restrictions.eq;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.model.Location;
import com.refugioanimal.domain.repositories.dao.LocationDAO;

/**
 * @author Administrator
 */
@Repository
public class LocationDAOImpl implements LocationDAO {

	private static final Logger logger = LoggerFactory.getLogger(LocationDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.LocationDAO#getAllLocationsByProvince(java.lang.
	 * Long)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Location> getAllLocationsByProvince(Long provinceId) {
		Criteria criteria = sessionFactory.openSession().createCriteria(Location.class);
		criteria.add(eq("province.id", provinceId));
		criteria.addOrder(Order.asc("locationName"));
		List<Location> locations = criteria.list();
		logger.info("locations found" + locations);
		return locations;
	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.LocationDAO#getLocationByLocationId(java.lang.Long)
	 */
	@Override
	public Location getLocationByLocationId(Long locationId) {
		Criteria criteria = sessionFactory.openSession().createCriteria(Location.class);
		criteria.add(eq("id", locationId));
		Location location = (Location) criteria.uniqueResult();
		logger.info("location found" + location);
		return location;
	}

}
