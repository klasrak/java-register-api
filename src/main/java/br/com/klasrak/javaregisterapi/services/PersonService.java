package br.com.klasrak.javaregisterapi.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.klasrak.javaregisterapi.models.Person;
import br.com.klasrak.javaregisterapi.repository.PersonRepository;

@Service
public class PersonService implements IPerson {

    PersonRepository personRep;

    @Autowired
    public PersonService(PersonRepository personRep) {
        this.personRep = personRep;
    }

    @Override
    public List<Person> getAllPersons() {
        return personRep.findAll();
    }

    @Override
    public Optional<Person> findById(int id) {
        return personRep.findById(id);
    }

    @Override
    public Optional<Person> findByEmail(String email) {
        return personRep.findByEmail(email);
    }

    @Override
    public Person save(Person p) {
        return personRep.save(p);
    }

    @Override
    public void deleteById(int id) {
        personRep.deleteById(id);
    }
}
