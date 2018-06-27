package zhijian.Service.Cate;

import javax.annotation.Resource;

import zhijian.Dao.Cate.CateDao;
import zhijian.Model.Cate.Cate;

public class CateService {

	@Resource
	private CateDao cateDao;
	
	public void insert(Cate cate){
		cateDao.insert(cate);
	}
	
	public void update(Cate cate){
		cateDao.update(cate);
	}
	
	public void getById(int id){
		cateDao.getById(id);
	}
	
	public void delete(Cate cate){
		cateDao.delete(cate);
	}
}
