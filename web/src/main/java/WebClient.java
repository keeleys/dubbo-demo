import com.ttianjun.action.OrderAction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by keeley on 16/1/14.
 */
public class WebClient {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo.xml");
        ctx.start();

        OrderAction orderAction = (OrderAction) ctx.getBean("orderAction");
        orderAction.list();
    }
}

