/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Administrator
 */
public class EventDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1187324200443449407L;

	private String eventDescription;
	private Date dateDescription;

	/**
	 * default constructor for class.
	 */
	public EventDataDTO() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param eventDescription
	 * @param dateDescription
	 */
	public EventDataDTO(String eventDescription, Date dateDescription) {
		super();
		this.eventDescription = eventDescription;
		this.dateDescription = dateDescription;
	}

	/**
	 * @return the eventDescription
	 */
	public String getEventDescription() {
		return eventDescription;
	}

	/**
	 * @param eventDescription the eventDescription to set
	 */
	public void setEventDescription(String eventDescription) {
		this.eventDescription = eventDescription;
	}

	/**
	 * @return the dateDescription
	 */
	public Date getDateDescription() {
		return dateDescription;
	}

	/**
	 * @param dateDescription the dateDescription to set
	 */
	public void setDateDescription(Date dateDescription) {
		this.dateDescription = dateDescription;
	}

}
