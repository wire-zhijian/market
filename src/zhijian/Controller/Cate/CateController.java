package zhijian.Controller.Cate;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import zhijian.Model.Cate.Cate;
import zhijian.Model.Response.JsonResponse;

@Controller
public class CateController {
	
	@RequestMapping(value="/cate/insert.action")
	@ResponseBody
	public JsonResponse insert() throws IOException{
		JsonResponse jr = JsonResponse.newInstance4Msg("zhijian", true);
		
		return jr;
	}
	
	public String update(){
		return "";
	}
	
	public String delete(){
		return "";
	}
	
	@RequestMapping(value="/cate/getById")
	@ResponseBody
	public Cate getById(){
		return null;
	}
}
