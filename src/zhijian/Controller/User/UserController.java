package zhijian.Controller.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zhijian.Model.User.User;
import zhijian.Service.User.UserService;

@Controller

public class UserController {
//	public 

	@Resource
	UserService userService;
	
	@RequestMapping(value="/user.action")
	public String user(){
		return "/WEB-INF/pages/user.html";
	}
	
	@RequestMapping(value="/insertUser.action")
	public String insert(HttpServletRequest request){
		System.out.println(request.getParameter("name") + "-----------" + request.getParameter("password"));
		
		User user = new User();
		user.setUserName(request.getParameter("name"));
		user.setPassword(request.getParameter("password"));
		
		userService.insert(user);
		return "/WEB-INF/pages/user.html";
	}
}
