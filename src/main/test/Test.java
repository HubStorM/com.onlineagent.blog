import com.framex.persistence.SpringContextUtil;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;

/**
 * @author lijie
 * @date 2017/10/23 15:55
 * @description
 */
public class Test {
    public static void main(String... args) throws Exception{
        new ClassPathXmlApplicationContext("frame-persistence.xml");
        DataSource dataSource = SpringContextUtil.getApplicationContext().getBean("dataSource", DataSource.class);
        System.out.println(dataSource.getConnection());
    }
}
