package com.list.entity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Entity
@Data
@Table(name="manyToOne")
@NoArgsConstructor
public class MToO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String demo;

    @OneToMany(fetch = FetchType.LAZY)
    private List<Student> student;

}
