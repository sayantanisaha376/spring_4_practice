package annotationconfig.hibernate;

import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class HibernateConfig {


    private static SessionFactory sessionFactory;
    public static SessionFactory getSessionFactory() {
        if (sessionFactory == null) {
            try {
                Configuration configuration = new Configuration();

                // Hibernate settings equivalent to hibernate.cfg.xml's properties
                Properties settings = new Properties();
                settings.put(Environment.JAKARTA_JDBC_DRIVER, "oracle.jdbc.OracleDriver");
                settings.put(Environment.JAKARTA_JDBC_URL, "jdbc:oracle:thin:@localhost:1521:FREE");
                settings.put(Environment.JAKARTA_JDBC_USER, "c##scott");
                settings.put(Environment.JAKARTA_JDBC_PASSWORD, "tiger");
                settings.put(Environment.SHOW_SQL, "true");
                settings.put(Environment.FORMAT_SQL, "true");
                settings.put(Environment.HBM2DDL_AUTO, "create-drop");
                settings.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");

                configuration.setProperties(settings);
                configuration.addAnnotatedClass(PaymentInfo.class);
                sessionFactory=configuration.buildSessionFactory();
            } catch (HibernateException e) {
                System.out.println("Failed to create sessionFactory object." + e);
            }
            catch (Exception e) {
                System.out.println("general error ......." + e);
            }
        }
        return sessionFactory;
    }
}
