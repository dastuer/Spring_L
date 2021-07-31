import com.hu.pojo.Hello;
import com.hu.pojo.Student;
import com.hu.pojo.User;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testBeans(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
        Hello hello = (Hello) context.getBean("hello");
        hello.say();
        User user = (User) context.getBean("user");
        System.out.println(user.getAge());
    }
    @Test
    public void testDI(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("studentbeans.xml");
        Student s01 = (Student) context.getBean("s01");
        System.out.println(s01);
    }
    @Test
    public void test_PC_DI(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");
        User u02 = context.getBean("u02", User.class);
        User u03 = context.getBean("u02", User.class);
        System.out.println(u02==u03);
        System.out.println(u03);


    }
}
