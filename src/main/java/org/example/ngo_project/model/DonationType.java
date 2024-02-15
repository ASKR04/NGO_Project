package org.example.ngo_project.model;

import jakarta.persistence.*;

@Entity
public class DonationType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Enumerated(EnumType.STRING)
    @Column(name = "Type")
    private typeName typeName;

    public enum typeName{
        CASH,CREDIT
    }
}


