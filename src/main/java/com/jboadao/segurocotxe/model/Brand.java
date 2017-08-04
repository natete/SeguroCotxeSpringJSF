package com.jboadao.segurocotxe.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
public class Brand {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private String name;

    public Brand() {
    }
}
