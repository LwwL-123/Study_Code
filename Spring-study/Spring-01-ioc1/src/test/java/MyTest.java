import com.dao.UserDaoMysqlImpl;
import com.dao.UserDaoimpl;
import com.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {

        //用户实际调用的是业务层,dao层他们不需要接触
//        UserServiceImpl userService = new UserServiceImpl();
//        userService.setUserDao(new UserDaoMysqlImpl());
//        userService.getUser();

        //获取ApplicationContext;
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        UserServiceImpl userServiceImpl = (UserServiceImpl) context.getBean("userServiceImpl");
        userServiceImpl.getUser();
    }
}
