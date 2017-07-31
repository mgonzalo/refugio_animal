/**
 * 
 */
package com.refugioanimal.web.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.refugioanimal.domain.services.ContactService;
import com.refugioanimal.domain.services.dto.ContactDTO;

/**
 * @author Administrator
 *
 */
@Controller
@RequestMapping("contact")
public class ContactController extends BaseController {

	private static final String VIEW_CONTAIN_FOLDER_NAME = "contact/";
	private static final String CONTACT_US_VIEW = "contact_us";
	
	@Autowired
	ContactService contactService;
	
	@RequestMapping(value = { "/contactus" }, method = GET)
	public ModelAndView getContactView(ModelAndView modelAndView) {
		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + CONTACT_US_VIEW);
		modelAndView.addObject("commonData", getCommonData());
		modelAndView.addObject("contactDTO", new ContactDTO());
		modelAndView.addObject("showDiv", "none");
		modelAndView.addObject("navHomeActive", "");
		modelAndView.addObject("navPetActive", "");
		modelAndView.addObject("navVeterinaryShelterActive", "");
		modelAndView.addObject("navContactActive", "active");
		return modelAndView;
	}
	
	@RequestMapping(value = { "/new" }, method = POST)
	public ModelAndView createContactAndSendEmail(@ModelAttribute("contactDTO") @Valid ContactDTO contactDTO, ModelAndView modelAndView) {
		
		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + CONTACT_US_VIEW);
		modelAndView.addObject("commonData", getCommonData());
		modelAndView.addObject("contactDTO", new ContactDTO());
		modelAndView.addObject("navHomeActive", "");
		modelAndView.addObject("navPetActive", "");
		modelAndView.addObject("navVeterinaryShelterActive", "");
		modelAndView.addObject("navContactActive", "active");
		
		try {
			contactService.saveContactAndSendEmail(contactDTO);
			modelAndView.addObject("resultStatus", HttpStatus.CREATED);
			modelAndView.addObject("showDiv", "visible");
			modelAndView.addObject("resultMessaje", "El contacto ha sido enviado con exito!");
		} catch (Exception ex) {
			modelAndView.addObject("resultStatus", HttpStatus.INTERNAL_SERVER_ERROR);
			modelAndView.addObject("showDiv", "visible");
			modelAndView.addObject("resultMessaje", ex.getMessage());
		}
		return modelAndView;
	}

}
