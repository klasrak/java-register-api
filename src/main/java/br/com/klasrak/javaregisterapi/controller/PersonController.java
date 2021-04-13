package br.com.klasrak.javaregisterapi.controller;

import java.time.LocalDate;
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
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Person Controller")
@RequestMapping("/api")
public class PersonController {

    PersonService personService;

    @Autowired
    public PersonController(PersonService personService) {
        this.personService = personService;
    }

    @ApiOperation(value = "Get all persons from database")
    @GetMapping(value = "/persons")
    public List<Person> getAllPersons() {
        return personService.getAllPersons();
    }

    @ApiOperation(value = "Get person by ID")
    @GetMapping(value = "/persons/{id}")
    public Person getPersonById(@PathVariable("id") @Min(1) int id) {
        Person p = personService.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Person with id " + id + " is Not Found"));

        return p;
    }

    @ApiOperation(value = "Create person")
    @PostMapping(value = "/persons")
    public Person addPerson(@Valid @RequestBody Person p) {
        return personService.save(p);
    }

    @ApiOperation(value = "Update person")
    @PutMapping(value = "persons/{id}")
    public Person updatePerson(@PathVariable("id") @Min(1) int id, @Valid @RequestBody Person newP) {
        Person p = personService.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Person with id " + id + " is Not Found"));

        String name = newP.getName() == null ? p.getName() : newP.getName();
        String gender = newP.getGender() == null ? p.getGender() : newP.getGender();
        String email = newP.getEmail() == null ? p.getEmail() : newP.getEmail();
        LocalDate birthdate = newP.getBirthDate() == null ? p.getBirthDate() : newP.getBirthDate();
        String hometown = newP.getHometown() == null ? p.getHometown() : newP.getHometown();
        String nationality = newP.getNationality() == null ? p.getNationality() : newP.getNationality();
        String cpf = newP.getCpf() == null ? p.getCpf() : newP.getCpf();

        p.setName(name);
        p.setGender(gender);
        p.setEmail(email);
        p.setBirthDate(birthdate);
        p.setHometown(hometown);
        p.setNationality(nationality);
        p.setCpf(cpf);

        return personService.save(p);
    }

    @ApiOperation(value = "Delete person")
    @DeleteMapping(value = "/persons/{id}")
    public String deletePerson(@PathVariable("id") @Min(1) int id) {
        Person p = personService.findById(id)
                .orElseThrow(() -> new PersonNotFoundException("Student with " + id + " is Not Found!"));

        personService.deleteById(p.getId());

        return "Person with ID " + id + " is deleted";
    }
}
