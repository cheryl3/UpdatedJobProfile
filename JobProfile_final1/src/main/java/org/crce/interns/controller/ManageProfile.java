package org.crce.interns.controller;


import org.crce.interns.beans.CriteriaBean;
import org.crce.interns.beans.JobBean;
import org.crce.interns.beans.TryBean;
import org.crce.interns.service.ManageProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
	//public ModelAndView addProfile(@ModelAttribute("profileBean")ProfileBean profileBean,BindingResult result) {
	  public ModelAndView addProfile(@RequestParam Map<> requestParams) throws Exception{
		//manageProfileService.addProfile(profileBean);
		
		manageProfileService.addProfile(jobBean);
		manageProfileService.addProfile(criteriaBean);
				
		return new ModelAndView("index");
	}
	

	@RequestMapping(value = "/addProfile", method = RequestMethod.GET)
	public ModelAndView createProfile(Model model) {
		//ProfileBean profileBean = new ProfileBean();
		 JobBean jobBean = new JobBean(); // declaring
		 CriteriaBean criteriaBean = new CriteriaBean();

         model.addAttribute("profileBean", jobBean); // adding in model
         model.addAttribute("profileBean", criteriaBean);

		return new ModelAndView("addProfile");
	}


}
