/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import java.util.List;

import com.refugioanimal.domain.model.EventInfo;

/**
 * @author Administrator
 */
public interface EventInfoDAO {

	/**
	 * Create an EventInfo
	 * 
	 * @param eventInfo
	 */
	void addEventInfo(EventInfo eventInfo);

	/**
	 * Modify an EventInfo.
	 * 
	 * @param eventInfo
	 */
	void updateEventInfo(EventInfo eventInfo);

	/**
	 * Remove an Eventinfo.
	 * 
	 * @param eventInfo
	 */
	void removeEventInfo(EventInfo eventInfo);

	/**
	 * Get all EventInfo in the actual month.
	 * 
	 * @return List<EventInfo>
	 */
	List<EventInfo> getAllEventInfo();
}
