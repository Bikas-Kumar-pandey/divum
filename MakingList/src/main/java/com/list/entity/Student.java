package com.list.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


//MASTER
@Entity
@Data
@NoArgsConstructor
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id ;
    private String name;
    private String country;
    private String subject;


    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private OToO oneToOne;;

    @ManyToOne( cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "manyToOnes")
     private MToO manyToOnes;












//working
    @OneToMany( cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "sid")
    private List<MToM> manyToMany;
    //working
    @OneToMany( cascade = {CascadeType.ALL}, fetch = FetchType.LAZY)
    @JoinColumn(name = "sid")
    private List<Employee> employee;


}
