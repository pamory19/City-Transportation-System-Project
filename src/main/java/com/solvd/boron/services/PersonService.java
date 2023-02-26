package com.solvd.citytransportationsystemproject.services;

import com.solvd.citytransportationsystemproject.dao.IPersonDao;
import com.solvd.citytransportationsystemproject.dao.mysql.PersonDao;
import com.solvd.citytransportationsystemproject.models.Person;

import java.util.List;

public class PersonService {
    private IPersonDao personDao;

    public PersonService() {
        this.personDao = new PersonDao();
    }

    public Person createPerson(Person person) {
        return personDao.createEntity(person);
    }

    public Person getPersonById(long id) {
        return personDao.getEntityById(id);
    }

    public void updatePerson(Person person) {
        personDao.updateEntity(person);
    }

    public void deletePerson(long id) {
        personDao.deleteEntity(id);
    }

    public List<Person> getAllPersons() {
        return personDao.getAllPersons();
    }

    public Person getPersonByLastName(String lastName) {
        return personDao.getPersonByLastName(lastName);
    }
}
