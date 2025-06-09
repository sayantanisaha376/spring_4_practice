package annotationconfig;

import annotationconfig.hibernate.HibernateConfig;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
@ComponentScan(basePackages = "annotationconfig.hibernate")

public class Application_Annotation_Config {

    @Bean
    public SessionFactory sessionFactory() {
        return HibernateConfig.getSessionFactory();
    }
}
