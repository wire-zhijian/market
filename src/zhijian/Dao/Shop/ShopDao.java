package zhijian.Dao.Shop;

import java.util.List;

import zhijian.Model.Shop.Shop;

public interface ShopDao {
	public int insert(Shop shop);
	
	public void update(Shop shop);
	
	public List<Shop> search(Shop.SearchBuilder builder);
}
