package zhijian.Controller.Shop;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import zhijian.Model.Shop.Shop;
import zhijian.Service.Shop.ShopService;

@Controller
public class ShopController {

	@Resource
	private ShopService shopService;
	
	@RequestMapping("/shop/insert.action")
	public String insert(HttpServletRequest request){
		final String name = request.getParameter("name");
		final String expireDate = request.getParameter("expireDate");
		final String tel = request.getParameter("tel");
		final String address = request.getParameter("address");
		
		shopService.insert(new Shop.InsertBuilder().setName(name)
												   .setExpireDate(expireDate)
												   .setTel(tel)
												   .setAddress(address));
		
		return "/WEB-INF/pages/user.html";
	}
	
	@RequestMapping("/shop/search.action")
	public String search(HttpServletRequest request){
//		final String id = request.getParameter("id");
				
//		System.out.println(shopService.search(new Shop.SearchBuilder()));
		
		return "/WEB-INF/pages/user.html";
	}
}
