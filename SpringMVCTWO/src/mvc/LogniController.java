package mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LogniController {
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String login() {
		return "Login";
	}
	
	@RequestMapping(value="/login" , method = RequestMethod.POST)
	public ModelAndView validate(@RequestParam("username") String user,@RequestParam("password") String pass){
		ModelAndView mav=new ModelAndView();
		if(user.equals("admin")&&pass.equals("admin"))
			mav.setViewName("Admin");
		else mav.setViewName("User");
		mav.addObject("username", user);
		return mav;
	}
}
