/**
 * 
 */
package com.refugioanimal.domain.services.dto;

import java.io.Serializable;
import java.util.List;

/**
 * @author Administrator
 */
public class CommonDataDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6809254299238993204L;

	private String aboutUsData;
	private List<EventDataDTO> eventDataDTOs;

	/**
	 * defualt constructor for the class.
	 */
	public CommonDataDTO() {
		super();
	}

	/**
	 * Constructor for class.
	 * 
	 * @param aboutUsData
	 * @param eventDataDTOs
	 */
	public CommonDataDTO(String aboutUsData, List<EventDataDTO> eventDataDTOs) {
		super();
		this.aboutUsData = aboutUsData;
		this.eventDataDTOs = eventDataDTOs;
	}

	/**
	 * @return the aboutUsData
	 */
	public String getAboutUsData() {
		return aboutUsData;
	}

	/**
	 * @return the eventDataDTOs
	 */
	public List<EventDataDTO> getEventDataDTOs() {
		return eventDataDTOs;
	}

}
