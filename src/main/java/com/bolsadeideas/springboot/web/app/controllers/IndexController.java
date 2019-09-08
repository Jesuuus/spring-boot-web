package com.bolsadeideas.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/app")
public class IndexController {
	
	@GetMapping({"/index", "/", "/home", ""})
	public ModelAndView index(ModelAndView mv) {
		//los dos primeros devuelven string y retornan "index"
		//model.addAttribute("titulo", "Hola Spring Framework"); con ModelMap o Model
		//map.put("titulo", "Hola Spring Framework"); con Map<String,Object>
		mv.addObject("titulo", "Hola Spring Framework"); 
		mv.setViewName("index");
		return mv;
	}
	
}
