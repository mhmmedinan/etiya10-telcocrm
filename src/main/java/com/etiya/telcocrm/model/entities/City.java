package com.etiya.telcocrm.model.entities;

import com.etiya.telcocrm.core.entities.BaseEntity;
import jakarta.persistence.*;
import java.util.List;


@Entity
@Table(name = "cities")
public class City extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "name",unique = true)
    private String name;

    @OneToMany(mappedBy = "city")
    private List<District> districts;

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

    public City(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public City() {
    }
}


