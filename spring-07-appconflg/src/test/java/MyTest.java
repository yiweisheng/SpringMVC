import com.yi.config.YiConfig;
import com.yi.pojo.User;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyTest {
    @Test
    public void test() {
        //如果完全使用了配置类方式去做，我们就只能通过AnnotationConfig 上下万来获取容器，通过类的class对象加载！
        ApplicationContext context = new AnnotationConfigApplicationContext(YiConfig.class);
        User user = (User) context.getBean("getUser");
        System.out.println(user.getName());
    }
}
