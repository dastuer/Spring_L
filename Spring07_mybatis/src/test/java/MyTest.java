import com.hu.mapper.UserMapper;
import com.hu.pojo.User;
import lombok.SneakyThrows;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.Resource;

import java.io.FileReader;
import java.io.InputStream;
import java.util.List;


public class MyTest {
    @SneakyThrows
    @Test
    public void testMybatis(){

        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        InputStream res = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory factory = builder.build(res);
        SqlSession sqlSession = factory.openSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        List<User> users = mapper.getUsers();
        System.out.println(users);
        sqlSession.close();
    }
    @Test
    public void testSpringMybatis(){
        ClassPathXmlApplicationContext con = new ClassPathXmlApplicationContext("app.xml");
        UserMapper userMapper = con.getBean("userMapper2",UserMapper.class);
        System.out.println(userMapper.getUsers());
    }
}
