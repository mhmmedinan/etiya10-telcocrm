package com.etiya.telcocrm.model.entities;


import com.etiya.telcocrm.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "customers")
@Inheritance(strategy = InheritanceType.JOINED)
public class Customer extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "customer_number")
    private String customerNumber;

    @OneToMany(mappedBy = "customer")
    private List<Address> addresses;


    @PrePersist
    public void generateCustomerNumber(){
        String prefix = "CUST-";
        String year = String.valueOf(java.time.Year.now().getValue());
        String randomPart = String.format("%04d",new java.util.Random().nextInt(10000));
        this.customerNumber = prefix + year + "-" + randomPart;
    }
}
