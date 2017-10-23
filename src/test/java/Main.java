import com.framex.persistence.dao.hibernate.HibernateSingletonDao;
import com.framex.soa.DefaultInit;

/**
 * @author lijie
 * @date 2017/10/23 20:46
 * @description
 */
public class Main {
    public static void main(String... args) {
         new DefaultInit().init("configuration.yaml");
        //HibernateSingletonDao.INSTACNE.;
    }
}
