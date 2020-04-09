package com.demo.form.controller;

import java.util.ArrayList;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.demo.form.exception.UserNotFoundException;

@Controller
public class TestController {
	
	@Autowired
	TestRepository testRepository;
	@Autowired
	Form2Repository form2Repository;

	@GetMapping("/")
	public String showForm(Model model) {
		model.addAttribute("testModel", new TestModel());
		return "form";
	}
	
	@PostMapping("/addData")
	public String addData(@ModelAttribute("testModel")TestModel testModel) {
		testRepository.save(testModel);
		return "redirect:/?status=success";
	}
	
	@GetMapping("/form2")
	public String form2() {
		return "form2";
	}
	
	@PostMapping("/saveRecord")
	public String saveRecord(HttpServletRequest req) {
		String mobile = req.getParameter("mobile");
		String address = req.getParameter("address");
		String password = req.getParameter("password");
		FormModel form = new FormModel();
		form.setMobile(mobile);
		form.setAddress(address);
		form.setPassword(password);
		form2Repository.save(form);
		return "success";
	}
	
	@GetMapping("/viewRecords")
	public ModelAndView getrecord() {
		ArrayList<TestModel> records = new ArrayList<TestModel>();
		testRepository.findAll().forEach(records :: add);
		ModelAndView map =new ModelAndView("view");
		map.addObject("records", records);
		return map ;
		
	}
	
	@GetMapping("/find")
	public String search(Model model) {
		model.addAttribute("testModel",new TestModel());
		return "searchFile";
	}
	
	@PostMapping("/search")
	public ModelAndView getByName(HttpServletRequest req) {
//		 testRepository.findByName(req.getParameter("name"));
		 ModelAndView view = new ModelAndView("searchFile");
		 if(testRepository.findByName(req.getParameter("name")) != null){
			 view.addObject("result",testRepository.findByName(req.getParameter("name")) );
				return view;
		 }
		 else {
			 throw new UserNotFoundException(); 
		 }
		
	}
	
	@GetMapping("/delete/{id}")
	public ModelAndView ModelAndView(@PathVariable Long id) {
		ModelAndView delete = new ModelAndView("Delete" , HttpStatus.OK);
		
		testRepository.deleteById(id);
		return delete;
		
	}
}
