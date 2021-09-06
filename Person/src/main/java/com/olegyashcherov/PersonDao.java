package com.olegyashcherov;

import com.olegyashcherov.dao.Dao;

import java.util.ArrayList;
import java.util.List;

public class PersonDao implements Dao<PersonEntity> {

    private List<PersonEntity> personList;

    private static PersonDao instance;
    private static final Object LOCK = new Object();

    public PersonDao() {
        personList = new ArrayList<>();
        personList.add(new PersonEntity("Андрей"));
        personList.add(new PersonEntity("Елена"));
        personList.add(new PersonEntity("Пётр"));
    }

    public static PersonDao getInstance() {
        synchronized (LOCK) {
            if (instance == null) {
                instance = new PersonDao();
            }
        }
        return instance;
    }

    public PersonEntity getPersonByName(String name) throws Exception {
        return personList.stream().filter(p -> p.getName().equals(name)).findAny().orElse(null);
    }

    @Override
    public List<PersonEntity> getAll() {
        return personList;
    }

    @Override
    public PersonEntity getById(long l) {
        return null;
    }

    @Override
    public long insert(PersonEntity personEntity) {
        return 0;
    }

    @Override
    public void delete(PersonEntity personEntity) {

    }
}
