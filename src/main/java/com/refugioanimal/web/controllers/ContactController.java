/**
 * 
 */
package com.refugioanimal.web.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Administrator
 *
 */
@Controller
public class ContactController extends BaseController {

	private static final String VIEW_CONTAIN_FOLDER_NAME = "contact/";
	private static final String CONTACT_US_VIEW = "contact_us";
	
	@RequestMapping(value = { "/contactus" }, method = GET)
	public ModelAndView getContactView(ModelAndView modelAndView) {
		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + CONTACT_US_VIEW);
		modelAndView.addObject("commonData", getCommonData());
		return modelAndView;
	}

}
