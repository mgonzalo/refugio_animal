/**
 * 
 */
package com.refugioanimal.web.controllers;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.refugioanimal.domain.services.PetService;
import com.refugioanimal.domain.services.SearchService;
import com.refugioanimal.domain.services.UserService;
import com.refugioanimal.domain.services.dto.PetDTO;
import com.refugioanimal.domain.services.dto.PetTypeDTO;
import com.refugioanimal.domain.services.dto.ProvinceDTO;
import com.refugioanimal.domain.services.dto.PublicationDTO;
import com.refugioanimal.domain.services.dto.SearchDTO;
import com.refugioanimal.domain.services.dto.SizeTypeDTO;
import com.refugioanimal.domain.services.dto.SpecieTypeDTO;

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

	@Autowired
	PetService petService;
	@Autowired
	SearchService searchService;
	@Autowired
	UserService userservice;

	@RequestMapping(value = { "/publish" }, method = GET)
	public ModelAndView getPublishView(ModelAndView modelAndView) {
		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + PUBLISH_PET_VIEW);
		List<SpecieTypeDTO> specieTypeDTOs = petService.getSpecieTypes();
		List<SizeTypeDTO> sizeTypeDTOs = petService.getSizeTypes();
		List<ProvinceDTO> provinceDTOs = userservice.getAllProvincesByCountry();
		modelAndView.addObject("specieTypes", specieTypeDTOs);
		modelAndView.addObject("sizeTypes", sizeTypeDTOs);
		modelAndView.addObject("provinces", provinceDTOs);
		modelAndView.addObject("petDTO", new PetDTO());
		modelAndView.addObject("commonData", getCommonData());
		modelAndView.addObject("showDiv", "none");
		return modelAndView;
	}

	@RequestMapping(value = { "/new" }, method = POST)
	public ModelAndView newPet(@ModelAttribute("petDTO") @Valid PetDTO petDTO, ModelAndView modelAndView) {
		modelAndView.setViewName(VIEW_CONTAIN_FOLDER_NAME + PUBLISH_PET_VIEW);
		List<SpecieTypeDTO> specieTypeDTOs = petService.getSpecieTypes();
		List<SizeTypeDTO> sizeTypeDTOs = petService.getSizeTypes();
		List<ProvinceDTO> provinceDTOs = userservice.getAllProvincesByCountry();

		modelAndView.addObject("provinces", provinceDTOs);
		modelAndView.addObject("petDTO", petDTO);
		modelAndView.addObject("commonData", getCommonData());
		modelAndView.addObject("specieTypes", specieTypeDTOs);
		modelAndView.addObject("sizeTypes", sizeTypeDTOs);

		try {
			petService.createPublication(petDTO);
			modelAndView.addObject("resultStatus", HttpStatus.CREATED);
			modelAndView.addObject("showDiv", "visible");
			modelAndView.addObject("resultMessaje", "Mascota creada con exito!");
		} catch (Exception ex) {
			modelAndView.addObject("resultStatus", HttpStatus.INTERNAL_SERVER_ERROR);
			modelAndView.addObject("showDiv", "visible");
			modelAndView.addObject("resultMessaje", ex.getMessage());
		}

		return modelAndView;
	}

	/**
	 * Return search view.
	 * 
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/search", method = GET)
	public ModelAndView getSerchView(ModelAndView model) {
		
		model.setViewName(VIEW_CONTAIN_FOLDER_NAME + PET_SEARCH_VIEW);
		List<SizeTypeDTO> sizeTypeDTOs = petService.getSizeTypes();
		List<ProvinceDTO> provinceDTOs = userservice.getAllProvincesByCountry();
		List<PetTypeDTO> petTypeDTOs = petService.getPetTypes();
		
		model.addObject("petTypes", petTypeDTOs);
		model.addObject("sizeTypes", sizeTypeDTOs);
		model.addObject("provinces", provinceDTOs);
		model.addObject("searchDTO", new SearchDTO());
		model.addObject("commonData", getCommonData());
		return model;
	}

	/**
	 * Do search
	 * 
	 * @param searchDTO
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/doSearch", method = POST)
	public ModelAndView searchPets(@ModelAttribute("searchDTO") SearchDTO searchDTO, ModelAndView model) {
		List<PublicationDTO> publicationDTOs = searchService.searchPublications(searchDTO);
		
		model.setViewName(VIEW_CONTAIN_FOLDER_NAME + PET_SEARCH_VIEW);
		List<SizeTypeDTO> sizeTypeDTOs = petService.getSizeTypes();
		List<ProvinceDTO> provinceDTOs = userservice.getAllProvincesByCountry();
		List<PetTypeDTO> petTypeDTOs = petService.getPetTypes();
		
		model.addObject("petTypes", petTypeDTOs);
		model.addObject("sizeTypes", sizeTypeDTOs);
		model.addObject("provinces", provinceDTOs);
		model.addObject("searchDTO", searchDTO);
		model.addObject("commonData", getCommonData());
		model.addObject("results", publicationDTOs);
		return model;
	}

	/**
	 * Return animalcare view.
	 * 
	 * @param model
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/animalcare", method = GET)
	public ModelAndView getAnimalCareView(ModelAndView model) {
		model.setViewName(VIEW_CONTAIN_FOLDER_NAME + PET_ANIMALCARE_VIEW);
		model.addObject("commonData", getCommonData());
		return model;
	}

	/**
	 * Get all petTypes by SpecieType selected.
	 * 
	 * @param specieType
	 * @return PetTypeDTO
	 */
	@RequestMapping(value = "/petTypes", method = GET, produces = "application/json")
	@ResponseBody
	public List<PetTypeDTO> getPetTypesBySpecieType(@RequestParam(name = "specieType", required = true) Long specieType) {
		return petService.getPetTypesBySpecieId(specieType);
	}

}
