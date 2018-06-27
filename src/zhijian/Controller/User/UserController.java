package zhijian.Controller.User;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zhijian.Model.User.User;
import zhijian.Service.User.UserService;

@Controller

public class UserController {

	@Resource
	UserService userService;
	
	@RequestMapping(value="/user.action")
	public String user(){
		return "/WEB-INF/pages/user.html";
	}
	
	@RequestMapping(value="/insertUser.action")
	public String insert(HttpServletRequest request){
		final String name = request.getParameter("name");
		final String password = request.getParameter("password");
		final String mobile = request.getParameter("mobile");
		
		User.InsertBuilder builder = new User.InsertBuilder();
		
		userService.insert(builder.setUserName(name)
								  .setPassword(password)
								  .setMobile(mobile));
		
		return "/WEB-INF/pages/user.html";
	}
	
	@RequestMapping(value="/updateUser.action")
	public String update(HttpServletRequest request){
		final String id = request.getParameter("id");
//		final String name = request.getParameter("name");
		final String password = request.getParameter("password");
		final String mobile = request.getParameter("mobile");
		final String email = request.getParameter("email");
		
		User.UpdateBuilder builder = new User.UpdateBuilder(Integer.parseInt(id));
		
		userService.update(builder.setPassword(password)
								  .setMobile(mobile)
								  .setEmail(email));
		
		return "/WEB-INF/pages/user.html";
	}
}
