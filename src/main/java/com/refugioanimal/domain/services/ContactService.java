/**
 * 
 */
package com.refugioanimal.domain.services;

import javax.mail.MessagingException;

import com.refugioanimal.domain.services.dto.ContactDTO;

/**
 * @author Administrator
 *
 */
public interface ContactService {
	
	/**
	 * Create Contact and Send Email.
	 * 
	 * @param contact
	 * @throws MessagingException 
	 */
	void saveContactAndSendEmail(ContactDTO contact) throws MessagingException;

}
