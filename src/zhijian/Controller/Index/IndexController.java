package zhijian.Controller.Index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping(value="/login.action")
	public String index(){
		return "/WEB-INF/pages/index.html";
	}
}
