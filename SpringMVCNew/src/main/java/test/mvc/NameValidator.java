package test.mvc;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class NameValidator implements ConstraintValidator<IsValidName,String>{

	private String listOfvalidNames;
	@Override
	public void initialize(IsValidName constraintAnnotation) {
		// TODO Auto-generated method stub
		this.listOfvalidNames = constraintAnnotation.listofValidNames();
	}

	@Override
	public boolean isValid(String name, ConstraintValidatorContext context) {
		// TODO Auto-generated method stub
		if(name == null){
			return false;
		}
		
		if(name.matches(listOfvalidNames)){
			return true;
		}
		else{
			return false;
		}
		
	}
	
	

}
