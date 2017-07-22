/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import static java.lang.Boolean.TRUE;
import static org.apache.commons.lang3.StringUtils.isNotBlank;
import static org.hibernate.criterion.Restrictions.eq;
import static org.hibernate.criterion.Restrictions.le;
import static org.hibernate.criterion.Restrictions.like;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Order;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.exceptions.PublicationException;
import com.refugioanimal.domain.model.Publication;
import com.refugioanimal.domain.repositories.dao.PublicationDAO;
import com.refugioanimal.domain.services.dto.SearchDTO;

/**
 * @author Administrator
 */
@Repository
public class PublicationDAOImpl implements PublicationDAO {

	private static final int ALL_DEFAULT_VALUE_COMBO_BOX = 0;
	private static final Logger logger = getLogger(PublicationDAOImpl.class);

	@Autowired
	private SessionFactory sessionFactory;

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.PublicationDAO#createPublication(java.lang.Long,
	 * java.lang.Long)
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

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.PublicationDAO#searchPublications(com.refugioanimal
	 * .domain.services.dto.SearchDTO)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Publication> searchPublications(SearchDTO searchDTO) {

		Criteria criteria = sessionFactory.openSession().createCriteria(Publication.class);
		criteria.createAlias("pet", "petAl");
		
		if (searchDTO.getPetType() != null && searchDTO.getPetType() > ALL_DEFAULT_VALUE_COMBO_BOX) {
			criteria.add(eq("petAl.petType.id", searchDTO.getPetType()));
		}
		if (searchDTO.getSizeType() != null && searchDTO.getSizeType() > ALL_DEFAULT_VALUE_COMBO_BOX) {
			criteria.add(eq("petAl.size.id", searchDTO.getSizeType()));
		}
		if (isNotBlank(searchDTO.getBreed().trim())) {
			criteria.add(like("petAl.breed", searchDTO.getBreed().trim()));
		}
		if (searchDTO.getAge() != null && searchDTO.getAge() > ALL_DEFAULT_VALUE_COMBO_BOX) {
			criteria.add(le("petAl.age", searchDTO.getAge()));
		}
		if (isNotBlank(searchDTO.getSex().trim())) {
			criteria.add(eq("petAl.sex", searchDTO.getSex().trim().toUpperCase()));
		}
		
		criteria.add(eq("petAl.castrated", searchDTO.getCastrated()));
		criteria.add(eq("petAl.vaccinated", searchDTO.getVaccinate()));
		
		if (searchDTO.getProvinceId() != null && searchDTO.getProvinceId() > ALL_DEFAULT_VALUE_COMBO_BOX) {
			criteria.createAlias("user", "userAl");
			criteria.add(eq("userAl.provinceId", searchDTO.getProvinceId()));
			if (searchDTO.getLocationId() != null && searchDTO.getLocationId() > ALL_DEFAULT_VALUE_COMBO_BOX) {
				criteria.add(eq("userAl.locationId", searchDTO.getLocationId()));
			}
		}
		
		criteria.add(eq("active", TRUE));
		criteria.addOrder(Order.desc("startDate"));
		criteria.addOrder(Order.desc("id"));
		
		List<Publication> publications = (List<Publication>) criteria.list();
		return publications;
	}
	
	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.PublicationDAO#getLastPublications()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Publication> getLastPublications() {
		Criteria criteria = sessionFactory.openSession().createCriteria(Publication.class);
		criteria.createAlias("pet", "petAl");
		criteria.addOrder(Order.asc("petAl.petType.id"));
		criteria.addOrder(Order.desc("startDate"));
		criteria.add(eq("active", TRUE));
		criteria.setMaxResults(15);
		
		List<Publication> publications = (List<Publication>) criteria.list();
		return publications;
	}

}
