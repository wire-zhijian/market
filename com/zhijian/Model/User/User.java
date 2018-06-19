package zhijian.Model.User;

public class User {
	private int id;
	private String userName;
	private String password;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getUserName() {
		
		if(this.userName == null){
			return "";
		}
		
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	public String getPassword() {
		
		if(this.password == null){
			return "";
		}
		
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
}
