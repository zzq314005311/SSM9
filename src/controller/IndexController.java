package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
   
	@RequestMapping("/index.html")
	public String index(String name,Model mo){
		mo.addAttribute("name", name);
		System.out.println("name"+name);
		return "index";
	}
}
