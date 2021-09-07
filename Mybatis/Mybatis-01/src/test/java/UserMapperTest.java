import com.Lee.Dao.UserMapper;
import com.Lee.pojo.User;
import com.Lee.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UserMapperTest {
    @Test
    public void test(){
        //第一步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        //方式一：getMapper
//        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
//        List<User> userList = userDao.getUserList();

        //方式二
        List<User> userList = sqlSession.selectList("com.Lee.Dao.UserMapper.getUserList");

        for (User user:userList) {
            System.out.println(user);
        }

        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        User userById = mapper.getUserById(1);
        System.out.println(userById);

        sqlSession.close();
    }

    //插入
    //增删改需要提交事务
    @Test
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        int res = mapper.addUser(new User(4, "hhh", "111"));
        if(res>0)
            System.out.println(
                    "插入成功"
            );
        //提交事务
        sqlSession.commit();
        sqlSession.close();
    }

    //插入2
    @Test
    public void addUser2(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        Map<String, Object> map = new HashMap<>();
        map.put("userid",5);
        map.put("username","lwwl");
        map.put("pwd","111");
        mapper.addUser2(map);
        sqlSession.commit();
        sqlSession.close();
    }

    //修改
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.updateUser(new User(4,"lll","111"));

        sqlSession.commit();
        sqlSession.close();
    }

    //删除
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        mapper.deleteUser(4);

        sqlSession.commit();
        sqlSession.close();
    }
}