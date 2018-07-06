package zhijian.Model.OrderGoods;

import zhijian.Model.Goods.Goods;

public class OrderGoods {
	
	public static class InsertBuilder{
		private int orderId;
		private Goods goods;
		private float count;
		private float price;
		
		public InsertBuilder(int orderId, Goods goods, float count, float price){
			this.orderId = orderId;
			this.goods = goods;
			this.count = count;
			this.price = price;
		}
		
		public OrderGoods build(){
			return new OrderGoods(this);
		}
	}
	
	private int id;
	private int orderId;
	private Goods goods;
	private float count;
	private float price;
	private long date;
	
	public OrderGoods(){}
	
	public OrderGoods(InsertBuilder builder){
		this.orderId = builder.orderId;
		this.goods = builder.goods;
		this.count = builder.count;
		this.price = builder.price;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getOrderId() {
		return orderId;
	}
	
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	
	public Goods getGoods() {
		return goods;
	}
	
	public void setGoods(Goods goods) {
		this.goods = goods;
	}
	
	public float getCount() {
		return count;
	}
	
	public void setCount(float count) {
		this.count = count;
	}
	
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	
	public long getDate() {
		return date;
	}
	
	public void setDate(long date) {
		this.date = date;
	}
}