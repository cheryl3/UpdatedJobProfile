package org.crce.interns.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.crce.interns.beans.ProfileBean;
import org.crce.interns.model.Profile;
import org.crce.interns.service.ManageProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ManageProfile {
	
	@Autowired
	private ManageProfileService manageProfileService;
	
	@RequestMapping("/")
	public ModelAndView welcome() {
				return new ModelAndView("index");
	}
	
	
	@RequestMapping(value = "/saveProfile", method = RequestMethod.POST)
	public ModelAndView addProfile(@ModelAttribute("profileBean")ProfileBean profileBean,BindingResult result) {
		manageProfileService.addProfile(profileBean);
		
		
		try
	    {
	      // create a java mysql database connection
	      String myDriver = "org.postgresql.Driver";
	      String myUrl = "jdbc:postgresql://localhost:5432/placementdb";
	      Class.forName(myDriver);
	      Connection conn = DriverManager.getConnection(myUrl, "postgres", "root");
	     
	      // create the java mysql update preparedstatement
	      String query = "update job_schema.criteria set company_id=?";
	      PreparedStatement preparedStmt = conn.prepareStatement(query);
	      preparedStmt.setString(1,profileBean.getCompany_id());
	 
	      // execute the java preparedstatement
	      preparedStmt.executeUpdate();
	      
	      /*
	      String query2 = "update job_schema.job set criteria_id=?";
	      PreparedStatement preparedStmt2 = conn.prepareStatement(query2);
	      preparedStmt2.setString(1,profileBean.getCriteria_id());
	 
	      // execute the java preparedstatement
	      preparedStmt2.executeUpdate();

	       */
	      conn.close();
	    }
	    catch (Exception e)
	    {
	      System.err.println("Got an exception! ");
	      System.err.println(e.getMessage());
	    }
	  

		
		return new ModelAndView("index");
	}
	

	@RequestMapping(value = "/addProfile", method = RequestMethod.GET)
	public ModelAndView createProfile(Model model) {
		 ProfileBean profileBean = new ProfileBean(); // declaring

         model.addAttribute("profileBean", profileBean); // adding in model

		return new ModelAndView("addProfile");
	}


}
