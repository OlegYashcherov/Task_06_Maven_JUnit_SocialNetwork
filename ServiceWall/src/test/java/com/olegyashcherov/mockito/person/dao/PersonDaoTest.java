package com.olegyashcherov.mockito.person.dao;

import com.olegyashcherov.PersonDao;
import com.olegyashcherov.PersonEntity;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonDaoTest {
    private PersonDao dao;

    @Before
    public void setUp() throws Exception {
        this.dao = PersonDao.getInstance();
    }

    @Test
    public void getPersonByName_Should_Return_True() throws Exception {
        PersonEntity elena = dao.getPersonByName("Елена");

        assertThat(elena).isNotNull();
        assertThat(elena.getName()).isEqualTo("Елена");
    }

    @Test
    public void getPersonByName_Null_Person() throws Exception {
        PersonEntity anna = dao.getPersonByName("Anna");

        assertThat(anna).isNull();
//        assertThat(elena.getName()).isEqualTo("Елена");
    }


}
