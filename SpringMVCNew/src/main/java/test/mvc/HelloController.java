package test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloController {

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello World");
		return "hello";

	}

	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	public String printHello(ModelMap model) {

		model.addAttribute("message", "Spring 3 MVC Hello Aritra");
		return "hello2";

	}
	
	@RequestMapping(value = "/hello/{name}", method = RequestMethod.GET)
	public String printHellowithPathvariable(ModelMap model,@PathVariable(value="name") String name) {

		model.addAttribute("message", "Spring 3 MVC Hello Aritra with name" + name);
		return "hello3";

	}
}
