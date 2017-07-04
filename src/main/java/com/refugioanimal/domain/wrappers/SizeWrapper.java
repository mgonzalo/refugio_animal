/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import java.util.ArrayList;
import java.util.List;

import com.refugioanimal.domain.model.Size;
import com.refugioanimal.domain.services.dto.SizeTypeDTO;

/**
 * @author Administrator
 */
public class SizeWrapper {

	/**
	 * Create List<SizeTypeDTO> object with List<Size> object.
	 * 
	 * @param sizes
	 * @return List<SizeTypeDTO>
	 */
	public static List<SizeTypeDTO> toSizeTypDTO(List<Size> sizes) {
		List<SizeTypeDTO> sizeTypeDTOs = new ArrayList<SizeTypeDTO>();
		for (Size size : sizes) {
			sizeTypeDTOs.add(new SizeTypeDTO(size.getId(), size.getDescription()));
		}
		return sizeTypeDTOs;
	}

}
