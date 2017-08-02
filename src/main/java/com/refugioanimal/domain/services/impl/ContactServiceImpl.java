/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import static org.slf4j.LoggerFactory.getLogger;

import javax.mail.MessagingException;
import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refugioanimal.domain.model.Contact;
import com.refugioanimal.domain.repositories.dao.ContactDAO;
import com.refugioanimal.domain.services.ContactService;
import com.refugioanimal.domain.services.dto.ContactDTO;
import com.refugioanimal.domain.utils.MailUtils;
import com.refugioanimal.domain.wrappers.ContactWrapper;

/**
 * @author Administrator
 */
@Service
public class ContactServiceImpl implements ContactService {

	private static final Logger logger = getLogger(ContactServiceImpl.class);

	@Autowired
	private ContactDAO contactDao;

	/*
	 * (non-Javadoc)
	 * @see
	 * com.refugioanimal.domain.services.ContactService#saveContactAndSendEmail(com.refugioanimal.
	 * domain.services.dto.ContactDTO)
	 */
	@Override
	@Transactional
	public void saveContactAndSendEmail(ContactDTO contactDTO) throws MessagingException {

		Contact contactToCreate = ContactWrapper.toContact(contactDTO);
		contactDao.createContact(contactToCreate);
		logger.info("creacion de contacto!");
		// Envio de mail.
		MailUtils.sendEmail(contactDTO.getContactEmail(), contactDTO.getContactSubject(), contactDTO.getContactMesagge());
		logger.info("email enviado correctamente!");
	}

}
