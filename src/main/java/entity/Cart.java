package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

    @Entity
    @Getter
    @Setter
    @Table(name = "carts")
    public class Cart {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer id;

        @Column( name = "carts_id")
        private int cartsId;

        @Column(name = "name_goods")
        private String nameGoods;

        @Column(name = "orders_sum")
        private int orderSum;


        @Column(name = "order_details")
        private List<OrderDetails> orderDetails;

        @OneToMany
        Order order;

        @ManyToMany
        @JoinTable(name = "name_goods",
                joinColumns = @JoinColumn(name = "orders_details"),
                inverseJoinColumns = @JoinColumn(name = "orders_id"))
        private List<Order> orderList;
    }
