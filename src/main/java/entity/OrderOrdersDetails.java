package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
@Entity
@Getter
@Setter
@Table(name = "orders_o_details")
public class OrderOrdersDetails {

    @Id
    private Integer id;

    @Column(name = "orders_id")
    private int ordersId;

    @Column(name = "orders_details_id")
    private String orderDetail;

}