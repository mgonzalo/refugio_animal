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

	private AboutUsDataDTO aboutUsData;
	private List<EventDataDTO> eventData;

	/**
	 * defualt constructor for the class.
	 */
	public CommonDataDTO() {
		super();
	}

	/**
	 * @param aboutUsData
	 * @param eventData
	 */
	public CommonDataDTO(AboutUsDataDTO aboutUsData, List<EventDataDTO> eventData) {
		super();
		this.aboutUsData = aboutUsData;
		this.eventData = eventData;
	}

	/**
	 * @return the aboutUsData
	 */
	public AboutUsDataDTO getAboutUsData() {
		return aboutUsData;
	}

	/**
	 * @return the eventData
	 */
	public List<EventDataDTO> getEventData() {
		return eventData;
	}

}
