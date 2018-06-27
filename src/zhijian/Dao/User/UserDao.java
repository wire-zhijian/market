package zhijian.Dao.User;

import zhijian.Model.User.User;

public interface UserDao {
	public int insert(User user);
	
	public void update(User user);
	
//	public User getByCond();
	public User getById(int id);
}
