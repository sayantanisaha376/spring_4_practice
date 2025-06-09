package annotationconfig.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PaymentDAO {

    @Autowired
    private SessionFactory sessionFactory;

    public void save(String customerName, Double amount) {
        Session session = sessionFactory.getCurrentSession();
        Transaction tx = session.beginTransaction();  // Start transaction

        PaymentInfo info = new PaymentInfo(customerName, amount);
        session.save(info);  // Save entity

        tx.commit();  // Commit transaction
        System.out.println("Saved to DB: " + customerName + " Rs" + amount);
    }
}
