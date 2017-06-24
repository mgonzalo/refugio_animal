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
	private String eventPlace;
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
	 * @param eventPlace
	 * @param dateDescription
	 */
	public EventDataDTO(String eventDescription, String eventPlace, Date dateDescription) {
		super();
		this.eventDescription = eventDescription;
		this.eventPlace = eventPlace;
		this.dateDescription = dateDescription;
	}

	/**
	 * @return the eventDescription
	 */
	public String getEventDescription() {
		return eventDescription;
	}

	/**
	 * @return the eventPlace
	 */
	public String getEventPlace() {
		return eventPlace;
	}

	/**
	 * @return the dateDescription
	 */
	public Date getDateDescription() {
		return dateDescription;
	}

}
