package br.com.klasrak.javaregisterapi.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.klasrak.javaregisterapi.models.Person;

@Repository
public interface PersonRepository extends JpaRepository<Person, Integer> {
    // Query method
    Optional<Person> findByEmail(String email);
}