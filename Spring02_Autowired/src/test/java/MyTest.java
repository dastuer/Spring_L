import com.hu.pojo.Human;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testAutoWired(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("bean.xml");
        Human me = context.getBean("me", Human.class);
        System.out.println(me);
        me.getCat().meow();
        me.getDog().bark();

    }
}
