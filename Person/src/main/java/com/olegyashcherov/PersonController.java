package com.olegyashcherov;

public class PersonController {
    PersonDao dao;

    public PersonController(PersonDao dao) {
        this.dao = dao;
    }

    public boolean chekPersonPresence(PersonEntity person) throws Exception {
        PersonEntity p = dao.getPersonByName(person.getName());
        return p != null;
    }
}
