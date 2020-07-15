package cn.kgc;

import cn.kgc.entity.User;
import cn.kgc.mapper.UserMapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        try {
         //读取配置
            Reader reader = Resources.getResourceAsReader("mybatis.xml");
            //通过会话工厂的建造器生成一个会话工厂（根据连接参数与数据库建立连接）
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            //打开一个会话（从连接池获取一个连接）
            SqlSession sqlSession = sqlSessionFactory.openSession();
            //获取UserMapper实例（使用的代理模式生成一个实现类）
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

          List<User> list = userMapper.selectAllUsers();
          for (User user : list ) {
              System.out.println(user.getName()+"----"+user.getPassword()+"----"+user.getSex());
          }

        sqlSession.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
