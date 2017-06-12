/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refugioanimal.domain.model.AboutUs;
import com.refugioanimal.domain.repositories.dao.AboutUsDAO;
import com.refugioanimal.domain.services.CommonService;
import com.refugioanimal.domain.services.dto.CommonDataDTO;
import com.refugioanimal.domain.services.dto.EventDataDTO;

/**
 * @author Administrator
 *
 */
@Service("commonService")
public class CommonServiceImpl implements CommonService {

	@Autowired
	private AboutUsDAO aboutUsDAO;
	

	/* (non-Javadoc)
	 * @see com.refugioanimal.domain.services.CommonService#getCommonData()
	 */
	@Override
	@Transactional
	public CommonDataDTO getCommonData() {
		AboutUs aboutUs = aboutUsDAO.getAboutUs();
		return new CommonDataDTO(aboutUs.getDescription(), new ArrayList<EventDataDTO>());
	}

}
