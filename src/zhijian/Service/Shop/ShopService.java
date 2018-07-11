package zhijian.Service.Shop;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zhijian.Dao.Shop.ShopDao;
import zhijian.Model.Shop.Shop;

@Service(value="shopService")
public class ShopService {
	
	@Resource
	private ShopDao shopDao;

	public int insert(Shop.InsertBuilder builder){
		Shop shop = builder.build();
		shopDao.insert(shop);
		
		return shop.getId();
	}
	
	public void update(Shop shop){
		shopDao.update(shop);
	}
	
	public List<Shop> search(Shop.SearchBuilder builder){
		return shopDao.search(builder);
	}
}
