package com.example.Messages4.services;

import com.example.Messages4.model.Person;
import org.springframework.stereotype.Service;


public interface IPersonService {

    public Iterable<Person> getAllPeople();

    Person findByName(String name);

    Person findByEmail(String email);

    Person savePerson(Person person);
}
