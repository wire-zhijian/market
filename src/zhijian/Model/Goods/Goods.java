package zhijian.Model.Goods;

import zhijian.Model.Cate.Cate;

public class Goods {
	private int id;
	private Cate cate;
	private String name;
	private String code;
	private String desc;
	private float price;
	
	public Goods(){}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public Cate getCate() {
		return cate;
	}
	
	public void setCate(Cate cate) {
		this.cate = cate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
}
