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

import com.refugioanimal.domain.services.CommonService;
import com.refugioanimal.domain.services.PetService;
import com.refugioanimal.domain.services.dto.CommonDataDTO;
import com.refugioanimal.domain.services.dto.LastPetPublishDTO;

/**
 * @author Administrator
 */

@Controller
public class HomeController {

	private static final String VIEW_CONTAIN_FOLDER_NAME = "/home/";
	private static final String HOME_INDEX_VIEW = "home";

	@Autowired
	CommonService commonService;
	@Autowired
	PetService petService;

	@RequestMapping(value={"/", "home"}, method = GET)
	public ModelAndView getIndexView(ModelAndView modelAndView) {

		CommonDataDTO commonData = commonService.getCommonData();
		LastPetPublishDTO lastPetPublish = petService.getLastPublishPets(new Date());

		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + HOME_INDEX_VIEW);
		modelAndView.addObject(commonData);
		modelAndView.addObject(lastPetPublish);

		// return "home/" + HOME_INDEX_VIEW;
		return modelAndView;
	}

}
