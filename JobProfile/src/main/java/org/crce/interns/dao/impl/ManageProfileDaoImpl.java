package org.crce.interns.dao.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import org.crce.interns.beans.ProfileBean;
import org.crce.interns.dao.ManageProfileDao;
import org.crce.interns.model.Profile;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("manageProfileDao")

public class ManageProfileDaoImpl implements ManageProfileDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	public void createProfile(Profile profile) {
		// TODO Auto-generated method stub

		sessionFactory.getCurrentSession().saveOrUpdate(profile);	
	}

}
