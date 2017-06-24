/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.refugioanimal.domain.model.EventInfo;
import com.refugioanimal.domain.services.dto.EventDataDTO;

/**
 * @author Administrator
 */
public class EventInfoWrapper {

	/**
	 * Convert from EventInfo object to EventInfoDTO
	 * 
	 * @param allEventInfo
	 * @return List<EventDataDTO>
	 */
	public static List<EventDataDTO> toEventInfoDTO(List<EventInfo> allEventInfo) {
		List<EventDataDTO> eventDataDTOs = new ArrayList<>();
		for (EventInfo eventInfo : allEventInfo) {
			eventDataDTOs.add(new EventDataDTO(eventInfo.getDescription(), eventInfo.getPlace(), eventInfo.getEventDate()));
		}
		return eventDataDTOs;
	}

}
