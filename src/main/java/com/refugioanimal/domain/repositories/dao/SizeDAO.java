/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import java.util.List;

import com.refugioanimal.domain.exceptions.SizeException;
import com.refugioanimal.domain.model.Size;

/**
 * @author Administrator
 */
public interface SizeDAO {

	/**
	 * Gets Size by id.
	 * 
	 * @param sizeType
	 * @return Size
	 * @throws SizeException
	 */
	Size getSizeById(Long sizeType) throws SizeException;

	/**
	 * Get all size.
	 * 
	 * @return List<Size>
	 */
	List<Size> getAllSizes();
}
