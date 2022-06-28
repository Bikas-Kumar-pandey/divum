package com.list.entity;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table(name="OneToOne")
public class OToO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String demos;

    @OneToOne(fetch = FetchType.LAZY)
    private Student student;
}
