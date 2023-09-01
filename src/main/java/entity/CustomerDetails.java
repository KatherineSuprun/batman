package entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "customers_details")
public class CustomerDetails {

    @Id
    @Column(name = "id")

    private String usernames;
    @Column (name = "customers_id")
    public int customerId;
    private String email;
    private Integer phone;

    @Column(name = "bonus_card")
    private char bonusCard;
    @Column(name = "client_address")
    private String clientAddress;

    @OneToOne
    private Customer customer;

}