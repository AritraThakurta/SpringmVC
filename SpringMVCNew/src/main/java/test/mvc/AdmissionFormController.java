package test.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdmissionFormController {
	
	/*@InitBinder
	public void initBinder(WebDataBinder binder){
		//binder.setDisallowedFields(new String[] {"studentDOB"});
		SimpleDateFormat format = new SimpleDateFormat("yyyy****MM****dd");
		binder.registerCustomEditor(Date.class, "studentDOB", new CustomDateEditor(format, false));
	}*/
	
	@RequestMapping(value = "/admissionForm",method =RequestMethod.GET)
	public ModelAndView getAdmissionForm(){
		
		ModelAndView mv = new ModelAndView("admissionForm");
		return mv;
		
	}
	
	@RequestMapping(value="/submitAdmissionForm",method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student student,BindingResult result){

		if(result.hasErrors()){
			ModelAndView mv1 = new ModelAndView("admissionForm");
			return mv1;
		}
		
		ModelAndView mv = new ModelAndView("admissionSuccessForm");
		mv.addObject("msg", "Admission Form submitted successfully");
		
		return mv;
	}

}
