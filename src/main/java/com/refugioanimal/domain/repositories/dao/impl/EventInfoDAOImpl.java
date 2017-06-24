/**
 * 
 */
package com.refugioanimal.domain.repositories.dao.impl;

import static java.util.Calendar.DAY_OF_MONTH;
import static org.hibernate.criterion.Restrictions.between;
import static org.slf4j.LoggerFactory.getLogger;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.refugioanimal.domain.model.EventInfo;
import com.refugioanimal.domain.repositories.dao.EventInfoDAO;

/**
 * @author Administrator
 *
 */
@Repository
public class EventInfoDAOImpl implements EventInfoDAO {

	private static final Logger logger = getLogger(EventInfoDAOImpl.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.EventInfoDAO#addEventInfo(com.refugioanimal.domain.model.EventInfo)
	 */
	@Override
	public void addEventInfo(EventInfo eventInfo) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.EventInfoDAO#updateEventInfo(com.refugioanimal.domain.model.EventInfo)
	 */
	@Override
	public void updateEventInfo(EventInfo eventInfo) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.EventInfoDAO#removeEventInfo(com.refugioanimal.domain.model.EventInfo)
	 */
	@Override
	public void removeEventInfo(EventInfo eventInfo) {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.repositories.dao.EventInfoDAO#getAllEventInfo()
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<EventInfo> getAllEventInfo() {
		Date firstDayOfMonth = getFirstDayMonth();
		Date lastDayOfMonth = getLastDayMonth();
		
		Criteria criteria = sessionFactory.openSession().createCriteria(EventInfo.class);
		criteria.add(between("eventDate", firstDayOfMonth, lastDayOfMonth));
		List<EventInfo> eventInfos = criteria.list();
		logger.info("Event info found, details=" + eventInfos);
		return eventInfos;
	}
	
	/**
	 * Get first day of the current month
	 */
	private Date getFirstDayMonth() {
		 Calendar calendarFirstDate = Calendar.getInstance();   // this takes current date
		 calendarFirstDate.set(DAY_OF_MONTH, 1);
		return calendarFirstDate.getTime();
	}


	/**
	 * Get last day of the current month.
	 */
	private Date getLastDayMonth() {
		Calendar calLastDate = Calendar.getInstance();
		calLastDate.setTime(new Date());
		calLastDate.set(DAY_OF_MONTH, calLastDate.getActualMaximum(DAY_OF_MONTH));
		return calLastDate.getTime();
	}

}
