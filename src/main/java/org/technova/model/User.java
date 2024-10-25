package org.technova.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Column(name = "cin", nullable = false, unique = true)
    private String cin;

    @Column(name = "nationalite")
    private String nationalite;

    @Column(name = "date_inscription")
    private LocalDate dateInscription;

    @Column(name = "date_expiration")
    private LocalDate dateExpiration;

    @Column(name = "password", nullable = false)
    private String password;

}
