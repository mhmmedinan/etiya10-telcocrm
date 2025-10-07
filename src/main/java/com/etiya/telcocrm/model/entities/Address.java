package com.etiya.telcocrm.model.entities;

import com.etiya.telcocrm.core.entities.BaseEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "addresses")
public class Address extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "street",nullable = false)
    private String street;

    @Column(name = "houseNumber",nullable = false)
    private String houseNumber;

    @Column(name = "description",nullable = false)
    private String description;

    @Column(name = "isDefault",nullable = false)
    private boolean isDefault;

    @ManyToOne()
    @JoinColumn(name ="district_id")
    private District district;

    @ManyToOne()
    @JoinColumn(name ="customer_id")
    private Customer customer;

}
