import com.yi.pojo.User;
import com.yi.pojo.UserT;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");

        UserT user = (UserT) context.getBean("u1");
        UserT user2 = (UserT) context.getBean("u4");
        System.out.println(user==user2);

    }
}
