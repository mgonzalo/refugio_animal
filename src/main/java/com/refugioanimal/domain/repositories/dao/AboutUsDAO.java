/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import com.refugioanimal.domain.model.AboutUs;

/**
 * @author Administrator
 */
public interface AboutUsDAO {

	/**
	 * Create an aboutUs
	 * 
	 * @param aboutUs
	 */
	void addAboutUs(AboutUs aboutUs);

	/**
	 * Modify aboutUs
	 * 
	 * @param aboutUs
	 */
	void updateAboutUs(AboutUs aboutUs);

	/**
	 * Delete aboutUs
	 * 
	 * @param aboutUs
	 */
	void removeAboutUs(AboutUs aboutUs);

	/**
	 * Get AboutUs obj.
	 * 
	 * @return AboutUs
	 */
	AboutUs getAboutUs();

}
