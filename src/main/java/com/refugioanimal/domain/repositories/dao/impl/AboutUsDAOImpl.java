/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import static org.slf4j.LoggerFactory.getLogger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.model.AboutUs;
import com.refugioanimal.domain.repositories.dao.AboutUsDAO;

/**
 * @author Administrator
 */
@Repository
public class AboutUsDAOImpl implements AboutUsDAO {

	private static final Logger logger = getLogger(AboutUsDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;

//	public void setSessionFactory(SessionFactory sf) {
//		this.sessionFactory = sf;
//	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.AboutUsDAO#addAboutUs(com.refugioanimal.domain.
	 * model.AboutUs)
	 */
	@Override
	public void addAboutUs(AboutUs aboutUs) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.AboutUsDAO#updateAboutUs(com.refugioanimal.domain.
	 * model.AboutUs)
	 */
	@Override
	public void updateAboutUs(AboutUs aboutUs) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.repositories.dao.AboutUsDAO#removeAboutUs(com.refugioanimal.domain.
	 * model.AboutUs)
	 */
	@Override
	public void removeAboutUs(AboutUs aboutUs) {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.AboutUsDAO#getAboutUs()
	 */
	@Override
	public AboutUs getAboutUs() {
		Session session = this.sessionFactory.getCurrentSession();
		AboutUs aboutUs = (AboutUs) session.createQuery("from AboutUs");
		logger.info("AboutUs found, details=" + aboutUs);
		return aboutUs;
	}

}
