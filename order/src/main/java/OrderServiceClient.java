import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * Created by keeley on 16/1/14.
 */
public class OrderServiceClient {
    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("dubbo.xml");
        ctx.start();
        System.in.read();
    }
}
