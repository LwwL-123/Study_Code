package com.Lee.Dao;

import com.Lee.Dao.UserDao;
import com.Lee.pojo.User;
import com.Lee.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步：获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //执行sql
        //方式一：getMapper
        UserDao userDao = sqlSession.getMapper(UserDao.class);
        List<User> userList = userDao.getUserList();
        for (User user:userList) {
            System.out.println(user);
        }

        //关闭sqlSession
        sqlSession.close();
    }
}
