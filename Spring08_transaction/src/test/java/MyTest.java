import com.hu.mapper.UserMapper;
import com.hu.mapper.UserMapperImpl;
import com.hu.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void testCon(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        UserMapperImpl userMapperImpl = context.getBean("userMapperImpl", UserMapperImpl.class);
        List<User> users = userMapperImpl.getUsers();
        System.out.println(users);
    }
    @Test
    public void testTrasac(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("app.xml");
        UserMapper userMapperImpl =  context.getBean("userMapperImpl", UserMapper.class);
        userMapperImpl.addUser(new User("a021","老李","asasas"));
        userMapperImpl.delUserById("a021");

    }
}
