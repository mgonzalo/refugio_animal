/**
 * 
 */
package com.refugioanimal.domain.repositories.dao;

import com.refugioanimal.domain.exceptions.UserException;
import com.refugioanimal.domain.model.User;

/**
 * @author Administrator
 */
public interface UserDAO {

	/**
	 * Create a user
	 * 
	 * @param user
	 * @return id user
	 * @throws UserException 
	 */
	Long saveUser(User user) throws UserException;

}
