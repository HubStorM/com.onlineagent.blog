import com.framex.persistence.SpringContextUtil;
import com.framex.persistence.dao.DaoTypeEnum;
import com.framex.persistence.dao.jdbc.JdbcDaoFactory;
import com.framex.persistence.dao.orm.hibernate.HibernateSingletonDao;
import com.framex.soa.DefaultInit;
import com.onlineagent.blog.service.domain.Blog;
import com.onlineagent.blog.service.domain.Category;
import com.onlineagent.blog.service.domain.RBlogCategory;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import java.util.Map;

/**
 * @author lijie
 * @date 2017/10/23 20:46
 * @description
 */
public class Main {
    public static void main(String... args) {
        new DefaultInit().init("configuration.yaml");
        /*blog.setBlogGuid(UUID.randomUUID().toString());
        HibernateSingletonDao.INSTACNE.save(blog);*/
        Blog blog = HibernateSingletonDao.INSTACNE.findObject(Blog.class, "1");
        System.out.println(blog);
        Map<String, Object> object = JdbcDaoFactory.getDao(DaoTypeEnum.SINGLETON).findObject("select * from blog where blogguid = ?", "1");
        System.out.println(object);
        /*LocalSessionFactoryBean defaultSessionFactory = SpringContextUtil.getApplicationContext().getBean("defaultSessionFactory", LocalSessionFactoryBean.class);
        System.out.println(defaultSessionFactory.getHibernateProperties());*/

    }
}
