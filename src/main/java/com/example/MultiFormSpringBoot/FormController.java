package com.example.MultiFormSpringBoot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FormController {
	
	@Autowired
	FormService formService;
	@GetMapping("/register")
	public String displayForm(Model model){
		User user = new User();
		model.addAttribute("user",user);
		List<String> professionList = Arrays.asList("Male","Female","Others");
		model.addAttribute("professionList",professionList);
		return "form";
	}
	@PostMapping("/submit")
	public String submitForm(@ModelAttribute("user") User user){
		System.out.println(user);
		formService.save(user);
		return "preview";
	}
}
