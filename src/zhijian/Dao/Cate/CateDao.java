package zhijian.Dao.Cate;

import zhijian.Model.Cate.Cate;

public interface CateDao {
	public int insert(Cate cate);
	
	public void update(Cate cate);
	
	public void getById(int id);
	
	public void delete(Cate cate);
}
