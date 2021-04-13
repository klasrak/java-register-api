package br.com.klasrak.javaregisterapi.controller;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.klasrak.javaregisterapi.exceptions.PersonNotFoundException;
import br.com.klasrak.javaregisterapi.models.Person;
import br.com.klasrak.javaregisterapi.services.PersonService;

@RestController
@RequestMapping("/api")
public class PersonController {

    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @GetMapping(value = "/persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @GetMapping(value = "/persons/{id}")
    public Person getPersonById(@PathVariable("id") @Min(1) int id) {
        Person p = personService.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Person with id " + id + " is Not Found"));
    }

    @PostMapping(value = "/persons/{id}")
    public Person addPerson(@Valid @RequestBody Person p) {
        return personService.save(p);
    }

    @PutMapping(value = "persons/{id}")
    public Person updatePerson(@PathVariable("id") @Min(1) int id, @Valid @RequestBody Person newP) {
        Person p = personService.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Person with id " + id + " is Not Found"));

        p.setName(newP.getName());
        p.setGender(newP.getGender());
        p.setBirthDate(newP.getBirthDate());
        p.setHometown(newP.getHometown());
        p.setNationality(newP.getNationality());
        p.setCpf(newP.getCpf());

        return personService.save(p);
    }

    @DeleteMapping(value = "/persons/{id}")
    public String deletePerson(@PathVariable("id") @Min(1) int id) {
        Person p = personService.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Student with " + id + " is Not Found!"));

        personService.deleteById(p.getId());

        return "Person with ID " + id + " is deleted";
    }
}
