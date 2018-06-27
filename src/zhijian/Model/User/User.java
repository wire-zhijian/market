package zhijian.Model.User;

public class User {
	
	public static class InsertBuilder{
		private String userName;
		private String password;
		private String mobile;
		
		public InsertBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		
		public InsertBuilder setPassword(String password) {
			this.password = password;
			return this;
		}
		
		public InsertBuilder setMobile(String mobile) {
			this.mobile = mobile;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
	}
	
	public static class UpdateBuilder{
		private final int id;
		private String password;
		private String mobile;
		private String email;
		
		public UpdateBuilder(int id){
			this.id = id;
		}
		
		public UpdateBuilder setPassword(String password) {
			this.password = password;
			return this;
		}
		
		public UpdateBuilder setMobile(String mobile){
			this.mobile = mobile;
			return this;
		}
		
		public UpdateBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public User build(){
			return new User(this);
		}
	}
	
	private int id;
	private String userName;
	private String password;
	private String mobile;
	private String email;
	
	public User(int id){
		this.id = id;
	}
	
	public User(InsertBuilder builder){
		this.userName = builder.userName;
		this.password = builder.password;
		this.mobile = builder.mobile;
	}
	
	public User(UpdateBuilder builder){
		this.id = builder.id;
		this.password = builder.password;
		this.mobile = builder.mobile;
		this.email = builder.email;
	}
	
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

	public String getMobile() {
		if(mobile != null){
			return mobile;
		}else{
			return "";
		}
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		if(email != null){
			return email;
		}else{
			return "";
		}
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
