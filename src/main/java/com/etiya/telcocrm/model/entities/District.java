package com.etiya.telcocrm.model.entities;

import com.etiya.telcocrm.core.entities.BaseEntity;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "districts")
public class District extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    @OneToMany(mappedBy = "district")
    private List<Address> addresses;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public District() {
    }
}
