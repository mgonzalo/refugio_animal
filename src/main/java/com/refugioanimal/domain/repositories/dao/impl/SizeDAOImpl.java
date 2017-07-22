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

import com.refugioanimal.domain.exceptions.SizeException;
import com.refugioanimal.domain.model.Size;
import com.refugioanimal.domain.repositories.dao.SizeDAO;

/**
 * @author Administrator
 */
@Repository
public class SizeDAOImpl implements SizeDAO {

	private static final Logger logger = LoggerFactory.getLogger(SizeDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.SizeDAO#getSizeById(java.lang.Long)
	 */
	@Override
	public Size getSizeById(Long sizeType) throws SizeException {
		try {
			Criteria criteria = sessionFactory.openSession().createCriteria(Size.class);
			criteria.add(eq("id", sizeType));
			Size size = (Size) criteria.uniqueResult();
			logger.info("size found" + size);
			return size;
		} catch (HibernateException he) {
			logger.error("Ocurrio un error al intentar obtener el tamanio de la mascota con el id " + sizeType + " error: " + he.getMessage());
			throw new SizeException("Ocurrio un error al intentar obtener el tamanio de la mascota con el id " + sizeType + " error: " + he.getMessage());
		}
	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.SizeDAO#getAllSizes()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Size> getAllSizes() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Size.class);
		criteria.addOrder(Order.asc("description"));
		List<Size> sizes = (List<Size>) criteria.list();
		logger.info("Sizes found :" + sizes);
		return sizes;
	}

}
