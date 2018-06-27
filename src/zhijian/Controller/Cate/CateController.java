package zhijian.Controller.Cate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zhijian.Model.Cate.Cate;

public class CateController {
	public String insert(){
		return "";
	}
	
	public String update(){
		return "";
	}
	
	public String delete(){
		return "";
	}
	
	@RequestMapping(value="getById")
	@ResponseBody
	public Cate getById(){
		return null;
	}
}
