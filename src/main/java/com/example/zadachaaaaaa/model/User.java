package com.example.zadachaaaaaa.model;

import lombok.Data;
import javax.persistence.*;

@Entity
@Data
@Table(name = "users")
public class User {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "name")
        private String name;

        @Column(name = "lastname")
        private String lastname;

        @Column(name = "email")
        private String email;
}
