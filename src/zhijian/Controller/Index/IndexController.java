package zhijian.Controller.Index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@RequestMapping(value="/login.action")
	public ModelAndView index(){
		
		ModelAndView mdv = new ModelAndView("/WEB-INF/pages/user.html");
		
		mdv.addObject("message", "wo ai ni ");
		
		return mdv;
	}
}
