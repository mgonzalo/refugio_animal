/**
 * 
 */
package com.refugioanimal.web.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("/pets")
public class PetController {

	private static final String VIEW_CONTAIN_FOLDER_NAME = "/pet/";
	private static final String PUBLISH_PET_VIEW = "publishPet";

	@RequestMapping(value = { "/publish" }, method = GET)
	public ModelAndView getPublishView(ModelAndView modelAndView) {
		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + PUBLISH_PET_VIEW);
		return modelAndView;
	}

	@RequestMapping(value = { "/publishPet" }, method = POST)
	public String publishPet(ModelAndView model) {
		return "success or error";
	}

}
