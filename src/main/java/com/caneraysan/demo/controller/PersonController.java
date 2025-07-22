package com.caneraysan.demo.controller;

import com.caneraysan.demo.model.Person;
import com.caneraysan.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping
    public List<Person> getAll() {
        return personService.getAllPersons();
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return personService.savePerson(person);
    }
}