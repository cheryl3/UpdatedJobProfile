package org.crce.interns.service.impl;


import org.crce.interns.beans.ProfileBean;
import org.crce.interns.dao.ManageProfileDao;
import org.crce.interns.model.Profile;
import org.crce.interns.service.ManageProfileService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service("manageProfileService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ManageProfileServiceImpl implements ManageProfileService{
	
	@Autowired
	private ManageProfileDao manageProfileDao;

	@Transactional(propagation = Propagation.REQUIRED, readOnly = false)
	public void addProfile(ProfileBean profileBean) {
		// TODO Auto-generated method stub
		Profile profile = new Profile();
		BeanUtils.copyProperties(profileBean, profile);
		//profile.setRole_id("1");

		manageProfileDao.createProfile(profile);
	}

}
