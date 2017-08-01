package iq.ven.cms.common.configurations.context;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
    private static final Logger logger = Logger.getLogger(AppContext.class);

    @Bean(name = "sessionFactoryBean")
    SessionFactory sessionFactory() {
        SessionFactory sessionFactory = new org.hibernate.cfg.Configuration().configure("/config/hibernate.cfg.xml").buildSessionFactory();
        logger.debug("DBSetupSessionFactory.sessionFactory Session factory set up complete. " + sessionFactory);
        return sessionFactory;
    }

}
