package com.loiane.crudspring.model;

import lombok.Data;
import javax.persistence.*;

@Data
@Entity
public class Course {

    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "nome", nullable = false, length = 200)
    private String name;

    @Column(name = "categoria", nullable = false, length = 20)
    private String category;
}
