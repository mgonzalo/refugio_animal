/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import static java.lang.Long.valueOf;
import static org.hibernate.criterion.Restrictions.eq;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.enums.CountryEnum;
import com.refugioanimal.domain.model.Province;
import com.refugioanimal.domain.repositories.dao.ProvinceDAO;

/**
 * @author Administrator
 */
@Repository
public class ProvinceDAOImpl implements ProvinceDAO {

	private static final Logger logger = LoggerFactory.getLogger(ProvinceDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.ProvinceDAO#getAllProvincesByCountry(com.
	 * refugioanimal.domain.enums.CountryEnum)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Province> getAllProvincesByCountry(CountryEnum country) {
		Criteria criteria = sessionFactory.openSession().createCriteria(Province.class);
		criteria.add(eq("idCountry", valueOf(country.ordinal())));
		criteria.addOrder(Order.asc("provinceName"));
		List<Province> provinces = (List<Province>) criteria.list();
		logger.info("province found" + provinces);
		return provinces;
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.ProvinceDAO#getProvinceByProvinceId(java.lang.Long)
	 */
	@Override
	public Province getProvinceByProvinceId(Long provinceId) {
		Criteria criteria = sessionFactory.openSession().createCriteria(Province.class);
		criteria.add(eq("id", provinceId));
		Province province = (Province) criteria.uniqueResult();
		logger.info("province found" + province);
		return province;
	}

}
