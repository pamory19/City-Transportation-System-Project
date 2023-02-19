package com.solvd.citytransportationsystemproject.dao;

import com.solvd.citytransportationsystemproject.IBaseDao;
import com.solvd.citytransportationsystemproject.models.Person;

import java.util.List;

public interface IPersonDao extends IBaseDao<Person> {
    Person getPersonByLastName(String lastName);
    List<Person> getAllPersons();
}
