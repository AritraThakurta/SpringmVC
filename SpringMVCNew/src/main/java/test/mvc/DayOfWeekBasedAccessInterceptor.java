package test.mvc;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class DayOfWeekBasedAccessInterceptor implements HandlerInterceptor {

	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
		
		Calendar cal = Calendar.getInstance();
		
		int dayofWeek = cal.get(cal.DAY_OF_WEEK);
		 if(dayofWeek == 4){
			 response.getWriter().write("This website is closed on wednesday");
			 
			 return false;
		 }
		// TODO Auto-generated method stub
		return true;
	}

}
