package com.example.ubsconnect.model;

import javax.persistence.*;

@MappedSuperclass
public class EntityId {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
