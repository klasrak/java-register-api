package br.com.klasrak.javaregisterapi.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

@Getter
@Setter
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "person")
public class Person implements Serializable {

    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name is required")
    private String name;

    @Column(nullable = true, name = "gender")
    private String gender;

    @Column(nullable = true, name = "email")
    @Email(message = "E-mail should be valid")
    private String email;

    @NotEmpty(message = "Birt date is required")
    private LocalDateTime birthDate;

    @Column(nullable = true, name = "hometown")
    private String hometown;

    @Column(nullable = true, name = "nationality")
    private String nationality;

    @NotEmpty(message = "CPF is required")
    private String cpf;

}
