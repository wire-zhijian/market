package zhijian.Controller.Index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {
	
	@RequestMapping("/login")
	public String index(){
		return "/WEB-INF/pages/index.html";
	}
}
