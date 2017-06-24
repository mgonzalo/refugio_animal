/**
 * 
 */
package com.refugioanimal.domain.services.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refugioanimal.domain.repositories.dao.AboutUsDAO;
import com.refugioanimal.domain.repositories.dao.EventInfoDAO;
import com.refugioanimal.domain.services.CommonService;
import com.refugioanimal.domain.services.dto.CommonDataDTO;
import com.refugioanimal.domain.wrappers.AboutUsWrapper;
import com.refugioanimal.domain.wrappers.EventInfoWrapper;

/**
 * @author Administrator
 */
@Service
public class CommonServiceImpl implements CommonService {

	@Autowired
	private AboutUsDAO aboutUsDAO;
	@Autowired
	private EventInfoDAO eventInfoDAO;

	/*
	 * (non-Javadoc)
	 * @see com.refugioanimal.domain.services.CommonService#getCommonData()
	 */
	@Override
	@Transactional
	public CommonDataDTO getCommonData() {
		return new CommonDataDTO(AboutUsWrapper.toAboutUsDTO(aboutUsDAO.getAboutUs()), EventInfoWrapper.toEventInfoDTO(eventInfoDAO.getAllEventInfo()));
	}

}
