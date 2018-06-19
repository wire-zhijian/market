package zhijian.Service.User;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import zhijian.Dao.User.UserDao;
import zhijian.Model.User.User;

@Service("userService")
public class UserService {
	@Resource
	private UserDao userDao;

	public void insert(User user){
		userDao.insert(user);
	}
}
