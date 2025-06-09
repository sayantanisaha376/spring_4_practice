package annotationconfig.hibernate;

import jakarta.persistence.*;
import org.hibernate.annotations.SQLInsert;

@Entity
@Table(name = "payment_information")
//@SQLInsert(sql = "INSERT INTO payment_information (ID, NAME, AMOUNT) VALUES (?, ?, ?)")
public class PaymentInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "NAME")  // Match the DB column name exactly
    private String customerName;

    @Column(name = "AMOUNT")
    private double amount;

    public PaymentInfo() {}

    public PaymentInfo(String customerName, double amount) {
        this.customerName = customerName;  // correctly assign parameter
        this.amount = amount;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getCustomerName() { return customerName; }
    public void setCustomerName(String customerName) { this.customerName = customerName; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }
}
