package br.com.klasrak.javaregisterapi.services;

import java.util.List;
import java.util.Optional;

import br.com.klasrak.javaregisterapi.models.Person;

public interface IPerson {
    List<Person> getAllPersons();

    Optional<Person> findById(int id);

    Optional<Person> findByEmail(String email);

    Person save(Person p);

    void deleteById(int id);
}
