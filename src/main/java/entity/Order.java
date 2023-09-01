package entity;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column( name = "orders_id")
    private int ordersId;

    @Column(name = "orders_name")
    private String orderName;
    @Column(name = "orders_sum")
    private String orderSum;
    @Column(name = "orders_list")
    private List<Order> orderList;

    @ManyToOne
    private Customer customer;

    @ManyToMany
    private List<OrderDetails> orderDetails;

}