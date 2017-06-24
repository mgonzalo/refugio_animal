/**
 * 
 */
package com.refugioanimal.web.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.refugioanimal.domain.services.dto.PetDTO;

/**
 * @author Administrator
 */
@Controller
@RequestMapping("pets")
public class PetController extends BaseController {

	private static final String VIEW_CONTAIN_FOLDER_NAME = "pet/";
	private static final String PUBLISH_PET_VIEW = "publish";
	private static final String PET_SEARCH_VIEW = "search";
	private static final String PET_ANIMALCARE_VIEW = "animalcare";

	@RequestMapping(value = { "/publish" }, method = GET)
	public ModelAndView getPublishView(ModelAndView modelAndView) {
		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + PUBLISH_PET_VIEW);
		modelAndView.addObject("petDTO", new PetDTO());
		modelAndView.addObject("commonData", getCommonData());
		return modelAndView;
	}

	@RequestMapping(value = { "/new" }, method = POST)
	public String publishPet(@ModelAttribute("petDTO") PetDTO petDTO) {
		return "success or error";
	}

	@RequestMapping(value = "/search", method = GET)
	public ModelAndView getSerchView(ModelAndView model) {
		model.setViewName(VIEW_CONTAIN_FOLDER_NAME + PET_SEARCH_VIEW);
		model.addObject("commonData", getCommonData());
		return model;
	}

	@RequestMapping(value = "/animalcare", method = GET)
	public ModelAndView getAnimalCareView(ModelAndView model) {
		model.setViewName(VIEW_CONTAIN_FOLDER_NAME + PET_ANIMALCARE_VIEW);
		model.addObject("commonData", getCommonData());
		return model;
	}

}
