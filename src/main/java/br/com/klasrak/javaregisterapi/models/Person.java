package br.com.klasrak.javaregisterapi.models;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonFormat;

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
@Table(name = "person", uniqueConstraints = { @UniqueConstraint(columnNames = { "cpf", "email" }) })
public class Person implements Serializable {

    private static final long serialVersionUId = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotEmpty(message = "Name is required")
    private String name;

    @Column(nullable = true, name = "gender")
    private String gender;

    @Email
    @Size(max = 255)
    @Column(nullable = true, unique = true)
    private String email;

    @NotEmpty(message = "Birt date is required")
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate birthDate;

    @Column(nullable = true, name = "hometown")
    private String hometown;

    @Column(nullable = true, name = "nationality")
    private String nationality;

    @NotEmpty(message = "CPF is required")
    private String cpf;

    @PrePersist
    @PreUpdate
    private void prepareData() {
        this.email = email == null ? null : email.toLowerCase();
    }

}
