package zhijian.Test.User;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import zhijian.Model.User.User;
import zhijian.Service.User.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:zhijian/Config/spring-mybatis.xml" })
public class UserTest {
	@Resource
	private UserService userService;

	@Test
	public void test(){
		User user = new User();
		user.setUserName("zhijian");
		user.setPassword("123");
		
		userService.insert(user);
	}
}
