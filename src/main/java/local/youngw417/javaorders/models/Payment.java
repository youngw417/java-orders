package local.youngw417.javaorders.models;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long paymentid;
    @Column(nullable = false)
    private String type;

    @ManyToMany(mappedBy = "payments")
    private Set<Order> orders = new HashSet<>();



    public Payment() {
    }

    public Payment(
            String type
    ) {
        this.type = type;
    }
}
