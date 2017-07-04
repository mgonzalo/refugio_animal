/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import static java.lang.Boolean.TRUE;

import java.util.Date;

import com.refugioanimal.domain.model.Pet;
import com.refugioanimal.domain.model.Publication;
import com.refugioanimal.domain.model.User;

/**
 * @author Administrator
 */
public class PublicationWrapper {

	/**
	 * Create Publication object.
	 * 
	 * @param pet
	 * @param user
	 * @return Publication
	 */
	public static Publication toPublication(Pet pet, User user) {
		return new Publication(user, pet, new Date(), null, TRUE);
	}

}
