import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void testAnno(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("application.xml");

    }
}
