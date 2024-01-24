package hellojpa;

import jakarta.persistence.*;

@Entity
public class Delivery {

    @Id @GeneratedValue
    private Long id;

    @OneToOne(mappedBy = "delivery")
    private Order order;

    private String city;

    private String zipcode;

    @Enumerated(EnumType.STRING)
    private DeliveryStatus status;
}
