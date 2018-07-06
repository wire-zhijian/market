package zhijian.Model.Response;

public class JsonResponse {
	
	private String msg;
	private boolean success;
	private Object root;
	
	protected JsonResponse(){}

	public static JsonResponse newInstance4Simple(){
		return new JsonResponse();
	}
	
	public static JsonResponse newInstance4Error(Exception e){
		JsonResponse jr = new JsonResponse();
		jr.msg = e.getMessage();
		jr.success = false;
		
		return jr;
	}
	
	public static JsonResponse newInstance4Root(Object obj){
		JsonResponse jr = new JsonResponse();
		jr.root = obj;
		jr.success = false;
		
		return jr;
	}
	
	public static JsonResponse newInstance4Msg(String msg, boolean success){
		JsonResponse jr = new JsonResponse();
		jr.msg = msg;
		jr.success = success;
		
		return jr;
	}
	
	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public boolean getSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public Object getRoot() {
		return root;
	}

	public void setRoot(Object root) {
		this.root = root;
	}
}
