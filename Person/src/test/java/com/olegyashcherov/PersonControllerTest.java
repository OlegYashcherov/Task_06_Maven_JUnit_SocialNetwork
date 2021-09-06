package com.olegyashcherov;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

public class PersonControllerTest {

    @Mock
    private PersonDao dao;

    private PersonController controller;

    public PersonControllerTest() {
        MockitoAnnotations.initMocks(this);
        this.dao = PersonDao.getInstance();
        this.controller = new PersonController(dao);
    }

    @Test
    public void testChekPersonPresence_Should_Return_True() throws Exception{
        given(dao.getPersonByName("Андрей")).willReturn(new PersonEntity("Андрей"));
        boolean personExists = controller.chekPersonPresence(new PersonEntity("Андрей"));

        assertThat(personExists).isTrue();

//        verify(dao).getPersonByName("Андрей");
    }

    @Test
    public void testChekPersonPresence_Should_Return_False() throws Exception{
        given(dao.getPersonByName("Андрей")).willReturn(null);
        boolean personExists = controller.chekPersonPresence(new PersonEntity("Андрей"));

        assertThat(personExists).isFalse();
    }

    @Test(expected = Exception.class)
    public void testChekPersonPresence_Should_Throw_Exception() throws Exception{
        given(dao.getPersonByName(anyString())).willThrow(Exception.class);
        controller.chekPersonPresence(new PersonEntity("Андрей"));

    }

    @Test
    public void findAllPersons_Contain() throws Exception {
        List<PersonEntity> personList = dao.getAll();
//        System.out.println(personList);
        assertThat(personList).contains(new PersonEntity("Пётр"));
    }
}