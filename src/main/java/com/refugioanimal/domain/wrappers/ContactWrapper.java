/**
 * 
 */
package com.refugioanimal.domain.wrappers;

import java.util.Date;

import com.refugioanimal.domain.model.Contact;
import com.refugioanimal.domain.services.dto.ContactDTO;

/**
 * @author Administrator
 */
public class ContactWrapper {

	/**
	 * Convert from ContactDTO object to Contact object.
	 * 
	 * @param contactDTO
	 * @return Contact
	 */
	public static Contact toContact(ContactDTO contactDTO) {
		return new Contact(contactDTO.getContactName(), contactDTO.getContactEmail(), contactDTO.getContactSubject(), contactDTO.getContactMesagge(), new Date());
	}

}
