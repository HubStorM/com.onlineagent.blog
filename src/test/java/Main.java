import com.framex.persistence.dao.DaoTypeEnum;
import com.framex.persistence.dao.jdbc.BeanInfoHelper;
import com.framex.persistence.dao.jdbc.JdbcDaoFactory;
import com.framex.soa.DefaultInit;
import com.onlineagent.blog.service.domain.Blog;
import org.reflections.Reflections;
import org.reflections.scanners.SubTypesScanner;

import java.util.UUID;

/**
 * @author lijie
 * @date 2017/10/23 20:46
 * @description
 */
public class Main {
    public static void main(String... args) {
        //new DefaultInit().init("configuration.yaml");
        /*blog.setBlogGuid(UUID.randomUUID().toString());
        HibernateSingletonDao.INSTACNE.save(blog);*/
        /*Blog blog = HibernateSingletonDao.INSTACNE.findObject(Blog.class, "1");
        System.out.println(blog);
        Map<String, Object> object = JdbcDaoFactory.getDao(DaoTypeEnum.SINGLETON).findObject("select * from blog where blogguid = ?", "1");
        System.out.println(object);*/
        /*LocalSessionFactoryBean defaultSessionFactory = SpringContextUtil.getApplicationContext().getBean("defaultSessionFactory", LocalSessionFactoryBean.class);
        System.out.println(defaultSessionFactory.getHibernateProperties());*/

        /*Map<String, String> a = new HashMap<>();
        Map<String, String> b = a;

        a.put("a", "a");
        System.out.println(b.get("a"));*/

        /*Table declaredAnnotation = RBlogCategory.class.getDeclaredAnnotation(Table.class);
        System.out.println(declaredAnnotation.name());*/

        /*new DefaultInit().init("configuration.yaml");
        Blog blog = new Blog();
        blog.setBlogGuid(UUID.randomUUID().toString());
        JdbcDaoFactory.getDao(DaoTypeEnum.SINGLETON).insert(blog);
        blog.setContent("12345");
        JdbcDaoFactory.getDao(DaoTypeEnum.SINGLETON).update(blog);*/

        /*Reflections reflections = new Reflections("com.onlineagent.blog.service.domain", Blog.class.getClassLoader(), new SubTypesScanner(false));
        System.out.println(reflections.getSubTypesOf(Object.class));*/

        new DefaultInit().init("configuration.yaml");
        System.out.println(JdbcDaoFactory.getDao(DaoTypeEnum.SINGLETON).findList("select * from blog", 1, 1, Blog.class, null));
        System.out.println(JdbcDaoFactory.getDao(DaoTypeEnum.SINGLETON).findList("select * from blog", 1, 1, null));
    }
}
