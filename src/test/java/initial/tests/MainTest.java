package initial.tests;

import iq.ven.cms.common.configurations.context.AppContext;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
public class MainTest {


    @Test
    public void testTest() {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppContext.class);
        SessionFactory sessionFactory = (SessionFactory) ctx.getBean("sessionFactoryBean");

        Session session = null;
        sessionFactory.openSession();
        session.beginTransaction();
//code
        session.close();
    }


}
