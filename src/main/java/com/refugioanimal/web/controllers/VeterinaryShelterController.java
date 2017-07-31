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
@RequestMapping("veterinaryshelter")
public class VeterinaryShelterController extends BaseController {

	private static final String VIEW_CONTAIN_FOLDER_NAME = "veterinary_shelter/";
	private static final String PUBLISH_VETERINARY_SHELTER_VIEW = "publish";
	private static final String SEARCH_VETERINARY_SHELTER_VIEW = "search";
	
	@RequestMapping(value = { "/publish" }, method = GET)
	public ModelAndView getPublishView(ModelAndView modelAndView) {
		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + PUBLISH_VETERINARY_SHELTER_VIEW);
		modelAndView.addObject("commonData", getCommonData());
		modelAndView.addObject("navHomeActive", "");
		modelAndView.addObject("navPetActive", "");
		modelAndView.addObject("navVeterinaryShelterActive", "active");
		modelAndView.addObject("navContactActive", "");
		return modelAndView;
	}

	@RequestMapping(value = { "/publishVeterinaryShelter" }, method = POST)
	public String publishVeterinaryShelter(ModelAndView model) {
		return "success or error";
	}
	

	@RequestMapping(value = "/search", method = GET)
	public ModelAndView getSerchView(ModelAndView modelAndView) {
		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + SEARCH_VETERINARY_SHELTER_VIEW);
		modelAndView.addObject("commonData", getCommonData());
		modelAndView.addObject("navHomeActive", "");
		modelAndView.addObject("navPetActive", "");
		modelAndView.addObject("navVeterinaryShelterActive", "active");
		modelAndView.addObject("navContactActive", "");
		return modelAndView;
	}

}
