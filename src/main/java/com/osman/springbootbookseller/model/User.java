package com.osman.springbootbookseller.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data @AllArgsConstructor @NoArgsConstructor
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Column(unique = true, nullable = false, length = 100)
    private  String username;

    @Column(nullable = false, length = 100)
    private  String password;

    @Column(nullable = false, length = 100)
    private  String name;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdTime;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private  Role role;

    @Transient
    private String token;
}
