package entity;

import entity.CustomerDetails;
import entity.Order;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "customers")
public class Customer {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "usernames")
    private String username;

    @Column(name = "wish_list")
    private List <Order> wishList;

    @Column(name = "purchase_history")
    private String purchaseHistory;
    private String email;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "customer")
    private List <Order> order;

    @OneToOne
    @Column(name = "customer_details")
    private CustomerDetails customerDetails;
}