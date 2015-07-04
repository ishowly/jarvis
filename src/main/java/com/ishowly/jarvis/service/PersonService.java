package com.ishowly.jarvis.service;

import com.ishowly.jarvis.dao.PersonDao;
import com.ishowly.jarvis.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by zhangdongjie on 15-7-4.
 */
@Service
public class PersonService extends BaseService {

    @Autowired
    private PersonDao personDao;

    public Person getPersonById(long id) {
        Person person = personDao.getPersonById(id);

        return person;
    }

    public int addPerson(Person person){
        if (person != null){
            return personDao.insert(person);
        }else {
            return -1;
        }
    }
}
