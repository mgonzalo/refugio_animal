/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import com.refugioanimal.domain.model.Contact;

/**
 * @author Administrator
 *
 */
public interface ContactDAO {

	/**
	 * Create Contact
	 * 
	 * @param contactToCreate
	 */
	void createContact(Contact contactToCreate);

}
