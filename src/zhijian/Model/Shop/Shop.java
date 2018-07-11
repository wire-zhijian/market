package zhijian.Model.Shop;

import zhijian.Util.DateUtil;

public class Shop{
	
	public static class SearchBuilder{
		private int id;

		public int getId() {
			return id;
		}

		public SearchBuilder setId(int id) {
			this.id = id;
			return this;
		}
	}
	
	public static class InsertBuilder{
		private String name;
		private long expireDate;
		private String tel;
		private String address;
		
		public InsertBuilder setName(String name) {
			this.name = name;
			return this;
		}
		
		public InsertBuilder setExpireDate(long expireDate) {
			this.expireDate = expireDate;
			return this;
		}
		
		public InsertBuilder setExpireDate(String expireDate){
			this.expireDate = DateUtil.parseDate(expireDate);
			return this;
		}
		
		public InsertBuilder setTel(String tel) {
			this.tel = tel;
			return this;
		}
		
		public InsertBuilder setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public Shop build(){
			return new Shop(this);
		}
	}
	
	private int id;
	private String name;
	private long createDate;
	private long expireDate;
	
	private String tel;
	private String address;
	
	public Shop(int id){
		this.id = id;
	}
	
	public Shop(InsertBuilder builder){
		this.name = builder.name;
		this.expireDate = builder.expireDate;
		this.tel = builder.tel;
		this.address = builder.address;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getCreateDate() {
		return createDate;
	}
	
	public void setCreateDate(long createDate) {
		this.createDate = createDate;
	}
	
	public long getExpireDate() {
		return expireDate;
	}
	
	public String getExpireDateFormat(){
		return DateUtil.format(expireDate);
	}
	
	public void setExpireDate(long expireDate) {
		this.expireDate = expireDate;
	}
	
	public String getTel() {
		return tel;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	@Override
	public String toString() {
		return "id : " + id + ", name :" + name;
	}
	
	@Override
	public int hashCode() {
		return this.id * 31 + 17;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj != null && obj instanceof Shop){
			return this.id == ((Shop)obj).id;
		}else{
			return false;
		}
	}
}