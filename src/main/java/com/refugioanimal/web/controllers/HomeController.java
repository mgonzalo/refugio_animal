/**
 * 
 */
package com.refugioanimal.web.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.refugioanimal.domain.services.PetService;
import com.refugioanimal.domain.services.dto.LastPetPublishDTO;

/**
 * @author Administrator
 */

@Controller
public class HomeController extends BaseController {

	private static final String VIEW_CONTAIN_FOLDER_NAME = "home/";
	private static final String HOME_INDEX_VIEW = "home";

	@Autowired
	PetService petService;

	@RequestMapping(value = { "/", "home" }, method = GET)
	public ModelAndView getIndexView(ModelAndView model) {
		LastPetPublishDTO lastPetPublish = petService.getLastPublishPets(new Date());
		model.setViewName(VIEW_CONTAIN_FOLDER_NAME + HOME_INDEX_VIEW);
		model.addObject("commonData", getCommonData());
		model.addObject("lastPets", lastPetPublish);
		return model;
	}

}
